/*Find the Fibonacci Series up to Nth Term in Java Language
Given an integer input for the Nth value, the objective is to Find the Fibonacci Series up to the Nth term using Loops and recursion in Java Language. To do so we’ll use the following methods,

Method 1: Using Iteration
Method 2: Using Recursion
Method 3: Using Formula */

import java.util.*;

class Fibonacciseries{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int a=0,b=1;
		
		System.out.println("Enter Number:");
		int num = sc.nextInt();
		int nextno=0;
		System.out.print(a+","+""+b+",");
		for(int i=2;i<num;i++)
		{
			nextno = a+b;
			a=b;
			b=nextno;
			
			System.out.print(""+nextno+",");
		}
	}
}