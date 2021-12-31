package Top50;

import java.util.Scanner;

public class RemoveDuplicates {

    //a,s,d,f,a,s,a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter an array of values in format a,x,\"Str\",1,1.2,$");
        String stringEntered = sc.nextLine();


        Object[] inputArray = stringEntered.split(",");
        System.out.println("The array entered is: ");
        for (Object a : inputArray) {
            System.out.print(a + "  ");
        }
        int len = inputArray.length;
        System.out.println("Length of array is: " + len);

        Object[] outputArray = new Object[len];

        for (int x = 0; x < len; x++) {
            for (int y = x + 1; y < len; y++) {
                if (!inputArray[x].equals(inputArray[y])){
                    if(y==inputArray.length-1){
                        outputArray[x]=inputArray[x];
                    }
                }
                else if(inputArray[x].equals(inputArray[y]) && y!= inputArray.length-1){
                    break;}
                else if (inputArray[x].equals(inputArray[y]) && y== inputArray.length-1){
                    outputArray[x]=inputArray[x];
                }
            }
        }

        System.out.println("The array after removing duplicates is: ");
        for (Object b : outputArray) {
            if(b!=null){
            System.out.print(b + "  ");}
        }

    }
}
