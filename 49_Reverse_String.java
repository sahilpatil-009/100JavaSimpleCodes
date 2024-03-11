/*Java Program to Reverse a String
Program to reverse the string
In this article we will learn how to reverse a string in Java

Reversing a string is a technique so that the 1st character becomes the last character and so on.

Suppose we have a string called “prepinsta” so we have to find reverse of that string is “atsniperp” we can do this in two way by using reverse method of StringBuilder class and by using normal for loop with charAt() method.*/ 

import java.util.*;
class ReverseStr{

    public static String MyMethod(String str){

        String revStr = "";
        for(int i = str.length()-1;i >= 0 ; i--){
             revStr += str.charAt(i);
        }

        return revStr;
    }

}

class ReverseStr_test{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String:");
        String str = sc.next(); 

        System.out.println("Reverse is:"+ReverseStr.MyMethod(str));
    }
    
}