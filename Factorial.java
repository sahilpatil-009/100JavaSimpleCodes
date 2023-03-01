/*Factorial of a Number in Java*/

import java.util.*;
class factorial{
	
	static int fact1(int n){
		
		System.out.println("1st Method!");
		int res = 1;
		for(int i=2;i<=n;i++)
		{
			res *=i;
		}
		return res;
	}
	
	static int fact2(int n){
		if(n == 0)
			return 1;
		
		return n * fact2(n-1);
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No:");
		int fac = sc.nextInt();
		
		System.out.println("Factorial of "+fac+" is:"+fact1(fac));
		
		System.out.println("2nd Method!");
		System.out.println("Factorial of "+fac+" is:"+fact2(fac));
	}
}