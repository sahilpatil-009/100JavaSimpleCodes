/*HCF of two numbers in Java */ 

import java.util.*;
class HighestComminFactor{

    static public void MyMethod(int x,int y){

        int num1 = x, num2 = y, hcf=0;

        for (int i = 1; i <= num1 || i <= num2; i++)
        {
        if (num1 % i == 0 && num2 % i == 0)
            hcf = i;
        }

        System.out.println("The HCF: "+ hcf);
    }
}

class HighestComminFactor_test{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1:");
        int no1 = sc.nextInt();

        System.out.println("Enter Number 2:");
        int no2 = sc.nextInt();

        System.out.println("HCF of "+no1+" and "+no2+" is ");
        HighestComminFactor.MyMethod(no1,no2);

    }
}