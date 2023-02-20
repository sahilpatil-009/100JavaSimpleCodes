/*Find the Greatest of the Three Numbers in Java
Given Three integer inputs num1, num2 and num3, the objective is ti write a code to Find the Largest of the Three Numbers in Java Language. In this article we will see a  Java program to Find Greatest of three numbers. We will use if else conditions and ternary operator too to find the same. Here are some of the methods to solve the above mentioned problem,

Method 1: Using if-else Statements 2
Method 2: Using if-else Statements 2
Method 3: Using Ternary Operator
*/

import java.util.*;
class ThreeNoGreat{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1st No:");
		int a = sc.nextInt();
		
		System.out.print("Enter 2nd No:");
		int b = sc.nextInt();
		
		System.out.print("Enter 3rd No:");
		int c = sc.nextInt();
		
		System.out.println("1st Method ! using if-else loop");
		if(a>b && a>c)
		{
			System.out.println(a+" is Greater !");
		}
		else if(b>a && b>c)
		{
			System.out.println(b+" is Greater !");
		}
		else
		{
			System.out.println(c+" is Greater !");
		}
		
		System.out.println("2ns Method ! Urinary Operator");
		
		int temp = a>b ? a : b;
		
		int result = temp>c ? temp : c;
		
		System.out.println(result+" is Great !!");
	}
}