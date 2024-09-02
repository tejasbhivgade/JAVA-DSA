package com.Tejas.Array;

import java.util.Arrays;

public class SelectionSort {
	
	public static void printArray(int arr[]) {
		
		for (int i = 0; i < arr.length-1; i++) 
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if (arr[i] > arr[j]) 
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
	}
	

	public static void main(String[] args) {
		
		int arr [] = {80,40,20,10,30,70,90,60,50};
		
		System.out.println("Array after sorting : "+Arrays.toString(arr));

		printArray(arr);
		
		System.out.println("Array after sorting : "+Arrays.toString(arr));

	}

}
