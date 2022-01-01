package Top50;

import java.util.*;

public class Anagram {

    public static void main(String[] args) {

        //Mother-in-law = Hitler woman.
        //Debit card = Bad credit.
        //Dormitory = Dirty room.
        //The earthquakes = The queer shakes     is not
        //Astronomer = Moon starer.
        //Punishments = Nine thumps.
        //School master = The classroom.

        System.out.println("Please enter two sentences to check if they are Anagram or not..");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first sentence to check");
        String first = sc.nextLine();
        System.out.println("Please enter second sentence to check");
        String second = sc.nextLine();

        first = first.toLowerCase().replace(" ", "");
        second = second.toLowerCase().replace(" ", "");
        System.out.println(first);
        System.out.println(second);

        String[] firstArray = first.split("");
        String[] secondArray = second.split("");

        List<String> firstList = Arrays.asList(firstArray);
        List<String> secondList = Arrays.asList(secondArray);
        Collections.sort(firstList);
        Collections.sort(secondList);
        System.out.println("The list of first is:");
        for(String a:firstList){
            System.out.print(a);
        }
        System.out.println();
        System.out.println("The list of second is:");
        for(String b:secondList){
            System.out.print(b);
        }
        System.out.println();
        int counter=0;

        for(int x=0;x<firstList.size();x++){
            if(!firstList.get(x).equals(secondList.get(x))){
                System.out.println("The entered strings are not Anagram...");
                counter++;
                break;
            }
        }
        if(counter==0){
        System.out.println("The entered strings are Anagram..");}


    }
}

