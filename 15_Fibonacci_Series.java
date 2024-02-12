/*Find the Fibonacci Series up to Nth Term in Java
For a Given integer input number as the Nth value, the objective is to Find the Fibonacci Series up to the Nth Term. Therefore, we’ll write a program to Find the Fibonacci Series up to Nth Term in Java Language.

Example
Input : 4
Output : 0 1 1 2*/

import java.util.*;

class Fibonacci_Series{
	
	int num;
	Fibonacci_Series(int n){
		
		this.num = n;
	}
	
	void Mymethod(){
		
		int a=0;
		int b=1;
		int nextterm;
		System.out.print(" "+a+", "+b+",");
		for(int i = 2;i<num;i++){
			
			nextterm = a + b;
			a = b;
			b = nextterm; 
			System.out.print(nextterm+",");
		}
		
	}
}

class Fibonacci_Series_Test{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number:");
		int num = sc.nextInt();
		
		Fibonacci_Series f1 = new Fibonacci_Series(num);
						 f1.Mymethod();
	}
}