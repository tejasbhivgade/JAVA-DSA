package com.Tejas.Array;

import java.util.Arrays;

public class BubbleSort {
	
	public static void printArray(int arr[]) {
		
		int swap_count = 0, passes_count = 0;
		
		for (int i = 0; i < arr.length - 1; i++) 
		{
			passes_count++;
			for (int j = 0; j < arr.length - 1; j++) 
			{
				if (arr[j]>arr[j+1]) 
				{
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swap_count++;
				}
			}
		}
		System.out.println("Number of passes : "+passes_count);
		System.out.println("Number od swaps : "+swap_count);
		
	}

	public static void main(String[] args) {

		int arr[] = {50,90,60,70,10,30,40};
		
		System.out.println("Array before sorting : "+Arrays.toString(arr));
	
		printArray(arr);
		
		System.out.println("Array after sorting : "+Arrays.toString(arr));

	}

}
