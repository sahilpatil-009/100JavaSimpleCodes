/*
Find the Reverse of a Number in Java Language
Given an integer input as number, the objective is Find the Reverse of a Number in Java Language. 
To do so we usually break down the number into its individual digits and then rearrange them in reverse order.
Here are a few methods to solve the above-mentioned problem in Java Language,

Method 1: Using while loop
Method 2: Using for loop
Method 3: Using Recursion I
Method 4: Using Recursion II
Method 5: Taking care of negative numbers in case of method 4
Let’s implement the above-mentioned methods in the upcoming sections.
*/

import java.util.*;
class Reversenum{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int reverse =0;
		int rem = 0;
		int rno=0;
		
		System.out.println("Enter Number:");
		int n = sc.nextInt();
		
		while(n!=0)
		{
			rem = n %10;
			reverse = reverse*10 + rem;
			
			n = n /10;
		}
		
		System.out.println("Reverse Number is:"+reverse);
		
	}
}