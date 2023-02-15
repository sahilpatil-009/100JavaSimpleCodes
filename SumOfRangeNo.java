/*
Given the range as integer input, the objective is to find the Sum of all the Numbers that lay in the given interval using different methods.
 To do so we basically iterate from the base interval to the final interval and keep adding the number. 
 Here are some of the methods to solve the above mentioned problem in Java Language.

Method 1: Using Brute Force
Method 2: Using the Formula
Method 3: Using Recursion
*/

import java.util.*;
class RangeSum{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int sum=0;
		
		System.out.println("Enter A:");
		int a = sc.nextInt();
		
		System.out.println("Enter B:");
		int b = sc.nextInt();
		
		System.out.println("1st Methid Using Loop->");
		for(int i =a;i<=b;i++)
		{
			sum += i; 
		}
		
		System.out.println("Sum is:"+sum);
		
		System.out.println("2nd Method Using Formula->");
		
		int sumf = b*(b+1)/2 - a*(a+1)/2 + a;
		System.out.println("Sum is:"+sumf);
		
		System.out.println("3rd Method Recursion->");
		int sumr = getsum(0,a,b);
		
		System.out.println("sum is:"+sumr);
	}
	
	public static int getsum(int sum,int a,int b)
	{		
		if (a > b)
			return sum;
		  
		return a + getsum(sum,a + 1, b);
	}
}