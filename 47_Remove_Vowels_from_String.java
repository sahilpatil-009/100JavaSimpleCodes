/*Java Program to Remove Vowels from a String
Program to remove vowels from String
In this problem, we’re going to code a java Program to remove vowels from String. Take a string input from the user and store it in a variable called as “s” (in this case) .‘A’, ‘E’, ‘I’, ‘O’, ‘U’ are five vowels out of 26 characters in English alphabet letters.*/ 

import java.util.*;

class RemoveVowels{

    public static String remove(String str){

        String newStr = "";

        for(int i=0;i<str.length();i++){

            if(isVowel(str.charAt(i))){
                continue;
            }else{
                newStr += str.charAt(i);
            }
        }

        return newStr;

    }

    public static Boolean isVowel(char ch){

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
        {
            return true;
        }else{
            return false;
        }
    }

    static String remVowel(String str) {

        return str.replaceAll("[aeiouAEIOU]", "");

    }

}

class RemoveVowels_test{

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String:");
        String str = sc.nextLine();

        System.out.println("String Without Vowels is="+RemoveVowels.remove(str));
        System.out.println("Another Method String Without Vowels is="+RemoveVowels.remVowel(str));
        
    }
}