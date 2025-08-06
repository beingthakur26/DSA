package com.singh;

public class Find_number {
	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5,6,7,8,9};
		
		int key = 8;
		
		for(int i = 0 ; i<arr.length; i++) {
			if(arr[i]== key)
			{
				System.out.println("The Number is present");
			}
		}
	}
}

