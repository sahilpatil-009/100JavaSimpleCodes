/*Can a number be expressed as a sum of two prime numbers using Java?
Can a number be expressed as a sum of two prime numbers using java
Here, we will discuss program to check whether a number be expressed as a sum of two prime numbers using java.  we will ask the user to enter a positive integer and check whether that number can be expressed as the sum of two prime numbers. If that number can be expressed as sum of two prime numbers then print the numbers in the output and else print the statement that the number cannot be expressed as a sum of two prime numbers.

Enter a number : 14
14 = 3 + 11
14 = 7 + 7
*/

import java.util.Scanner;
class PrimeSum{

    public static void sum(int num){
        int x=0;
        for(int i=2;i<=num/2;i++){
            if(isPrime(i))
            {
                if(isPrime(num-i)){
                 System.out.println(num+ " = "+i+" + "+(num-i));
				  x = 1;
                }
            }

        }
        if(x == 0)
			System.out.println(num+" cannot be expressed as a sum of two prime numbers");

    }

    public static Boolean isPrime(int n){

        for(int i=2;i<n;i++){

            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

}

class PrimeSum_test{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int num = sc.nextInt();

        PrimeSum.sum(num);
    }
} 
