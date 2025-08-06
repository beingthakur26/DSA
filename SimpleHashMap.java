package com.singh;

import java.util.HashMap;

public class SimpleHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> studentList = new HashMap<Integer, String>();
		
		studentList.put(1, "Eminem");
		studentList.put(2, "Raftar");
		studentList.put(3, "Raftar Pajii");
		studentList.put(4, "Karan Aujla");
		
		System.out.println(studentList);

	}

}
