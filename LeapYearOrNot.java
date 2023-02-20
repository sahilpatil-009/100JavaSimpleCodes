/*
Check Whether or Not the Year is a Leap Year in Java
Given an integer input for the year, the objective is to check whether or not the user given input year is a Leap year or not. 
In order to do so we check if the integer input satisfies the conditions for a leap year mentioned below. 
Therefore, we write a Java code to check and tell if it’s a leap year or not. Some of the methods to check for leap year are mentioned below

Method 1: Using if-else Statements 1
Method 2: Using if-else Statements 2
Method 3: Using Ternary Operator
Method 4: Bonus Boolean method
*/

import java.util.*;
class leapYear{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Year:");
		int year = sc.nextInt();
		
		System.out.println("1st method ");
		if(year%400 == 0)
		{
			System.out.println(year+" is Leap Year !");
		}
		else if(year % 4 == 0  && year % 100 != 0)
		{
			System.out.println(year+" is Leap Year !");
		}
		else
		{
			System.out.println(year+" is not Leap Year !");
		}
		
		System.out.println("2nd Method !");
		if(year%400 == 0 || (year % 4 == 0  && year % 100 != 0))
		{
			System.out.println(year+" is Leap Year !");
		}
		else 
		{
				System.out.print(year+" is Not Leap year !");
		}
		
		System.out.println("3rd Method !");
		boolean leap;
		
		if(year%400 == 0)
		{
			leap = true;
		}
		else if(year % 4 == 0  && year % 100 != 0)
		{
			leap = true;
		}
		else
		{
			leap = false;
		}
		
		if(leap)
			System.out.println(year+" is Leap !");
		else
			System.out.println(year+" Not Leap !");
		
	}
}