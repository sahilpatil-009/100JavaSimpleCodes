/* Find the Factors of a Number in Java
Given an integer number as the input, the objective is to Find all the factors of a Number. Therefore, we’ll write a code to Find the Factors of a Number in Java Language.

Example
Input : 10
Output : 1, 2, 5*/

import java.util.Scanner;

class Findfactors{

    static void MyMethod(int no){

        System.out.print("Factors are:");
        int count=0;
        int num = no;
        // for(int i=1;i<no;i++){ Loop Run N time 
        for(int i=1;i<=(no/2);i++){ // in case n/2 loop runs Half time
            if(num % i == 0){
                System.out.print(i+" ");
            }
            count++;
        }
        System.out.print(no); //Enter Number itself
        System.out.println("\n"+count);
    }

}

class Findfactors_test{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number:");
        int no = sc.nextInt();

        Findfactors.MyMethod(no);

    }
}
