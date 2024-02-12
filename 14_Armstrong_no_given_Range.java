/*Find the Armstrong Numbers in a given Interval in Java
Given two integers high and low for limits as inputs, the objective is to write a code to Find the Armstrong Numbers in a given Interval in Java.

Example 
Input : 10 1000
Output : 153  370  371  407
*/

import java.util.*;

class Armstrong_Range{
	
	int start, end;
	
	Armstrong_Range(int n1, int n2){
		this.start = n1;
		this.end = n2;
	}
	
	void MyMethod(){
		
		int rem=0;
		int sum=0;
		int cube=0;
		int temp=0;
		int countF=0;
		int countW=0;
		for(int i=start; i<=end; i++)
		{
			rem=0;
			sum=0;
			cube=0;
			temp = i;
			countF++;
			while(temp!=0){
				rem = temp % 10;
				cube = rem*rem*rem;
				sum = sum + cube;
				temp = temp / 10;
				
				countW++;
			}
			if(isArmstrong(sum, i)){
				System.out.println(sum+" is Armstrong Number");
			}
		}
		
		System.out.println("For Loop Run for "+countF);
		System.out.println("While Loop Run for "+countW);
	}
	
	Boolean isArmstrong(int sum, int i){
		
		return sum == i ? true:false;
	}
}

class Armstrong_Range_test{
	
	public static void main(String[] args){
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter First Number:");
		int n1 = sc.nextInt();		
		System.out.println("Enter Second Number:");
		int n2 = sc.nextInt();
		
		
		Armstrong_Range ar1 = new Armstrong_Range(n1,n2);
						ar1.MyMethod();
		
	}
}

