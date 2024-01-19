/*Check Whether a Number is Even or Odd in Java
Given an integer input the objective is to write a Java code to Check Whether a Number is Even or Odd. To do so the main idea is to divide the number by 2 and check if it’s divisible or not. It’s an Even number is it’s perfectly divisible by 2 or an Odd number otherwise.

Here are the Methods to solve the above mentioned problem,

Method 1 : Using Brute Force
Method 2 : Using Ternary Operator
Method 3 : Using Bitwise Operators
*/

import java.util.*;

class EvenOdd{
	
	int num;
	
	EvenOdd(int no){
		this.num = no;
	}
	
	public void MyMethod(){
		
		if(num>=0){

			if(num % 2 == 0)
			{
				System.out.println(num+" is Even Number");
			}
			else{
				System.out.println(num+" is Odd Number");
			}
		}
		else{
			
			System.out.println(num+" Number is -ve");
		}
	}
	
	public void Method_2(){
		
		System.out.println(num+" Method 2");
		
		String status = num % 2 == 0 ? "is Even":"is Odd";
		System.out.println(num+" is "+status);

		Boolean res = num % 2 == 0 ? true:false;
		
		if(true){
			System.out.println(num+" is Even Number");
		}
		else{
			
			System.out.println(num+" is Odd Number");			
		}
		
	}
}

class EvenOdd_test{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = sc.nextInt();
		
		EvenOdd no1 = new EvenOdd(num);
				no1.MyMethod();
				no1.Method_2();
	}
}