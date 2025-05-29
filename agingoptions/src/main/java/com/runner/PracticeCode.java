package com.runner;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PracticeCode {

	public static void main(String[] args) {
		removeDuplicateCharacterFromString();
	}

	public static void removeDuplicateElementFromArrayList() {
		List<String> listWithDuplicates = new ArrayList<>();
		listWithDuplicates.add("1");
		listWithDuplicates.add("2");
		listWithDuplicates.add("3");
		listWithDuplicates.add("4");
		listWithDuplicates.add("3");
		listWithDuplicates.add("4");
		Set withoutDuplicate = new LinkedHashSet(listWithDuplicates);
		System.out.println(withoutDuplicate);
	}

	public static void removeDuplicateElementFromArray() {

		int[] ele = { 1, 2, 3, 4, 5, 6, 5, 3, 2, 1 };
		Set removeDuplicateEle = new LinkedHashSet();

		for (int i = 0; i <= ele.length - 1; i++) {
			int element = ele[i];
			removeDuplicateEle.add(element);
		}
		System.out.println(removeDuplicateEle);
	}

	public static void removeDuplicateCharacterFromString() {
		String name = "Programming";
		char[] nameArr = name.toCharArray();
		Set<Character> finalResult = new LinkedHashSet();
		for (int i = 0; i <= nameArr.length - 1; i++) {
			finalResult.add(nameArr[i]);
		}
		StringBuffer req = new StringBuffer();
		for (char r : finalResult) {
			req.append(r);
		}
		System.out.println(req);
	}
	
	
	
	
	
}
