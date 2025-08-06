package com.singh;

public class DeleteArray {

	public static void main(String[] args) {
		int [] num = {10, 20, 30, 40, 50, 60, 70};
		int delnum = 1; 
		
		for (int i = delnum; i < num.length - 1; i++) {
			num[i] = num[i + 1]; 
		}

		for (int i = 0; i < num.length - 1; i++) {
			System.out.println(num[i]);
		}
	}
}
