/*
Find the Sum of First N Natural Numbers in Java
Given an integer input of N, the objective is to find the sum of all the natural numbers until the given input integer. 
To do so we can use different approaches to write the Java code and some such methods are mentioned below,

Method 1: Using for Loop
Method 2: Using Formula for the Sum of Nth Term
Method 3: Using Recursion
*/

import java.util.*;
class SumNnums{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int sm=0;
		System.out.println("Enter number:");
		int n = sc.nextInt();
		
		
		for(int i=0;i<=n;i++)
		{
			sm += i;
		}
		
		System.out.println("Sum is"+sm);
		
		System.out.println("Second Method:");
		
		System.out.println ( n*(n+1)/2);
		
		System.out.println("Third Method:");
		int sum = getsum(n);
		
		System.out.println(sum);
	}
	
	public static int getsum(int n)
		{
			
			if(n == 0)
				return n;
			
			return n + getsum(n - 1);	
		}
	
}