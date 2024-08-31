package com.Tejas.Array;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array : ");
		
		int size = sc.nextInt();
		
		int arr[] = new int [size];
		
		System.out.println("Enter the element of arrays : ");
		
		for (int i = 0; i < size; i++) 
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the element whose index you want : ");
		
		int x = sc.nextInt();
		
		boolean status = false;
		
		for (int i = 0; i < arr.length ; i++) 
		{
			if (arr[i]==x) 
			{
				System.out.println(x+" found at index : "+i);
				status =true;
			}
		}
		
		if (status==false) 
		{
			System.out.println("Element not found");
		}
		
	}

}
