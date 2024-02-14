/*Check Whether or Not the Number is a Perfect Number in Java
Given an integer input as the number, the objective is to check whether or not the number can be represented as the sum of its factors except the number itself. Therefore, we write a code to Check Whether or Not a Number is a Perfect Number in Java Language.

Example
Input : 6
Output : Yes, it's a Perfect Number
Since, 6 = 1 + 2 + 3 (which are its divisors) */

import java.util.Scanner;

class Perfect_number{

    int num;
    public Perfect_number(int no){
        this.num = no;
    }

    public void MyMethod(){
        int sum=0;
        for(int i=1;i<=num/2;i++){
            if(num%i == 0){
                sum+=i;
                System.out.print(i+",");
            }
        }

        System.out.println();
        if(sum==num){
            System.out.println(num+" is Pefect Number");
        }else{
          System.out.println(num+"is Not Perfect Number");  
        }
    }
}

class Perfect_number_test{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int no = sc.nextInt();

        Perfect_number pn = new Perfect_number(no);
                       pn.MyMethod();
    }
    
}