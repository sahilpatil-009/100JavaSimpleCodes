/*Check Whether or Not the Year is a Leap Year in Java
Given an integer input for the year, the objective is to check whether or not the user given input “year” is a Leap year or not. In order to do so we check if the integer input satisfies the conditions for a leap year mentioned below. Therefore, we write a Java code to check and tell if it’s a leap year or not. Some of the methods to check for leap year are mentioned below

Method 1: Using if-else Statements 1
Method 2: Using if-else Statements 2
Method 3: Using Ternary Operator
Method 4: Bonus Boolean method
*/

import java.util.*;
class LeapYearOrNot{
	
	int year;
	
	LeapYearOrNot(int yar){
		this.year = yar;
	}
	
	public void Method(){
		//tip:-
		//A leap year is any year that is divisible by 4.
		//However, if a year is divisible by 100, it is not a leap year, unless it is also divisible by 400.
		
		String result = (year % 400 == 0 || year%4 == 0 && year % 100 !=0) ? " is Leap Year" : "is Not Leap Year";
		
		System.out.println(year+" is "+result);
	}
}

class LeapYearOrNot_test{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Year:");
		int yer = sc.nextInt();
		
		LeapYearOrNot L1 = new LeapYearOrNot(yer);
					  L1.Method();
					  
	}
}