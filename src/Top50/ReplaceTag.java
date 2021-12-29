package Top50;

import java.util.Scanner;

public class ReplaceTag {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a value inside tags");
        String enteredVal = sc.nextLine();

        String finalVal = enteredVal.replaceAll("<.*?>","");

        System.out.println("The String without tags is:");
        System.out.println(finalVal);

    }
}
