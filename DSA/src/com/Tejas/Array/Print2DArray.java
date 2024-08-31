package com.Tejas.Array;

import java.util.Scanner;

public class Print2DArray {

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
		
		for (int i = 0; i < rows; i++) 
		{
			for (int j = 0; j < cols; j++) 
			{
				System.out.print("The 2D arrays is "+arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
