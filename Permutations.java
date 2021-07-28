package com.algorithm;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
    	String str1 = "RADAR";
        Iteration(str1);
    }
    
	public static void Iteration(String str1) {
        ArrayList<String> arrayl = new ArrayList<>();
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str1.length(); j++) {
            	char[] ch = str1.toCharArray();
                char temp;
                temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
            	System.out.println(ch);
            }
        }
      
    }

}