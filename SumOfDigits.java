//Find the Sum of the Digits 
/*
Given an input integer as the number, our objective is to break down the number into it’s individual digits and sum them up together.
 To do so we’ll use the follow two operators,

Modulo Operator % : Well use this to extract the digits from the number.
Divide Operator / : Well use it to shorten the number by 1 digit.
Once we get the digits we sum them up one by one with each iteration. Here are some of the methods to solve the above mentioned problem

Method 1: Using Brute Force
Method 2: Using Recursion I
Method 3: Using Recursion II
Method 4: Using ASCII Table
*/

import java.util.*;
class sumofdigit{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No:");
		int n = sc.nextInt();
		int sum=0;
		int n2 = n;
		System.out.println("Method 1 !");
		while(n!=0)
		{
			sum += n % 10;
			n = n / 10;
		}
		System.out.println("Sum of all digits in"+n2+" is = "+sum);
		
		System.out.println("Method 2 !");
		int sum2=0;
		
		System.out.println("Sum of all digits in "+n2+" is = "+getsum(n2,sum2));
		
		System.out.println("Method 3 !");
		
		System.out.println("Sum of all digits in "+n2+" is = "+getsumm(n2));
	}
	
	public static int getsum(int n, int sum2){
		
		if(n==0)
			return sum2;
		sum2 += n % 10;
		return getsum(n /10,sum2);
	}
	
	public static int getsumm(int n){
		
		if(n==0)
			return 0;
		
		return n % 10 + getsumm(n/10); 
	}
	
}