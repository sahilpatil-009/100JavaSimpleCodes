/*Palindrome Program in Java

Check Whether or Not the Number is a Palindrome in Java Language
Given an input integer as a number, the objective is to check whether or not the given number integer is a Palindrome or not in Java Language. To do so we’ll reverse the the number using the modulo and divide operators and check if the reversed number matches the original number. Here are few methods to Check Whether or Not the Number is a Palindrome in Java Language,

Method 1: Using Iteration
Method 2: Using Recursion
*/
import java.util.*;

class PelindromNumber{
	
	int num;
	
	PelindromNumber(int n){ //Constructor
		this.num = n;
	}
	
	public void MyMethod(){
		int temp = num;
		int rem = 0;
		int reverse = 0;
		
		while(temp!=0){
			rem = temp % 10;
			
			reverse = reverse * 10 +rem;
			
			temp = temp / 10;
		}
		
		if(isPelindrom(reverse)){
			
			System.out.println(num+" Number is Pelindrom Number "+reverse);
		}else{
			System.out.println(num+" is Not Pelindrom "+reverse);
		}
		
	}
	
	public void Method_1(){
		
		int temp = num;
		int rem = 0;
		int reverse = 0;
		for(;temp !=0; temp = temp / 10){
			
			rem = temp % 10;
			
			reverse = reverse * 10 + rem;
		}
		
		System.out.println("Revers Number is:"+reverse);
		
		if(isPelindrom(reverse)){
			
			System.out.println(num+" Number is Pelindrom Number "+reverse);
		}else{
			System.out.println(num+" is Not Pelindrom "+reverse);
		}
		
	}
	
	Boolean isPelindrom(int reverse){
		
		return reverse==num ? true:false;
	}
	
	public int Method_recursion(int n, int reverse){
		
		if(n == 0)
			return reverse;
		
		int rem = n % 10;
		
		reverse = reverse * 10 + rem;
		
		return Method_recursion(n /10, reverse );
	}
}

class PelindromNumber_test{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number:");
		int no = sc.nextInt();
		
		PelindromNumber p = new PelindromNumber(no);
						p.Method_1();
						p.MyMethod();
						
		System.out.println("Recusrion Method !");				
		int ans = p.Method_recursion(no, 0);
		Boolean st	= p.isPelindrom(ans);
		if(st){
			System.out.println(no+" Pelindrom Number");	
		}else
		{
			System.out.println(no+" Not Pelindrom Number");	
		}
	}
}