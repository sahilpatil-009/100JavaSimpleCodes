/*Occurrence of a digit in a given number using Java

In this page we will discuss the program to find the occurrence of a digit in a given number using java programming language. We are given with a number and a digit and need to count the number of occurrence of that digit in the given number.
*/ 

import java.util.*;
class OccuranceOFDigits{
    
    public static int OccureDigit(int n, int oc){
        int no = n;
        int count = 0;
        int rem;
        while(no !=0){
            rem = no%10;
            if(rem == oc){
                count++;
            }
            no = no / 10;
        }

        return count;
    }
}

class OccuranceOFDigits_test{

    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter Number:");
    int n = sc.nextInt();

    System.out.println("Which Number Occurance Want to Count?:");
    int oc = sc.nextInt();

    System.out.println("Occurence of "+oc+" is "+OccuranceOFDigits.OccureDigit(n, oc));

    }
}