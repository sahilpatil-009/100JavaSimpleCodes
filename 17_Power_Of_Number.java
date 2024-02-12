/* Find the Power of a Number in Java Language
Given two integers as the number and power inputs, the objective is to raise the number input to the power input and print the value. To do so we’ll use the concepts of loops and recursion. Here are few methods to Find the Power of a Number in Java Language,

Method 1: Without While Loop
Method 2: With While Loop

Find the Power of a Number in Java
Given two integer inputs as number and the power, the objective is to raise the number to a power given. Therefore, we’ll write a Code to Find the Power of a Number in Java Language.

Example
Input : 2 3
Output : 8

*/

import java.util.*;

class PowerOfnumber{

    int MyMethod(int no, int pow){

        int FinalAns=no;
        for(int i=1;i<pow;i++){
            FinalAns = FinalAns*no;
        }

        return FinalAns;
    }
}

class PowerOfNumber_test{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int no = sc.nextInt();

        System.out.println("Enter Power to Number: ");
        int pow = sc.nextInt();

        PowerOfnumber pon = new PowerOfnumber();
        System.out.println(pow+"th Power of Number "+no+" is: "+pon.MyMethod(no, pow)); 
    }
}