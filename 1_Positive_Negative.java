/*Check if a Number is Positive or Negative in Java
In this article, we will create a java program to check whether the number entered by the user is positive or negative. The number is demonstrated as positive or negative by comparing the entered number with the Zero(0). If the number entered by the user is greater than zero, then the number is positive, else if the number is less than zero, then the number is negative and else the number is zero.

N > 0 then, number is Positive.
N < 0 then, number is Negative.
N = 0 then, number is Zero.
To solve the above problem we write a Java code using three different methods.

Method 1: Using Brute Force
Method 2: Using Nested if-else Statements
Method 3: Using Ternary Operators
The Above methods are discussed in depth in the sections below.*/

import java.util.*;

class positive_negative{
	
	//Scanner sc = new Scanner(System.in);
	
	public void numfun(int num){
		
		//System.out.println("Enter Number:");
		//int num = sc.nextInt();
		
		if(num >= 0){
			
			if(num == 0){
				System.out.println(num+" it is Zero");
			}
			else{
				System.out.println(num+" is Positive Number");
			}
		}
		else{
			System.out.println(num+" is Negative Number");
		}
	}
}

class positive_test{
	
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number:");
		int num = sc.nextInt();
		
		positive_negative no1 = new positive_negative();
						  no1.numfun(num);
			
	}
}