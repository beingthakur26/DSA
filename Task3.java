package com.singh;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		
		//Task 1 
		for(int i = 1; i<=10; i++)
		{
			System.out.println(i);
		}
		
		//Task 2 
		int [] arr = {1,2,3,4,5,6,7,8,9};
		for (int j = 0; j<arr.length; j++)
		{
			if(arr[j]%2==0) {
				System.out.println(arr[j]);
			}
		}
		
		//Task 3 
		
		int [] arr1 = {1,2,3,45,6,70};
		int sum = 0;
		for(int i = 0; i<arr1.length; i++) {
			sum += arr1[i];
			System.out.println(sum);
		}
		
		//Task 4
		
		int [] arr2 = {11,25,4,88,97,87,56};
		int max = arr2[0]; 
		
		for(int k =0; k<arr2.length; k++) {
			if (arr2[k]> max) {
				max = arr2[k];
			}
			
		}
		System.out.println("The greater Number is "+ max);
		
		
		
		
		
		//Task 5 
		int [] arr3 = {1,2,3,4,5,6,7,8,9};
		int count = 0; 
		for (int j = 0; j<arr3.length; j++)
		{
			if(arr[j]%2!=0) {
				System.out.println(arr3[j]);
			}
			count ++;
		}
		System.out.println("The total numbers present is " + count);
		
		
		//Task 6 
		
		System.out.println("Enter a Number ");
		Scanner sc = new Scanner(System.in);
		int sum1 = sc.nextInt();
		if (sum1<=-1) {
			System.out.println("Entter a valid number ");
		}
		
		else {
			for (int l= 0; l<= sum1; l++)
			{
				if(sum1 % 2 == 0 )
				{
					System.out.println("Not a Prime number");
				}
			}
			System.out.println("Prime Number");
		}
		
		
		//Task 7 
		int [] rev = {10,20,50,30,80,};
		System.out.print("Orignal Array" );
		for(int v=0 ; v<rev.length; v++)
		{
			System.out.println(rev[v]);
		}
		
		for(int p= rev.length -1; p>=0; p--)
		{
			System.out.print(rev[p]);
		}
		
		//Task 8
		
		int sum2 = 0; 
		int [] avg1 = {10,20,50,60,90,80};
		for(int h = 0; h<avg1.length; h++) {
			sum2 += avg1[h];
		}
		int avg =  sum2 / avg1.length;
		System.out.println("Average of all elements is "+ avg);
			
		
		//Task 9 
		int [] numbers1 = {10,20,20,30,40,50,60,70,80,90,70,70,};
		int target = 70;
		int count1 = 0;
		
		for (int i = 0; i < numbers1.length; i++) {
            if (numbers1[i] == target) {
                count1++;
            }
        }
		
		System.out.println("Number " + target + " Appears " + count1 + " times in the array");
		
		
		
		
		//Task 10
        int[] numbers = {3, 5, 3, 7, 3, 9, 5};
        int search = 7;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == search) {
                System.out.println("Yes, " + search + " is in the array.");
                return;
            }
           
        }
        System.out.println("No, " + search + " is not in the array.");
		
	}
}
