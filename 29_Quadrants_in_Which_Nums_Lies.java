/*Java program to find out the quadrant in which the given co-ordinate lie*/
import java.util.*;

class QuadrantLie{

    static public void MyMethod(int x,int y){

        if(x == 0 && y == 0){
            System.out.println("X="+ x +" and Y="+ y +" Lies On Origin");
        }else if(x==0){
            System.out.println("X="+ x +" and Y="+ y +" Lies On Y-Axis");
        }else if(y==0){
            System.out.println("X="+ x +" and Y="+ y +" Lies On X-Axis");
        }
        else if(x>0 && y>0){
            System.out.println("X="+ x +" and Y="+ y +" Lies On Y-Axis");
        }else if(x<0 && y>0){
            System.out.println("X="+ x +" and Y="+ y +" Lies in 2nd Second Quadrant");
        }else if(x<0 && y<0){
            System.out.println("X="+ x +" and Y="+ y +" Lies in 3rd Third Quadrant");
        }else if(x>0 && y<0){
            System.out.println("X="+ x +" and Y="+ y +" Lies in 4th Fourth Quadrant");
        }else{
            System.out.println("X="+ x +" and Y="+ y +" Invalid Coordinates");
        }
    }

}

class QuadrantLie_test{

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Enter First Coordinate X:");
        int x = sc.nextInt();

        System.out.println("Enter Second Coordination Y:");
        int y = sc.nextInt();

        QuadrantLie.MyMethod(x,y);
    }
}
