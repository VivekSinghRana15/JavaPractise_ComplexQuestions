package Top50;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VowelOrNotInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a String to check if it has Vowel(a,e,i,o or u) present or not..");
        String enteredString = sc.nextLine();
        enteredString = enteredString.replace(" ", "");
        enteredString = enteredString.toLowerCase();
        List<String> vowelsPresent = new ArrayList<String>();

        String[] alphabetsInString = enteredString.split("");
        System.out.println("The entered string broken into characters is: ");
        for (String x : alphabetsInString) {
            System.out.print(x);
        }
        System.out.println();

        int a=0,e=0,i=0,o=0,u=0;

        for(String x:alphabetsInString){
            if(x.matches(".*[aeiou].*")){
                if(x.matches("a") && a==0){vowelsPresent.add("a"); a++;}
                if(x.matches("e") && e==0){vowelsPresent.add("e"); e++;}
                if(x.matches("i") && i==0){vowelsPresent.add("i"); i++;}
                if(x.matches("o") && o==0){vowelsPresent.add("o"); o++;}
                if(x.matches("u") && u==0){vowelsPresent.add("u"); u++;}
            }
        }

        if(a==1 || e==1 || i==1 || o==1 || u==1){
        System.out.println("The entered string contains following vowels:");
        System.out.println(vowelsPresent);}
        else{
            System.out.println("There is no vowel present in the sentence entered..");
        }

    }
}
