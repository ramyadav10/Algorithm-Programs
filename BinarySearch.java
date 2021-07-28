package com.algorithm;


import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;


public class BinarySearch {
    public static void main(String[] args) {
        String[] days = { "jethalal", "daya", "sunder", "tapu", "mehta", "babitaji"};
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Name: ");
        String sh=s.next();
        int i = 0;
        	
        while(i<days.length) {
        	if(sh.contentEquals(days[i])) {
        		System.out.println("Name Found in the List at Index: "+i);
        		break;
        	}
  
        	if(i==5) {
        		System.out.println("Name Not Found");	
        	}
        i++;
        }
        
    }
}