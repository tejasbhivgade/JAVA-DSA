package com.Tejas.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayLists {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		
		List<Integer> ls = new ArrayList<>();
		
		//Adding element
		list.add(5);
		list.add(2);
		list.add(8);
		list.add(1);
		list.add(7);
		
		System.out.println(list);
		
		//Get element
		int element = list.get(1);
		System.out.println(element);
		
		//Add element in between
		list.add(1, 9);
		System.out.println(list);
		
		//Set element 
		list.set(3, 4);
		System.out.println(list);
		
		//Delete element
		list.remove(4);
		System.out.println(list);
		
		//Size of arraylist
		int size = list.size();
		System.out.println(size);
		
		//loop
		for (int i = 0; i < list.size(); i++) 
		{
			System.out.print(list.get(i));
		}
		System.out.println();
		
		//Sorting
		Collections.sort(list);
		System.out.println(list);
		
		
	}

}
