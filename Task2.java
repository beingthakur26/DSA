package com.singh;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Task2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> studentMap = new HashMap<>();
        Stack<String> nameStack = new Stack<>();

        System.out.println("Enter roll number and name for 3 students:");

        for (int i = 1; i <= 3; i++) {


            System.out.print("Enter Roll Number for Student " + i + ": ");
            int rollNumber = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Enter Name for Student " + i + ": ");
            String studentName = sc.nextLine();
            
            studentMap.put(rollNumber, studentName);
            nameStack.push(studentName);
        }
        System.out.println("\nAll Students (Roll Number → Name):");
        System.out.println(studentMap);
        String lastStudent = nameStack.peek(); 
        System.out.println("Last student entered: " + lastStudent);
        sc.close();
    }
}
