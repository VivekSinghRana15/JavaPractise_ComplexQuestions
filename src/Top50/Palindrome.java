package Top50;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a word to check if it is palindrome(reverse of alphabets are same) or not..?");

        String word = sc.next();
        word = word.toLowerCase();
        String[] wordChars = word.split("");

        int a = wordChars.length;
        System.out.println("The length of ord is :"+a);
        String reverse= "";


        for(int i=(a-1) ;i>=0; i--){
            reverse= reverse+wordChars[i];
        }


        System.out.println("The reverse word is: "+reverse);


        if(reverse.equals(word)){
            System.out.println("The entered word ("+word+") is a palindrome");}
        else{System.out.println("The entered word ("+word+") is NOT a palindrome");}

    }
}
