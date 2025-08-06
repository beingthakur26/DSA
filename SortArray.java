package com.singh;

import java.util.ArrayList;
import java.util.Collections;

public class SortArray {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(30);
		numbers.add(20);
		numbers.add(50);
		
		System.out.println(numbers);// print default array
		Collections.sort(numbers);  
		System.out.println(numbers);// print the sorted array
		Collections.reverse(numbers);
		System.out.println(numbers); // print the sorted array in reverse order 
	}

}
