/*Java Program to find length of the string without using length function
Finding Length of string without using length() method
In this article we’re going to make a Java program to find length of String without using length() method . In this program first we will take the String input from user . After that we will convert String to character array by using toCharArray() . After that we will use for-each loop to count the length  of the String*/ 

import java.util.*;

class StringLength{

    public static int LengthStr(String str){

        int count = 0;

        for(char ch : str.toCharArray()){
            count++;
        }

        return count;
    }
}

class StringLength_test{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String:");
        String str = sc.nextLine();

        System.out.println("Length Of String is: "+StringLength.LengthStr(str));
    }
}