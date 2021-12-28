package Top50;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number to check if it is prime or not...");
        int x = sc.nextInt();
        int y =0;

        for(int i=2;i<x;i++){
            if(x%i == 0){
                y++;}
            }
        if(y>0){
            System.out.println("The number "+x+" is not a prime");}
        else{
            System.out.println("The number "+x+" is a prime");
        }

    }
}
