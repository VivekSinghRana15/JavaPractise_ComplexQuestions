package Top50;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        //GCD of 24 & 36
        //24x1      36x1
        //12x2      18x2
        //8x3        12x3
        // so 12 is the GCD

        System.out.println("Please enter all the numbers whose GHD you want to find, separated by comma");
        System.out.println("For example 36,24,48");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] numbers = input.split(",");
        System.out.println("The number of digits entered is: "+numbers.length);
        int[] numArray = new int[numbers.length];
        for (int x = 0; x < numbers.length; x++) {
            numArray[x] = Integer.parseInt(numbers[x]);
        }

        System.out.println("The entered numbers to check are: ");
        for (int x : numArray) {
            System.out.print(x + "  ");
        }
        System.out.println();


        List<Integer> divisors = new ArrayList<>();

        for (int x : numArray) {
            for (int y = x; y >= 1; y--) {
                if (x % y == 0) {
                    divisors.add(y);
                }
            }
        }

        System.out.println("The divisors for all numbers are: " + divisors);

        int count =0;
        for (int a = 0; a < divisors.size(); a++) {
            int resultNumber = divisors.get(a);
            for (int b = 0; b < divisors.size(); b++) {
                if(divisors.get(a)==divisors.get(b)){
                    count++;
                    if(count==numbers.length){
                        System.out.println("The GCD is: "+resultNumber);
                    break;}
                }
            }

        }
    }
}
