/*Java program to toggle each character in a string
Toggle each character in a String
In this java program we’re going to make a program to toggle each character in a String , First we will take String input from user  . 
If the letter is in uppercase we will convert it to lowercase and if it is in uppercase we will convert it to lowercase.*/ 

import java.util.*;
class ToggleEachChar{

    public static String toggleString(String str){

        String st = str;
        String newStr = "";
        for(int i=0;i < st.length();i++){
            
            if(Character.isUpperCase(st.charAt(i))){
                
                newStr = newStr + Character.toLowerCase(st.charAt(i));
            }else{
                newStr = newStr +Character.toUpperCase(st.charAt(i));
            }
        }
        return newStr;
        // System.out.println("Here");
        // System.out.println(newStr);
    }

}

class ToggleEachChar_test{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String:");
        String str = sc.nextLine();

        System.out.println(ToggleEachChar.toggleString(str));
        // ToggleEachChar.toggleString(str);
    }
}
