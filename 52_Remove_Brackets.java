/*Java program to remove brackets from an algebraic expression
Remove brackets from an algebraic expression
In this program, we’re going to remove brackets from an algebraic expression. Take a String input from the user and store it in the variable called “s”. After that use replaceAll() method which was present in string class the work of replaceAll() method is to replace some old thing with some new thing so here we’re using a regular expression to replace brackets with white spaces from an algebraic expression like s.replaceAll(“[(){}]”,””) and after that simply print new expression which doesn’t have any brackets.*/ 

import java.util.*;
class RemoveBrackets{

    public static String removeBrackets(String str){

        String newStr = "";
        for(int i=0;i < str.length(); i++){
            if(str.charAt(i) == '(' || str.charAt(i) == ')' || str.charAt(i) == '{' || str.charAt(i) == '}' || str.charAt(i) == '[' || str.charAt(i) == ']'){
               continue;
            }
             newStr+= str.charAt(i);
        }

        return newStr;
    }

    public static String AnotherMethod(String str){
        
        String result = str.replaceAll("[(){}]","");
        return result;

    }

}

class RemoveBrackets_test{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Arithmatic Equation :");
        String str = sc.nextLine();

        System.out.println("String is: "+RemoveBrackets. removeBrackets(str));
        System.out.println("String is: "+RemoveBrackets. AnotherMethod(str));
    }
}