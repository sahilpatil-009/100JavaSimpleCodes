/*Check Whether or Not the Number is an Abundant Number in Java
Given an integer input, the objective is to check whether the sum of all the factors of a number except the number itself is greater than the number or not. Therefore, we’ll write a code to Check Whether or Not the Number is an Abundant Number in Java.
Example
Input : 18
Output : Yes, it's an Abundant Number

Example
Input : Number = 18
Output : Yes, It's an Abundant Number
Explanation : The Factors for the number 18 are, 1, 2, 3, 6 and 9. We don't want to include the number itself.
Now the sum of the factors except the number itself is :
1 + 2 + 3 + 6 + 9 = 21
as the number 21>18 , the number itself.
It's an abundant number.
*/

import java.util.Scanner;

class Abundant_Number{

    static void abudent_number(int n){
        int num = n;
        int sum=0;
        for(int i=1;i<=num/2;i++){
            if(n%i == 0){
                sum+=i;
            }
        }

        if(sum>num){
            System.out.println("Yes, It's an Abundant Number");
        }else
        {
            System.out.println("It's Not Abundant Number !!");
        }
    }

}

class Abundant_Number_Test{

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number:");
        int num = sc.nextInt();

        Abundant_Number.abudent_number(num);

    }
}

