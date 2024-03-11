/*Java program to remove characters in a string except alphabets
Remove character in a String except alphabet
In this article we will learn how to Remove character in a String except alphabet.

Take String input from the user and store it in a variable called “s”(in this case). After that use replaceAll() method which was present in string class the work of replaceAll() method is to replace some old thing with some new thing so here we’re using a regular expression to replace character in a string with blank spaces.*/

import java.util.*;
class RemoveSymbols{

    public static String removeSymbol(String str){

        String newStr = "";
        for(int i=0;i < str.length(); i++){
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z' || str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                newStr+= str.charAt(i);
            }
        }

        return newStr;
    }

}

class RemoveSymbols_test{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String:");
        String str = sc.nextLine();

        System.out.println("String is: "+ RemoveSymbols.removeSymbol(str));
    }
}