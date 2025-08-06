package com.singh;

import java.util.LinkedList;
import java.util.jar.Attributes.Name;

public class SimpleLinkedList{

	public static void main(String[] args) {
		
		LinkedList<Integer>  numbers = new LinkedList<Integer>();
		LinkedList<String> name = new LinkedList<String>();
		numbers.add(10);
		numbers.add(20);
	    numbers.add(30);
	    numbers.add(40);
	    numbers.add(50);
	    numbers.add(80);
	    
	    
	    name.add("Ronak The Settler");
	    name.add("Atharva The Rizzler");
	    name.add("Ananya");
	    name.add("Sammrudhi");
	    
	    System.out.println(numbers);
	    System.out.println(name);
	}

}
