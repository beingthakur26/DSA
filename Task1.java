package com.singh;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		HashSet<String> FS = new HashSet<String>();
		LinkedList<String> numbers = new LinkedList<String>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 5 Fruits");
		for (int i = 0; i<5; i++) {
			String Fruit = sc.nextLine();
			
			if(!FS.contains(Fruit)) {
				FS.contains(Fruit);
				numbers.add(Fruit);
		    	
				
			}
		}
		
		System.out.println("Fruits in Basket" + " " + FS);
		System.out.println("Fruit Count:" + " " + numbers.size()); 
	}

}

