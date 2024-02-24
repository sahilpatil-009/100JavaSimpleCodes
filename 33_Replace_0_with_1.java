/*Replace all 0’s with 1 in a given integer using Java
Replace all 0’s with 1 using Java 
In this article we will create a  program to replace all 0’s with 1 using java. For this purpose we will ask the user to enter a positive number and check each digit one by one that it is equal to 0 or not. If the digit is equal to 0 then replace the digit by 1, and else no change. 

Enter the number : 706120678
Converted number : 716121678

*/ 
import java.util.Scanner;
class ReplaceNum{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int num = sc.nextInt();

        String numStr = Integer.toString(num);
        // String numStr = String.valueOf(no);
        String newStr = "";
        System.out.println("here");
        System.out.println(numStr);
        int length = numStr.length();

        for(int i=0;i<length;i++){

            if(numStr.charAt(i) == '0'){
                newStr = newStr + '1';
            }
            else{
                newStr = newStr + numStr.charAt(i);
            }
        }
        System.out.println("New String is="+ newStr);
    }
}