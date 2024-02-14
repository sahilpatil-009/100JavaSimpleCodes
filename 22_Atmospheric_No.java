/*Check Whether Or Not the Number is an Automorphic Number in Java
Given an integer input, the Objective is to check whether the square of the number ends with the same number or not. Therefore, we’ll write a code to Check Whether or Not the Number is an Automorphic Number in Java Language.

Example
Input : 5
Output : Yes, it's an Automorphic Number

Example
Input : 5
Output : 25
Explanation : Number = 5
when squared you get 25
as 25 ends with 5

Example:
5 =(5)2 = 25
6 = (6)2 = 36
25 = (25)2 = 625
76=(76)2 = 5776
376 = (376)2 = 141376
890625 = (890625)2 = 793212890625
*/

import java.util.Scanner;
class Atmospheric_Number{

    static Boolean isAtmosphericNumber(int num){
        int sq = num*num;
        while(num!=0){

            if(num%10 != sq%10){
                return false;
            }
            num /= 10;
            sq /= 10;
        }
        return true;
    }

}

class Atmospheric_Number_test{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number:");
        int num = sc.nextInt();

        int sq = num * num;

        if(Atmospheric_Number.isAtmosphericNumber(num)){
            System.out.println(num+" is Atmospheric Number its Squeare is "+sq);
        }else{
            System.out.println(num+"is not Atmospheric Number square is "+sq);
        }

        System.out.println("Second Method!");
        if(num%10==sq%10){
            System.out.println("automorphic");
        }
         else{
            System.out.println("not Automorphic");
         }
    }
}