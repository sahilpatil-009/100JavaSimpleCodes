/*Prime Factors of a number in Java
 

Here, in this page we will discuss the program to print all the prime factors of a number in java. Prime factorization is a way of expressing a number as a product of its prime factors. A prime number is a number that has exactly two factors, 1 and the number itself.

Example :

Input : 12
Output : 2 2 3
*/

import java.util.Scanner;

class PrimeFactorOfNumber{

    public static void MyMethod(int no){

        for(int i=2;i<=no;i++){
            if(isPrime(i)){
                int x = no;
                while(x%i==0){
                System.out.print(" "+i);
                x /= i;
             }

            }
        }
    }

    public static Boolean isPrime(int no){
        
        if(no < 2){
			return false;
		}
		else
		{
			for(int i=2;i<no;i++){
				if(no % i == 0)
					return false;
			}
		}

        return true;
    }
}

class PrimeFactorOfNumber_test{

    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number:");
        int no = sc.nextInt();
        
        System.out.print("Prime Factor Numbers Are:");
        PrimeFactorOfNumber.MyMethod(no);
        
    }
}