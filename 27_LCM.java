/*LCM of Two Numbers
 Least Common Multiple*/ 

import java.util.*;
class Lcm{

    static public void MyMethod(int no1, int no2){

        int lcm = 0;
        int max = (no1>no2) ? no1:no2;
        System.out.println("no1 "+no1+" no2 "+no2+" max "+max);

        for(int i=max;i<=no1*no2;i++)
        {
            if(i % no1 == 0 && i % no2== 0){
                lcm = i;
                break;
            }
            // System.out.println("i"+i);
        }

       System.out.println("Lcm of Number is: "+lcm);
    }

    static public int MySecondMethod(int no1, int no2){

        int lcm=0,hcf=0;
        
        for(int i =1;i<=no1 || i<= no2;i++)
        {
            if(no1 % i == 0 && no2 % i == 0){
                hcf = i;
            }
        }

        return (no1 * no2)/hcf;
    }
}

class Lcm_test{

    public static void main(String[] args){

        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter 1st no:");
        int no1 = sc.nextInt();

        System.out.println("Enter 2nd no:");
        int no2 = sc.nextInt();

       Lcm.MyMethod(no1,no2);
       System.out.println("Second Method Lcm of Number is: "+ Lcm.MySecondMethod(no1, no2));
    }
}