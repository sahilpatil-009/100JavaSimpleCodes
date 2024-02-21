/*Maximum number of handshakes in Java
Here, we will discuss the maximum number of handshakes in java. The given program will find the maximum number of handshakes in a room. Suppose there are N persons in a room. We have to find the maximum number of Handshakes possible. Given the fact that any two persons shake hand only once.
Algorithm
For N = 8
handshakes  =  ( (N-1) * N ) / 2  =  ( 8 x 7 )/2  =  28
Print Result
*/

import java.util.*;
class MaxNumberOfShakeHands{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Person:");
        int n = sc.nextInt();

        int MaxNumberOfShakeHands = ((n-1)*n)/2;
        System.out.println(n+ " Peropes Max Shakes Hands Are: "+ MaxNumberOfShakeHands);
    }
}