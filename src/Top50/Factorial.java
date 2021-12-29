package Top50;

import java.util.Scanner;

public class Factorial {

    //Factorial of 4 is: 4x3x2x1=24

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number to find out the factorial of the same: ");
        int x= sc.nextInt();
        int factorial = x;

        System.out.println("The factorial of "+x+ " is: ");
        System.out.print(factorial);
        for(int y=x-1;y>0;y--){
            System.out.print("x"+y);
            factorial = factorial*y;
        }

        System.out.print(" = "+factorial);

    }
}
