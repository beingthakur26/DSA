package com.singh;

//
//public class Merge_sort {
//	static void merge_sort (int[] arr,int left, int mid, int right) {
//		
//		int n1 = mid-left+1;
//		int n2 = right-mid;
//		
//		int[] L = new int[n1];
//		int[] R = new int[n2];
//		
//		for(int i = 0; i < n1; i++)
//			L[i] = arr[left+i];
//		
//		
//		for(int j = 0; j < n2; j++)
//			R[j] = arr[mid + 1 + j];
//		
//		int i = 0, j= 0;
//		int k = left;
//		
//		while (i < n1 && j < n2) {
//	            if (L[i] <= R[j]) {
//	                arr[k] = L[i];
//	                i++;
//	            } else {
//	                arr[k] = R[j];
//	                j++;
//	            }
//	            k++;
//	        }
//		
//		 while (i < n1) {
//	            arr[k] = L[i];
//	            i++;
//	            k++;
//	        }
//		 
//		 while (j < n2) {
//	            arr[k] = R[j];
//	            j++;
//	            k++;
//	        }
//		 
//		static void merge_sort(int[] arr, int left, int right) {
//			if (left<right) {
//				int mid = (left <right) / 2;
//				merge_sort(arr, left, mid);
//				merge_sort(arr, mid + 1, right);
//				
//				merge(arr, left, mid ,right);
//			}
//		}
//		
//		public static void main(String[] args) {
//			int[] numbers = {2, 3, 9, 5, 4, 8};
//			System.out.println("Original Array");
//			for(int num : numbers) {
//				System.out.println(num + " ");
//			}
//		}
//	
//}



public class Merge_sort {
    
   
    static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to left array
        for(int i = 0; i < n1; i++)
            L[i] = arr[left + i];

       
        for(int j = 0; j < n2; j++) 
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Recursive merge sort method
    static void merge_sort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;  
            merge_sort(arr, left, mid);
            merge_sort(arr, mid + 1, right);

            merge(arr, left, mid, right); 
        }
    }

    public static void main(String[] args) {  
        int[] numbers = {2, 3, 9, 5, 4, 8};
        
        System.out.println("Original Array:");
        for(int num : numbers) {
            System.out.print(num + " "); 
        }
        System.out.println();  
        
    
        merge_sort(numbers, 0, numbers.length - 1);
        
        System.out.println("Sorted Array:");
        for(int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}  

 