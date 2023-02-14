/*
Check if a Number is Positive or Negative in Java
In this article, we will create a java program to check whether the number entered by the user is positive or negative. The number is demonstrated as positive or negative by comparing the entered number with the Zero(0). If the number entered by the user is greater than zero, then the number is positive, else if the number is less than zero, then the number is negative and else the number is zero.

N > 0 then, number is Positive.
N < 0 then, number is Negative.
N = 0 then, number is Zero.
To solve the above problem we write a Java code using three different methods.

Method 1: Using Brute Force
Method 2: Using Nested if-else Statements
Method 3: Using Ternary Operators
The Above methods are discussed in depth in the sections below.
*/

import java.util.*;
class positive_negative{
	
	
	public static void main(String[] args){
	int no;
	
	Scanner sc = new Scanner(System.in);
	
	do{
			System.out.println("Enter No:");
			no = sc.nextInt();
			
			if(no>0)
			{
				System.out.println(no+" is Positive !");
			}
			else
			{
				System.out.println(no+" is Negative !");
			}
		
		}while(no != 00);
	
	}
}