/*Write a program to check if a given number is prime or not in java
Given an integer input, the objective is to – Write a program to check if a given number is prime or not in Java. 
Here are some of the Methods to Check for Prime –

Method 1: Simple iterative solution
Method 2: Optimization by break condition
Method 3: Optimization by n/2 iterations
Method 4: Optimization by √n
Method 5: Optimization by skipping even iteration
Method 6: Basic Recursion technique */

import java.util.*;

class PrimeOrNot{
	
	int num;
	PrimeOrNot(int no){
		
		this.num = no;
	}
	
	public void MyMethod(){
		
		int count=0;
		if(num < 2){
			System.out.println(num+" is Not Prime Number");
		}
		else{
			for(int i=1;i<=num;i++){
				
				if(num % i == 0){
					count++;
				}
			}
		}
		
		if(count > 2){
			System.out.println(num+" is Not Prime Number");
		}
		else{
			System.out.println(num+" is Prime Number");
		}
	}
	
	public void AnotherMethod(){
		
		System.out.println("Another Method");
		Boolean res = true;
		
		if(num < 2){
			res = false;
		}
		else
		{
			for(int i=2;i<num;i++){
				if(num % i == 0)
					res = false;
			}
		}
		
		String result = res ? "Prime Number" : "Not Prime";
		
		System.out.println(num+" is "+result);
	}
}

class PrimeOrNot_test{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int no = sc.nextInt();
		
		PrimeOrNot p = new PrimeOrNot(no);
				   p.MyMethod();
				   p.AnotherMethod();
	}
}