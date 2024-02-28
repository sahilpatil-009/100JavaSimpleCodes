/*Java Program to check a character is a Vowel or Consonant
Character is a vowel or consonant using java
Here, in this section we will discuss the program to check whether the character is a vowel or consonant using java. In this program we take a character from the user then check that entered character. A character is said to be a vowel if it is one of the five following alphabet – a, e, i, o, u. All the remaining alphabets are called consonants.*/ 


import java.util.*;
class Vowel_OR_Consoants{

    public static String CheckChar(char ch){

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            return "Vowel";
        }else{
            return "Consonant";
        }
    }
}

class Vowel_OR_Consoants_test{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter char:");
        char ch =  sc.next().charAt(0);  

        System.out.println(ch+" is "+Vowel_OR_Consoants.CheckChar(ch));

    }

}