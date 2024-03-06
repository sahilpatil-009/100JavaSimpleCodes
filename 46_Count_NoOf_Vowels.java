/*Java program to count the number of vowels in a String
Program to Count the Number of vowels
Program to Count the Number of vowels we’re going to check how many vowels are present in a given String . There are five vowels in English vocabulary, they are – ‘a’, ‘e’, ‘i’, ‘o’, ‘u’.

A String is entered in this case is “s” variable So, we need to check how many vowels are present in given string

For Example, in the string prepinsta then in that case then vowesl are 3 (a,e,i)*/

import java.util.*;
class CountVowels{

    String str;
    
    CountVowels(String str){
        this.str = str;
    }

    public int VowelCount(){

        int count=0;
        for(int i=0;i<str.length();i++){
            
            if(isVowel(str.charAt(i))){
                System.out.print(str.charAt(i)+",");
                count++;
            }
        }

        return count;
    }

    public Boolean isVowel(char ch){

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O'|| ch == 'U'){
            return true;
        }
        else{
            return false;
        }
    }
}

class CountVowels_test{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String:");
        String str = sc.nextLine();

        CountVowels cv =  new CountVowels(str);

        System.out.println("Number Of Vowels Are: "+cv.VowelCount());
    }
}