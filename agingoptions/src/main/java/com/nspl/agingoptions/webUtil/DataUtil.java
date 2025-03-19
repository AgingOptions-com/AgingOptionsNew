package com.nspl.agingoptions.webUtil;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataUtil {

	public Map<String, String> getTestCaseData(String tcID) {
		Workbook wbook=null;
//
		try {
			InputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\TestData.xlsx");
			wbook= new XSSFWorkbook(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

		Sheet sheetObj=wbook.getSheet("DataSheet");
		int tcRowNumber=getRowNumberByTestCaseID(sheetObj, tcID);		
		Row rowTcObj=sheetObj.getRow(tcRowNumber);
		int cellCount=rowTcObj.getLastCellNum();
		Map<String, String> dataMap=new HashMap<String, String>();
		for(int i=3; i<=cellCount-1;i=i+2) {
			String cellDataKey=getCellData(rowTcObj, i);
			String cellDataValue=getCellData(rowTcObj, i+1);
			dataMap.put(cellDataKey, cellDataValue);
		}
		return dataMap;
	}

	public String getCellData(Row rowObj, int cellNumber) {
		String data=null;
		Cell cellObj=rowObj.getCell(cellNumber, MissingCellPolicy.CREATE_NULL_AS_BLANK);
		if(cellObj.getCellType()==CellType.STRING) {
			data=cellObj.getStringCellValue();
		}else if(cellObj.getCellType()==CellType.NUMERIC) {
			Double dbl=cellObj.getNumericCellValue();
			Integer intData=dbl.intValue();
			data=intData.toString();
		}
		return data;
	}


	public int getRowNumberByTestCaseID(Sheet sheetObj, String tcID) {
		int tcRowNumber=-1;
		int rowCount=sheetObj.getLastRowNum();
		for(int i=1; i<=rowCount;i++) {
			Row rowObj=sheetObj.getRow(i);
			Cell cellObj=rowObj.getCell(2);
			String cellData=cellObj.getStringCellValue();
			//System.out.println(cellData);
			if(cellData.trim().equalsIgnoreCase(tcID)) {
				tcRowNumber=i;
				break;
			}
		}
		return tcRowNumber;
	}


	public List<Map<String, String>> getAllTestCaseData(String tcID) {
		Workbook wbook=null;
		try {
			InputStream fis=new FileInputStream("src\\main\\resources\\TestData.xlsx");
			wbook= new XSSFWorkbook(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Sheet sheetObj=wbook.getSheet("DataSheet");

		List<Integer> allTcRowNumbersList=getAllRowNumbersByTestCaseID(sheetObj, tcID);

		List<Map<String, String>> listOfRowDataMap=new ArrayList<Map<String, String>>();
		for(int j=0;j<=allTcRowNumbersList.size()-1; j++) {
			int tcRowNumber=allTcRowNumbersList.get(j);
			Row rowTcObj=sheetObj.getRow(tcRowNumber);
			int cellCount=rowTcObj.getLastCellNum();
			Map<String, String> dataMap=new HashMap<String, String>();
			for(int i=3; i<=cellCount-1;i=i+2) {
				String cellDataKey=getCellData(rowTcObj, i);
				String cellDataValue=getCellData(rowTcObj, i+1);
				dataMap.put(cellDataKey, cellDataValue);
			}
			listOfRowDataMap.add(dataMap);	
		}
		return listOfRowDataMap;
	}

//	public List<Integer> getAllRowNumbersByTestCaseID(Sheet sheetObj, String tcID) {
//		List<Integer> allTcRowNumbers=new ArrayList<Integer>();
//		int rowCount=sheetObj.getLastRowNum();
//		for(int i=1; i<=rowCount;i++) {
//			Row rowObj=sheetObj.getRow(i);
//			Cell cellObj=rowObj.getCell(2);
//			String cellData=cellObj.getStringCellValue();
//			System.out.println(cellData);
//			if(tcID.contains(cellData)) {
//				allTcRowNumbers.add(i);
//			}
//		}
//		return allTcRowNumbers;
//	}
	public List<Integer> getAllRowNumbersByTestCaseID(Sheet sheetObj, String tcID) {
	    List<Integer> allTcRowNumbers = new ArrayList<>();
	    int rowCount = sheetObj.getLastRowNum();
	    for (int i = 1; i <= rowCount; i++) {
	        Row rowObj = sheetObj.getRow(i);
	        if (rowObj != null) {
	            Cell cellObj = rowObj.getCell(2);
	            if (cellObj != null) {
	                String cellData = cellObj.getStringCellValue();
	                if (tcID.equals(cellData)) {
	                    allTcRowNumbers.add(i);
	                }
	            } else {
	            }
	        } else {
	        }
	    }
	    return allTcRowNumbers;
	}



}
