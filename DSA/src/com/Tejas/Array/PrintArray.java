package com.Tejas.Array;

import java.util.Arrays;
import java.util.Scanner;

public class PrintArray {

	public static void main(String[] args) {
		
		int arr[]= {6,5,8,9,3,4,2,1,7};
		

		//======================== Approach 1 : Using tostring ==============================
		
		/*System.out.println(Arrays.toString(arr));*/
		
		
		//======================== Approach 2 : Using for loop ==============================
		
		/*for (int i = 0; i < arr.length; i++) 
		{
			System.out.println(arr[i]);
		}*/
		
		
		//======================== Approach 3 : Using for each loop ==============================
		
		for (int i : arr) 
		{
			System.out.println(+i);
		}

	}

}
