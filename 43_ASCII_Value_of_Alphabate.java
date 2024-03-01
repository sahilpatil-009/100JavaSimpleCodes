/*Java Program for Calculating ASCII value of a character
ASCII Value of a character using Java
Here, in this page we will discuss the program to print ASCII value of a character using java. ASCII value can be any integer number between 0 and 127 and consists of character variable instead of the character itself in Java programming.*/ 

import java.util.Scanner;

class CehckAscii{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter letter:");
        char ch = sc.next().charAt(0);

        letter_ascii(ch);

    }
    static void letter_ascii(char ch){

            int i = ch;
            System.out.println("ASCII Code of "+ch+" is:"+i);

    }
}