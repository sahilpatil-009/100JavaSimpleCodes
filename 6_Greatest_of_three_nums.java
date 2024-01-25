/*Find the Greatest of the Three Numbers in Java
Given Three integer inputs num1, num2 and num3, the objective is ti write a code to Find the Largest of the Three Numbers in Java Language. In this article we will see a  Java program to Find Greatest of three numbers. We will use if else conditions and ternary operator too to find the same. Here are some of the methods to solve the above mentioned problem,

Method 1: Using if-else Statements 2
Method 2: Using if-else Statements 2
Method 3: Using Ternary Operator
*/

import java.util.*;
class GreatBet3Nums{
	
	int num1,num2,num3;
	GreatBet3Nums(int n1,int n2,int n3){
		this.num1=n1;
		this.num2=n2;
		this.num3=n3;
	}
	
	public void MyMethod(){
		
		if(num1==num2 && num2 == num3){
			System.out.println(num1+" "+num2+" "+num3+" are Equal");
		}
		else
		{
			if(num1>num2 && num1>num3){
				
				System.out.println(num1+" is Greater");
				
			}else if(num2>num1 && num2>num3){
				
				System.out.println(num2+" is Greater");
				
			}else{
				System.out.println(num3+" is Greater");
			}
		}
	}
	
	public void Method_3(){
		System.out.println("Using Ternory Operator");
		if(num1==num2 && num2 == num3){
			System.out.println(num1+" "+num2+" "+num3+" are Equal");
		}else{
			int temp = num1>=num2 ? num1:num2;
			
			int res = temp>=num3 ? temp:num3;
			
			System.out.println(res+" is Greater");
		}
	}
}

class GreatBet3Nums_test{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number:");
		int n1 = sc.nextInt();
		
		System.out.println("Enter 1st Number:");
		int n2 = sc.nextInt();
		
		System.out.println("Enter 1st Number:");
		int n3 = sc.nextInt();
		
		GreatBet3Nums g1 = new GreatBet3Nums(n1,n2,n3);
					  g1.MyMethod();
					  g1.Method_3();
	}
}