package com.runner;

public class Test {

	public static void main(String[] args) {
		
		
		  
		        int[] arr = {0, 1, 0, 3, 12};
		        int[] result = new int[arr.length];
		        int index = 0;

		        // Copy non-zero elements
		        for (int i = 0; i < arr.length; i++) {
		            if (arr[i] != 0) {
		                result[index++] = arr[i];
		            }
		        }

		        // Print result
		        for (int i = 0; i < result.length; i++) {
		            System.out.print(result[i] + " ");
		        }
		    }
		

		
		
		
	}
	

