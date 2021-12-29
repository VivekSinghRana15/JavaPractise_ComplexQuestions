package Top50;

import java.util.Scanner;

public class MultiplyArrayBarringIndex {
    //We have to accept input integers and make an array out of them,
    // then create a new array that has values representing multiplication of all integers of first array
    // except the index on which this value is


    public static void main(String[] args) {

        System.out.println("Please enter the integers separated by comma(,):");
        Scanner sc = new Scanner(System.in);

        String stringOfInt = sc.nextLine();
        String[] strArray = stringOfInt.split(",");

        System.out.println("The length of array entered is: " + strArray.length);

        int[] intArray = new int[strArray.length];

        for (int x = 0; x < strArray.length; x++) {
            intArray[x] = Integer.parseInt(strArray[x]);
        }
        int multipleVal = 1;


        for (int y : intArray) {
            if (y != 0) {
                multipleVal = multipleVal * y;
            }
        }

        int[] resultArray = new int[strArray.length];

        for (int z = 0; z < strArray.length; z++) {
            if (intArray[z] != 0) {
                resultArray[z] = multipleVal / intArray[z];
            }
            if (intArray[z] == 0) {
                resultArray[z] = multipleVal;
                multipleVal = 0;
                for(int b = 0;b<z;b++){
                    resultArray[b] = 0;
                }

            }
        }

        System.out.println("The resulting array is: ");

        for (int a : resultArray) {
            System.out.print(a);
            System.out.print(",");
        }


    }
}
