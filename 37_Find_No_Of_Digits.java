// Java Code to find number of digits in an integer
// To find Number of digits in an integer using java
// In this article we will count the number of digits in an integer using java . We will use the loop and a variable to count the number of digits.

import java.util.Scanner;

class countDigit{
    
    static public int DigitCount(int no){

        int num = no;
        int count=0;
        int rem;
        while(num != 0){
            rem = num % 10;
            num = num / 10;
            count++;
        }

        return count;
    } 
}

class countDigit_test{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number:");
        int no = sc.nextInt();

        System.out.println("Number of Digits are:"+countDigit.DigitCount(no));
    }
}