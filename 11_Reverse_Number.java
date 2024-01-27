/*Find the Reverse of a Number in Java Language
Given an integer input as number, the objective is Find the Reverse of a Number in Java Language. To do so we usually break down the number into its individual digits and then rearrange them in reverse order. Here are a few methods to solve the above-mentioned problem in Java Language,

Method 1: Using while loop
Method 2: Using for loop
Method 3: Using Recursion I
Method 4: Using Recursion II
Method 5: Taking care of negative numbers in case of method 4*/

import java.util.*;

class ReverseNumber{
	
	int num;
	
	ReverseNumber(int no){
		this.num = no;
	}
	
	public void MyMethod(){
		
		int n = num;
		int reverse = 0;
		int rem = 0;
		while(n!=0){
			
			rem = n % 10;
			reverse = reverse * 10 + rem;
			
			n = n / 10;

		}
		
		System.out.println("Reverse Number is:"+reverse);
	}
	
	public void MEthod_1(){
		
		System.out.println("Method_1");
		int n = num;
		int reverse = 0;
		int rem = 0;
		
		for( ; n !=0;n = n/10){
			rem = n%10;
			reverse = reverse * 10 + rem;
		}
		
		System.out.println("Reverse Number is="+reverse);
	}
	
	public int Method_Recursion(int n,int reverse){
		
		if(n == 0)
			return reverse;
		
		int rem = n % 10;
		reverse = reverse * 10 + rem;
		
		return Method_Recursion(n /10,reverse);
	}
}

class ReverseNumber_test{
	
	public static void main(String[] args){
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Number That Should Reverse:");
		int no = sc.nextInt();
		
		ReverseNumber r1 = new ReverseNumber(no);
					  r1.MyMethod();
					  r1.MEthod_1();
					  System.out.println("Using Recusion Method !");
					  System.out.println("Reverse Number is="+r1.Method_Recursion(no,0));
	}
}
