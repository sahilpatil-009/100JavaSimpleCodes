//Armstrong Number
/*Given an integer input, the objective is to check whether or not the number input is an Armstrong number or not.

However, Armstrong number is any number following the given rule –

abcd… = an + bn + cn + dn + …
Where n is the order(length/digits in number)
*/

import java.util.*;
class ArmstrongNo{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number:");
		int n = sc.nextInt();
		
		int pw  = ord(n); //call ord function and return value store into pw
		
		int numb = armst(n,pw);	//call armst function and return value store into armst
		//System.out.println(armst(n,pw));
		
		if(numb == n){
			System.out.println(n+" is Armstrong Number !");
		}else
		{
			System.out.println(n+"is not Armstrong Number !");
		}
	}
	
	public static int ord(int n){//This Function is used to calculate Order or number of Digits in Number
		
		int order= 0;
		while(n!=0) // This While loop is used to Find Order or Digits in Number
		{
			order++; //count how much time loop is circulate
			n = n /10; //eliminate digit
		}
		
		return order;
	}
	
	public static int armst(int n, int pw){//This Function is used to Calculate power function and Calculate Sum
		
		int temp=0;
		int sum=0;
		while(n!=0) // This While loop is used to Calculate Power of Each Digit and add all digit Power
		{
			temp = n % 10; //it spprate digits of number
			sum += Math.pow(temp, pw); //calculate power
			n = n/10; //eliminate 1 digit
		}
		
		return sum;
	}
}
