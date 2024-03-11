/*Java program to check String is a palindrome or not
Check whether a String is Palidrome
In this article  we will see if the string is palindrome or not in java programming language.

A string is palindrome if the reverse and the original string is same

Lets understand this with the help of an example:- 

Input sting:- AMA
Reverse sting:- AMA
Here AMA = AMA so this is a palindrome */ 

import java.util.Scanner;
class PelindromStr{

    public static void MyMethod(String str){

        String reverse="";

        for(int i = str.length()-1;i >=0 ; i--){
            reverse += str.charAt(i);
        }

        if(str.equals(reverse)){
            System.out.print(str+" and "+reverse+" are Pelindrom Strings ");
        }else{
            System.out.print(str+" and "+reverse+" are Pelindrom Not Strings !");
        }
    }

    

}

class PelindromStr_test{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String;");
        String str = sc.next();

        PelindromStr.MyMethod(str);
    }
}