/*Factorial of a Number in Java
Here on this page, we will learn how to Find the Factorial of a Number in Java. Factorial is a sequence of a number where we multiply by all previous numbers.*/

import java.util.*;

class Factorial{
	
	public int MyMethod(int num){
		
		int res = 1;
		
		for(int i=2;i<=num;i++)
		{
			res*= i;
		}
		return res;
	}
	
	public int MyRecursion(int num){
		
		if(num == 0)
			return 1;
		
		return num * MyRecursion(num -1);
	}
}

class Factorial_test{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number:");
		int no = sc.nextInt();
		
		Factorial f1 = new Factorial();
		System.out.println("Factorial of "+no+" is:"+f1.MyMethod(no));
		
		System.out.println("Factorial of "+no+" using Recursion Method:"+f1.MyRecursion(no));
		
	}
}