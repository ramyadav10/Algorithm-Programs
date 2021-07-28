package com.algorithm;

public class InsertionSort {

	public static void main(String[] args) {
		int[] array= {34, 23, 56, 42, 45};
		insertionSort(array);
	}
	static void insertionSort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
        	int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1]= arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    	    for (int k = 0; k <= n; ++k) {
            System.out.print(arr[k] + " ");
 
            System.out.println();
    	    }
	}
}
