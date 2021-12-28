package Top50;

import java.util.Scanner;

import static java.lang.Integer.valueOf;

public class ArmstrongNumber {
    //A number is called an Armstrong number if it is equal to the cube of its every digit.
    // For example, 153 is an Armstrong number because of 153= 1+ 125+27, which is equal to 1^3+5^3+3^3.
    // You need to write a program to check if the given number is Armstrong number or not.

    //Armstrong number 1: 0
    //Armstrong number 2: 1
    //Armstrong number 3: 153
    //Armstrong number 4: 370
    //Armstrong number 5: 371
    //Armstrong number 6: 407


    public static void main(String[] args){
        System.out.println("Please enter a number to check if it is an armstrong number...");

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println("The entered integer is :"+x);
        String s = String.valueOf(x) ;
        System.out.println("The converted value to String is: "+s);

        String[] y = s.split("");
        int length= y.length ;
        System.out.println("The length of entered integer is: "+length);

        int cal=0;

        for(int a=0;a<length;a++){
            int temp = Integer.parseInt(y[a]);
            int tempCube = temp*temp*temp;
            cal = cal+tempCube;
        }

        if(cal==x){
            System.out.println("The entered integer-"+x+" is an armstrong number");
        }
        else {
            System.out.println("The entered integer-"+x+" is NOT an armstrong number");}

    }

}
