package Top50;

import java.util.Locale;
import java.util.Scanner;

public class FirstRepeatedNonRepeatedChar {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a Word to check first repeated & non repeated character..");
        String enteredString = sc.nextLine();
        enteredString = enteredString.replace(" ","");
        enteredString = enteredString.toLowerCase();

        char[] charInString = enteredString.toCharArray();
        System.out.println("The entered string broken into characters is: ");
        for(char x:charInString){
        System.out.print(x);}
        System.out.println();

        int counter;
        int firstRepeated=0;
        int firstNonRepeated=0;

        for(int y=0;y<charInString.length;y++){
            counter=0;
            for(int z=0;z<charInString.length;z++){
                if(charInString[y]==charInString[z]){
                    counter++;
                }
            }
            if(counter>1 && firstRepeated==0){
                System.out.println("The first repeated character in the entered string is: "+charInString[y]);
                firstRepeated++;
            }
            if(counter==1 && firstNonRepeated==0){
                System.out.println("The first NON-repeated character in the entered string is: "+charInString[y]);
                firstNonRepeated++;
            }
        }if(firstRepeated==0){
            System.out.println("There is no character that is repeating...");
        }

    }
}
