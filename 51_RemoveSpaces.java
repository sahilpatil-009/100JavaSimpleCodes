/*Java program to Remove spaces from a string
Remove spaces from String
In this page we will look at how to write a java program to remove spaces from a string. 

Here we will store the string in a character array lets say s and that original string will contain the spaces in between.
Example:- 

Input string : “Prep  insta”,
Output string : “Prepinsta”;
*/ 

import java.util.*;
class RemoveSpace{

    public static String removeSpace(String str){

        String newStr = "";

        for(int i=0;i<str.length();i++){

            if(str.charAt(i) == ' '){   
                continue;
            }
            else{
                newStr += str.charAt(i);
            }

        }

        return newStr;
    }

    public static StringBuffer AnotherMethod(String str){
      
      char[] c = str.toCharArray();
	  StringBuffer sb = new StringBuffer();
	  
	  for (int i = 0; i < c.length; i++) {
	     if( (c[i] != ' ') && (c[i]!= '\t' )) {

	    	 sb.append(c[i]);

	        }    	
          }

	    return sb;
    }
}

class RemoveSpace_test{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String:");
        String str = sc.nextLine();

        System.out.println("Output is: "+ RemoveSpace.removeSpace(str));
        System.out.println("Output AnotherMethod is: "+ RemoveSpace.AnotherMethod(str));

    }
}