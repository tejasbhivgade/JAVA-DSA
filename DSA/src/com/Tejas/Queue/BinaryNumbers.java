package com.Tejas.Queue;

	import java.util.LinkedList;
	import java.util.Queue;

	public class BinaryNumbers {

	    public static String[] generateBinaryNumbers(int n) {
	        String[] binaryNumbers = new String[n];

	        Queue<String> q = new LinkedList<>();
	        q.offer("1");
  
	        for (int i = 0; i < n; i++) {
	        	binaryNumbers[i] = q.poll();
	            
	      String n1 = binaryNumbers[i]+"0";
	      String n2 = binaryNumbers[i]+"1";

	      q.offer(n1);
	      q.offer(n2);
	        }

	        return binaryNumbers;
	    }

	    public static void main(String[] args) {
	        
	        int n = 100; // Number of binary numbers to generate
	        String[] binaryNumbers = BinaryNumbers.generateBinaryNumbers(n); // Call the static method

	        // Print the binary numbers stored in the array
	        for (String binary : binaryNumbers) {
	            System.out.println(binary);
	        }
	    }
	}

