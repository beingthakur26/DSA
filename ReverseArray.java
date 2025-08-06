package com.singh;

public class ReverseArray {
	public static void main(String[] args) {
		String [] arr = {"Jhon ","Alice", "Jack","Smith"};
		System.out.println("The array before Reverse");
		//display the array
		for(int i = 0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		// Reverse the array
		System.out.println("The Array after Reverse");
		for(int i = arr.length-1; i>= 0; i--) {
			System.out.println(arr[i]);
		}
	}
}

