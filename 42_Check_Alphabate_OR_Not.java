/*Java program to check a character is an alphabet or not
A character is an alphabet or not using java
Here, in this section we will discuss the program to check whether the character is an Alphabet or not using java. A character will be an alphabet,  if and only if it is either in uppercase letter or in lowercase letter. In this article we will discuss whether a particular character entered by the user is an alphabet or not using java programming language.
*/

import java.util.Scanner;

class CheckAlphabate{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Any Character");
        char ch = sc.next().charAt(0);   

        CheckAlphabate.Check(ch);
        CheckAlphabate.CheckAnotherMethod(ch);

    }

    public static void Check(char ch){

        if((ch >= 'a' && ch<= 'z') || (ch >= 'A' && ch <= 'Z')){

           System.out.println(ch+" is Alphabate"); 
        }else
        {
            System.out.println(ch+" is Not Alphabate");
        }
    }
    
    public static void CheckAnotherMethod(char ch){

        if((ch >= 96 && ch<= 122) || (ch >= 65 && ch <= 90)){

           System.out.println(ch+" is Alphabate"); 
        }else
        {
            System.out.println(ch+" is Not Alphabate");
        }
    }
}