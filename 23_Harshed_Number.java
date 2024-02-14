/*Harshad number or not using Java : 
Harshad number is a number or an integer in base 10 which is completely divisible by sum of  its digits.
For better understanding let us consider an example.
Example :
Suppose a number 24 .
Calculate the sum of digits of the number (2 + 4) = 6 .
Check whether the number entered by user is completely divisible by sum of its digits or not.
Below are first few Harshad Numbers represented in base 10 :
1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 18, 20………
In this article, we will create a java program to check whether the number entered by the user is Harshad number or not.
*/

import java.util.Scanner;

class Harshad_number{

    static void harshedNumber(int n){
        int num = n;
        int sum=0;
        int rem=0;
        while(num!=0){
            rem = num%10;
            sum +=rem;
            num /=10;
        }

        if(n % sum == 0){
            System.out.println(n+" Number is Harshed Number");
        }else
        {
            System.out.println(n+" Number is Not Harshed Number");
        }
    } 

}
class Harshad_number_Test{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int num = sc.nextInt();
        Harshad_number.harshedNumber(num);
    }
}