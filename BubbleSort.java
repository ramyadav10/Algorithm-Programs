package com.algorithm;

import java.lang.reflect.Array;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {34,23,56,42,45};
		insertionSort(array);
	}
	
	public static void insertionSort(int []array) {
		int n=array.length;
		
		for (int i=0;i<n;i++) {
			for (int j=0;j<n-1;j++) {
				
				if(array[j]>array[j+1]) {
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					
				}
				
			}
			System.out.println(array[i]);	
		}
	}
}
