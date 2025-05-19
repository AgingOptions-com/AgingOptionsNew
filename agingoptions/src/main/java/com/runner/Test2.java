package com.runner;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test2 {

	public static void main(String[] args) {

		int arr[]= {9,3,4,6,7,1,3,0,3,2,3,6,8};
		int  result[]=new int [arr.length];
		int index=0;

		for(int i=0; i<=arr.length-1; i++) {
			if(arr[i]!=3) {
				result[index++]= arr[i]; 
			}
		}

		while(index<result.length) {
			result[index++]=3;
		}

		for(int i=0; i<=result.length-1; i++) {
			System.out.print(result[i]+" ");
		}


	}

}
