package com.algorithm;

import java.util.ArrayList;

public class BallancedParenthesis {

	static Character stack[]=new Character[1];
	static int top=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BallancedParenthesis bp=new BallancedParenthesis();
		String str="(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)"; 
		char[] ch = new char[str.length()];
		for (int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(c == '(') {		
				bp.pushToStack(c);
			}else if(c == ')') {
				if(stack[top] != null) {
					bp.pop(c);
				}else{
					System.out.println("lost");
					stack[top]='c';
					break;
				}
			}else {}
		}
		
		if(stack[top] == null) {
			System.out.println("Arithmetic Expression is balanced ");
		}else {
			System.out.println("Arithmetic Expression is Not Balanced");
		}
		
}

	public void pushToStack(char c) {
			stack[top]=c;		
	}

	public void pop(char c) {
		char data=c; 
		stack[top]=null; 		
	}
}
