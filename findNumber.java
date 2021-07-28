package com.algorithm;
import java.util.Scanner;

public class findNumber {

   public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter start Number");
	        int low = s.nextInt();
	        System.out.println("Enter High Number");
	        int high = s.nextInt();
	        System.out.println("Select any number between "+low+" to "+high+" in your mind");
	        
	        while (low<high){
	            int d = (low+high)/2;
	            System.out.println("Select-1: If your Num is less-than "+d);
	            System.out.println("Select-2: If your Num is greater-than "+d);
	            System.out.println("Select-3: If your Num is equal to "+d);
	            int option = s.nextInt();
	            System.out.println(option);
	            switch (option){
	                case 1:
	                    high = d;
	                case 2:
	                    low = d;
	                case 3:
	                    System.out.println("Your Selection is "+d);
	                    return;
	            }
	        }
	    }
	}