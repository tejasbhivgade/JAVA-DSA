package com.Tejas.Array;

import java.util.Scanner;

public class Linear2DSearch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of rows and cols : ");
		
		int rows = sc.nextInt();
		
		int cols = sc.nextInt();
		
		System.out.println("Enter the element in rows and cols in array : ");
		
		int arr[][] = new int[rows][cols];
		
		for (int i = 0; i < rows; i++) 
		{
			for (int j = 0; j < cols; j++) 
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter the element whose index you want : ");
		
		int x = sc.nextInt();
		
		boolean status = false;
		
		for (int i = 0; i < rows; i++) 
		{
			for (int j = 0; j < cols; j++) 
			{
				if (arr[i][j]==x) 
				{
					System.out.println(x+" found at location (" + i + "," + j + ")");
					status = true;
				}
			}
			System.out.println();
		}
		
		if (status==false) 
		{
			System.out.println("Element not found");
		}
		
	}

}
