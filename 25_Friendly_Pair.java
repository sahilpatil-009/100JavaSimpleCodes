/*Friendly pair or not (amicable or not) using Java
Check Whether or Not the Two Numbers are a Friendly Pair in Java
Given Two integer inputs as the numbers, the objective is to check whether the ratio of the sum of the factors of the number except the number itself upon the number, of the both numbers, matches or not. Therefore, we’ll write a code to Check Whether or Not the Two Numbers are a Friendly Pair in Java Language.
Example
Input : 6 12
Output : Yes, they are a friendly pair.

Example
Input : 6 28
Output : Yes, they are a friendly pair
Explanation : The factors of 6 and 28 except the numbers themselves are 1, 2, 3 and 1, 2, 4, 7, 14 respectively.
Now the sum of factors of both the numbers are 6 and 28 respectively. 
When we divide the sums with the numbers we get 1 and 1 respectively. 
As the ratio of both the number match, they are considered as a friendly pair.

 */

import java.util.Scanner;

class Friendly_Pair{

    static public void Check_Friendly_Pair(int no1, int no2){
        
        int sum1 = getFactorSum(no1); 
        int sum2 = getFactorSum(no2);

        if(sum1/no1 == sum2/no2){
            System.out.println (no1 + " & " + no2 + " are friendly pairs");
        }else{
             System.out.println (no1 + " & " + no2 + " are not friendly pairs");
        }
    }
    
    static public int getFactorSum(int num){
        int sum=0;
        for(int i=1;i<num;i++){

            if(num%i==0)
            {
                sum+=i;
            }
        }
        return sum;
    }

}

class Friendly_Pair_test{

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st Number:");
        int n1 = sc.nextInt();

        System.out.println("Enter 2st Number:");
        int n2 = sc.nextInt();

        Friendly_Pair.Check_Friendly_Pair(n1,n2);

    }
}