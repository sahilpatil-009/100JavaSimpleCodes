/*Check Whether or Not the Number is a Palindrome in Java Language
Given an input integer as a number, the objective is to check whether or not 
the given number integer is a Palindrome or not in Java Language.
 To do so well reverse the the number using the modulo and divide operators and check if the reversed number matches the original number.
 Here are few methods to Check Whether or Not the Number is a Palindrome in Java Language,

Method 1: Using Iteration
Method 2: Using Recursion
*/

import java.util.*;
class Palindrome{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int reverse =0;
		int rem = 0;
		
		System.out.println("Enter Number:");
		int n = sc.nextInt();
		
		int no = n;
		
		while(n!=0)
		{
			rem = n % 10;
			reverse = 10 * reverse + rem;
			
			n = n /10;
		}
		
		if(reverse == no)
		{
			System.out.println(no+"is palindrom !");
		}
		else
		{
			System.out.println(no+"is Not Palindrome !");
		}
	}
}