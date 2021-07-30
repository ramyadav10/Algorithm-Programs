package com.algorithm;

import java.util.Arrays;
public class Anagram {

    public static void main(String[] args) {
    	String str1="EarTh";
    	String str2="HeaRt";
        //change to arrays
        char arr1[] = str1.toLowerCase().toCharArray();
        char arr2[] = str2.toLowerCase().toCharArray();

        if (arr1.length != arr2.length){
            System.out.println("Length of the String is Different");
        }else {
        //Sorting arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        //checking equal
        	if (Arrays.equals(arr1, arr2)) {
        		System.out.println("String is Anagram");
        	}else {
        		System.out.println("String is not Anagram");
        	}
        }
}
}