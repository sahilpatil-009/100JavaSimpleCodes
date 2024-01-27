/*Check whether or Not the Number is an Armstrong Number in Java
Given an integer input the objective is to check whether or not the number is an Armstrong number.
To do so we check if the number satisfies the below mentioned conditions and if it does, the it’s an Armstrong.
The task is to write a code to Check Whether or Not the Number is an Armstrong Number in Java Language.*/

import java.util.*;

class Armstrong{
	
	int num;
	Armstrong(int n){
		this.num = n;
	}
	public void MyMethod(){
		
		int temp = num;
		int rem=0;
		int cube=0;
		int sum=0;
		
		while(temp!=0)
		{
			rem = temp % 10;
			
			cube = rem*rem*rem;
			// cube = Math.pow(rem, 3);
			
			sum = sum + cube;
			
			temp = temp / 10;
		}
		
		if(isArmstrong(sum)){
			
			System.out.println(sum+" is Armstrong Number");
			
		}else{
			System.out.println(num+" is Not Armstrong Number !");
		}
			
		
	}
	
	Boolean isArmstrong(int sum){
		
		return sum == num ? true:false;
	}
	
	public int Method_recursion(int n, int sum){
		
		int cube=0;
		if(n == 0)
			return sum;
		
		int rem = n % 10;
		
		cube = rem*rem*rem;
		
		sum = sum + cube;
		
		return Method_recursion(n /10, sum);
	}
	
}

class Armstrong_test{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number:");
		int no = sc.nextInt();
		
		Armstrong a1 = new Armstrong(no);
				  a1.MyMethod();
			
			System.out.println("Recursion Method !");
			int ans	 = a1.Method_recursion(no,0);
			
			Boolean ar = a1.isArmstrong(ans);
			if(ar){
				System.out.println(ans+" is Armstrong Number");
			}
			else{
				System.out.println(no+" is Not Armstrong Number");
			}
	}
}