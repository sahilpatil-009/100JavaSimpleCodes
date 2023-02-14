/*Check Whether a Number is Even or Odd in Java
Given an integer input the objective is to write a Java code to Check Whether a Number is Even or Odd. To do so the main idea is to divide the number by 
2 and check if it’s divisible or not. It’s an Even number is it’s perfectly divisible by 2 or an Odd number otherwise.
*/

import java.util.*;

class evenodd{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int no;
		do{
			
			System.out.println("Enter No:");
			no = sc.nextInt();
			
			if(no%2 == 0)
			{
				System.out.println(no+" is Even");
			}
			else
			{
				System.out.println(no+" is Odd");
			}
			
		}while(no != 0);
		
		// Using Ternary Operator Syntax
	   //( Condition ) ? ( if True : Action ) : ( if False : Action ) ;
	   
	   String status;
	   do{
			
			System.out.println("Enter No:");
			no = sc.nextInt();
			
			status = no%2 == 0 ? " is Even" : " is odd";
			
			System.out.println(status);
			
		}while(no != 0);
	   
	}
} 