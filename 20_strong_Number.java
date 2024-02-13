/*Check Whether or Not the Number is a Strong Number in Java
Given an integer  input the objective is to check whether or not the number is a strong number. Therefore we’ll write a code to Check whether or Not the Number is a Strong Number in Java Language.

Example
Input : 145
Output : Yes, it's a strong number

Example
Input : 145
Output : Yes, it's a strong number
Explanation : Number = 145
145 = 1! + 4! + 5!
145 = 1 + 24 + 120
output number  = 145.
 */

import java.util.Scanner;

class Strong_number{

    public static void MyMethod(int no){
        int digit=0;
        int sum=0;
        int n=no;
        while(n!=0){
            digit = n % 10;
            sum += Factor(digit);
            n = n/10;
        }
        System.out.println("Sum is "+sum);
        if(sum==no){
            System.out.println(no+" is Strong Number");
        }else{
            System.out.println(no+" is Not Strong Number");
        }
        
    }

    public static int Factor(int n){

        if(n==0)
            return 1;

        return n * Factor(n-1);
    }
}

class Strong_number_test{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int no = sc.nextInt();

        Strong_number.MyMethod(no);

    }
}