/*Find the Sum of the Digits of a Number in Java Language
Given an input integer as the number, our objective is to break down the number into it’s individual digits and sum them up together. To do so we’ll use the follow two operators,

Modulo Operator % : We’ll use this to extract the digits from the number.
Divide Operator / : We’ll use it to shorten the number by 1 digit.
Once we get the digits, we sum them up one by one with each iteration. Here are some of the methods to solve the above mentioned problem

Method 1: Using Brute Force
Method 2: Using Recursion I
Method 3: Using Recursion II
Method 4: Using ASCII Table
*/

import java.util.*;

class SumOfDigits{
	
	int num,sum;
	
	SumOfDigits(int no){  // 11 passes
		this.num = no;    //11 assigned
	}
	
	public void MyMethod(){
		
		int n = num;    //11 assigned
		while(num!=0){  // 11 !=0 = true 
			
			sum += num % 10; // 1)sum += 11 % 10 = 1 then sum=1 2) 
			num = num/10; //num = 11/10 then updated num = 1  
		}
		
		System.out.println("Sum of Digits of Number "+n+" is "+sum);
	}
	
	public int Method_2(int num,int sum){
		
		if(num==0)
			return sum;
		
		sum += num %10;
		
		return Method_2(num/10, sum);
	}
}

class SumOfDigits_test{
	
	public static void main(String[] args){
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter Number:");
		int no = sc.nextInt();
		
		SumOfDigits s1 = new SumOfDigits(no);
					s1.MyMethod();
					System.out.println("Another Recursion Method");
					System.out.println("Sum of Digits of Number "+no+" is "+ s1.Method_2(no,0));
	}
}