/*Find the Sum of First N Natural Numbers in Java
Given an integer input of N, the objective is to find the sum of all the natural numbers until the given input integer. To do so we can use different approaches to write the Java code and some such methods are mentioned below,

Method 1: Using for Loop
Method 2: Using Formula for the Sum of Nth Term
Method 3: Using Recursion*/

import java.util.*;

class SumOfNums{

	int num;
	SumOfNums(int no){

		this.num = no;

	}

	public void MyMethod(){

		int sum=0;
		for(int i=0;i<=num;i++){

			sum+=i;
		}

		System.out.println("Sum of Numbers upto "+num+" is"+sum);
	}

	public void Method_2(){
		System.out.println("Method 2 using Formula !");
		System.out.println ( num*(num+1)/2);
	}

	public int getSum(int n){
		if (n == 0){
		  return n;
		}
		return n + getSum (n - 1);
	  }

}

class sumOfNums_test{

	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Range No:");
		int num = sc.nextInt();

		SumOfNums s1 = new SumOfNums(num);
				  s1.MyMethod();
				  s1.Method_2();
				  System.out.println("Method 3 Using Recursion");
				  System.out.println("Sum of Numbers upto "+num+" is"+s1.getSum(num));
	}
}