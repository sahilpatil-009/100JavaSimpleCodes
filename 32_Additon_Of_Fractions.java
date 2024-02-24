/* Add two fractions using java 
In this article we will discuss the program for add two fractions using java. For this purpose we need to ask the user to enter two fractional values where each fraction must consist a Numerator and a Denominator.

Ex-
Enter numerator for first fraction : 1
Enter denominator for first fraction : 3
Enter numerator for second fraction : 3
Enter denominator for second fraction : 9
(1 / 3) + (3 / 9) = (2 / 3)

*/

import java.util.Scanner;
class fraction{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 1st number Numberator:");
        int nem1 = sc.nextInt();
        System.out.println("Enter 1st number Denominator:");
        int dem1 = sc.nextInt();

        System.out.println("Enter 2nd number Numberator:");
        int nem2 = sc.nextInt();
        System.out.println("Enter 2nd number Denominator:");
        int dem2 = sc.nextInt();

        System.out.println("Numbers are:\n"+nem1+"/"+dem1+" and "+nem2+"/"+dem2);
        System.out.println("Sum of Fractions is:\n");

        int nem;
        int dem;

        if(dem1 == dem2){

            int sum = nem1+nem2;
            System.out.println(sum+"/"+dem1);
        }else{

            int x = nem1*dem2;
            int y = dem1*dem2;

            int a = nem2*dem1;
            int b = dem2*dem1;

            System.out.println("Numbers are:\n"+x+"/"+y+" and "+a+"/"+b);
            int sum = x + a;
            
            nem = sum;
            dem = b;
            System.out.println("Addition is:\n"+sum+"/"+b);
            int n = 1;
                int p = nem;
                int q = dem;
            if(nem != dem)
            {
                while(n != 0)
                {
                    //storing remainder
                    n = nem % dem;			
                    if(n != 0)
                    {
                        nem = dem;
                        dem = n;
                    }
                }			
            }
            System.out.println("("+p/dem+" / "+q/dem+")");
                
            }

            
            //closing scanner class(not compulsory, but good practice)
            // sc.close();
    }
}
