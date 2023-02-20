/*Find the Greatest of the Two Numbers in Java
Given two integer input Number1 and Number2, the objective is to write a Java code to compare both the Numbers and Find the Greatest of the Two Numbers. To do so we’ll use if-else statements and print the output. Some methods to solve the above-mentioned Problem are given below.

Method 1: Using if-else Statements
Method 2: Using Ternary Operator
Method 3: Using inbuilt max Function
*/

import java.util.*;

class GreatNo{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st No:");
		int a = sc.nextInt();
		
		System.out.println("Enter 2nd No:");
		int b = sc.nextInt();
		
		System.out.println("1st Method ! Using If-else Method");
		
		if(a==b)
		{
			System.out.println("Both Numbers Are Equal");
			return;
		}
		else if(a>b)
		{
			System.out.println(a+" is Greater");
		}
		else
		{
			System.out.println(b+" is Greater");
		}
		
		System.out.println("Second Method ! Using Ternary Operator ");
		
		int temp = a > b ? a : b;
		
		System.out.println(temp+" is Greater !");
		
		System.out.println("Third Method !Using Inbuilt Max ");
		
		System.out.println(Math.max(a, b) + " is greater");
	}
}