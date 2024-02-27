/*Counting number of days in a given month of a year
Number of days in a given month of a given year in  Java
 
In this page we will discuss the program to find the number of days in a given month of a given year in java . Number of days in any month of a year can vary specifically in February as the cycle of leap year repeats in every 4 years when the year is leap February gives the count to 29 days but the when the year is not leap it gives count to 28 days and so no of days in a year varies from 365 to 366.
*/

import java.util.*;
class NumOfDays{    

    public static void MyMethod(int year, int month){
        if((month == 2) && ((year%4==0) || ((year%100 !=0)&&(year%400==0)))){
            System.out.println("Number of Days in"+month+" are: 29");
        }
        else if(month==2){
            System.out.println("Number of Days in"+month+" are: 28");
        }
        else if(month==1 || month==3 || month ==5 || month== 7 || month == 8 || month ==10 || month ==12)
        {
            System.out.println("Number Days in "+month+" are: 31");
        }else{
            System.out.println("Number Days in "+month+" are: 30");
            
        }
    }

    public static void MyAnotherMethod(int year,int month){

        switch(month){

            //case for 31 days
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Number of Days in"+month+" are: 31");
            break;

            // case for 30 days
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Number of Days in"+month+" are: 30");
            break;
            
            case 2:
                if((year%400 == 0) || ((year%100!=0)&&(year%4==0))){
                    System.out.println("Number of Days in"+month+" are: 29");
                }
                else{
                    System.out.println("Number of Days in"+month+" are: 28");
                }
            break;

            default:
                System.out.println("Invalid Input !");
            break;
        }
    }

}
class NumOfDays_test{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Year:");
        int year = sc.nextInt();

        System.out.println("Enter Month:");
        int month = sc.nextInt();

        if(month<1 || month > 12){
            System.out.println("Invalid Input !");
        }else{
            NumOfDays.MyMethod(year, month);
            System.out.println("Second Method:");
            NumOfDays.MyAnotherMethod(year, month);
        }
    }
}