/*Java Program to Find Prime Number between 1 to 100
Finding Prime number between 1 to 100
Here, in this section we will discuss a program to find prime number between 1 to 100 in java. A prime number is a positive integer having exactly two factors. If 11 is a prime, then it’s only factors are necessarily 1 and 11 itself

Answer:2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
*/ 

// import java.util.Scanner;
class PrimeBetween{

    public static void MyMethod(){
        
        for(int i=2;i<100;i++)
        {   int res=0;
            for(int j=2;j<i;j++)
            {
                if(i%j != 0)
                {
                   res = i;
                }else{
                    i++;
                }
            }
            System.out.print(i+",");
        }
    }

    public static void Another_Method(){

        for(int i=2;i<100;i++)
        {
            if(isPrime(i)){
                System.out.print(i+",");
            }
        }
    }
    public static Boolean isPrime(int n){

        for(int i=2;i<n;i++)
        {
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}

class PrimeBetween_test{

    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        System.out.println("Prime Numbers Are:");
        PrimeBetween.MyMethod();
        System.out.println("\nANother Method:");
        PrimeBetween.Another_Method();
    }
}