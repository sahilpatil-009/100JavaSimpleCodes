/*Find the Greatest of the Two Numbers in Java
Given two integer input Number1 and Number2, the objective is to write a Java code to compare both the Numbers and Find the Greatest of the Two Numbers. To do so we’ll use if-else statements and print the output. Some methods to solve the above-mentioned Problem are given below.

Method 1: Using if-else Statements
Method 2: Using Ternary Operator
Method 3: Using inbuilt max Function
All the above-mentioned methods are discussed in detail in the sections below.
*/

import java.util.*;

class GreatBetwnTwoNums{
	
	int num1,num2;
		
	GreatBetwnTwoNums(int n1, int n2){
		
		this.num1 = n1;
		this.num2 = n2;

	}
	
	public void MyMethod(){
		if(num1>num2){
			System.out.println(num1+" is Greater than"+num2);
		}else if(num2>num1){
			System.out.println(num2+" is Greater than "+num1);
		}else{
			System.out.println(num1+" and "+num2+" are Equal");
		}
	}
	
	public void Method_2(){
		int temp;
		System.out.println("Method 2 Using Ternary Operator");
		if(num1 == num2){
			System.out.println(num1+" and "+num2+" are Equal");
		}
		else{
			Boolean res = num1 > num2 ? true:false;
			
			if(true){
				System.out.println(num1+" is Greater than"+num2);
			}else{
				System.out.println(num2+" is Greater than "+num1);
			}
			
			/*temp = num1>num2 ? num1:num2;
			System.out.println(temp+" is Greater");*/
		}
	}
	
	public void Method_3(){
		System.out.println("Method 3 Using Ternary Operator");
		if (num1 == num2){
            System.out.println("Both  Numbers are equal");
		}
        else{
            // prints the maximum of two numbers
            System.out.println(Math.max(num1, num2) + " is greater");
		}
	}
}

class GreatBetwnTwoNums_test{
	
	public static void main(String[]args){
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 1st Number:");
		int n1 = sc.nextInt();
		System.out.println("Enter 2nd Number:");
		int n2 = sc.nextInt();
		
		GreatBetwnTwoNums g1 = new GreatBetwnTwoNums(n1,n2);
						  g1.MyMethod();
						  g1.Method_2();
						  g1.Method_3();
	}
}
