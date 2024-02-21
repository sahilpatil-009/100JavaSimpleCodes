/*Permutations in which n people can occupy r seats in a classroom in java
Which n people can occupy r seats in a classroom in Java
Our Aim is to write a Java code to find all the possible permutations in which (n) people can occupy (r) number of seats in a classroom.

Suppose (n) number  students are looking to find (r) seats in a classroom so how will they do it . They will do it with simple formula which is given by 

 n P r  =    n! / (n-r)!

Input number of students in n
Input number of seats in r
Use permutation formula { factorial(n) / factorial(n-r) }
Print Output

 */

import java.util.*;
class Permutations{

     void MyMethod(int persons, int seats){
        int fact1, fact2;
        int diff = persons-seats;
        int ways; 
        //fact1 = MakeFactorial(persons);
        //fact2 = MakeFactorial(diff);
        fact1 = 1;
        for(int i=persons; i>1;i--){
            fact1 = fact1 * i;
        }

        fact2 = 1;
        for(int j=diff;j>1;j--){
            fact2 = fact2 * j;
        }

        ways = fact1 / fact2;
        System.out.println("Total Possible Arragenments are:"+ways);
    }

    // int MakeFactorial(int n){
    //     System.out.print("Enter into Recursion");
    //     if(n == 0)
	// 		return 1;
		
	// 	return n * MakeFactorial(n - 1);
    // }

}
class Permutations_test{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number Peoples:");
        int persons = sc.nextInt();

        System.out.println("Enter Number Seats:");
        int seats = sc.nextInt();

        // Permutations.MyMethod(persons,seats);

        Permutations p = new Permutations();
        p.MyMethod(persons,seats);
    }
}