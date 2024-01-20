/*Find the Sum of the Numbers in a Given Interval in Java
Given the range as integer input, the objective is to find the Sum of all the Numbers that lay in the given interval using different methods. To do so we basically iterate from the base interval to the final interval and keep adding the number. Here are some of the methods to solve the above mentioned problem in Java Language.

Method 1: Using Brute Force
Method 2: Using the Formula
Method 3: Using Recursion*/


import java.util.*;
class SumBtwRange{
	
	int num1,num2;
	SumBtwRange(int num1 ,int num2){
		
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void MyMethod(){
		int sum = 0;
		for(int i = num1;i<=num2;i++)
		{
			sum += i;
		}
		
		System.out.println("The Sum of Numbers between Range "+num1+" to "+num2+" is:"+sum);
	}
	
	public int Method_2(){
		
		System.out.println("Method 2nd");
		int sum = num2*(num2+1)/2 - num1*(num1+1)/2 + num1;
		return sum;
	}
	
	public int getSum(int s,int n1, int n2){
	if (n1 > n2)
      return s;

    return n1 + getSum (s, n1 + 1, n2);
	}
	
}

class SumBtwRange_test{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Staring No:");
		int n1 = sc.nextInt();
		
		System.out.println("Enter Ending No:");
		int n2 = sc.nextInt();
		
		SumBtwRange s1 = new SumBtwRange(n1, n2);
					s1.MyMethod();
					System.out.println("The Sum of Numbers between Range "+n1+" to "+n2+" is:"+ s1.Method_2());
					System.out.println("Method 3 Using Recursion");
					System.out.println("The Sum of Numbers between Range "+n1+" to "+n2+" is:"+ s1.getSum(0,n1,n2));
	}
	
}