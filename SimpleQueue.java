package com.singh;

import java.util.LinkedList;
import java.util.Queue;

public class SimpleQueue {

	public static void main(String[] args) {
		Queue<String> Names = new LinkedList<String>();
		
	Names.add("Ronak The Shocker");
	Names.add("Atharva The Rizzler");
	Names.add("Annanya The HeartBreaker");
    Names.add("Kedar The Noobda");
    
    System.out.println(Names);
    System.out.println(Names.peek());
    
	}
	

}
