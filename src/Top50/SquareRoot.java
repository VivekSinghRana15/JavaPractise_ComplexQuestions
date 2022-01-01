package Top50;

import java.util.Scanner;

public class SquareRoot {

    public static void main(String[] args) {

        System.out.println("Please enter number for ehich square rooth has to be calculated");

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for(int x=1;x<=input;x++){
            int divisor = input/x;
            int remainder = input%x;
            if(divisor==x && remainder ==0){
                System.out.println("The square root of "+input+" is "+x);
                break;
            }
            if(x==input){
                System.out.println("There is no square root of "+input);
            }
        }

    }
}
