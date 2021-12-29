package Top50;

import java.util.Scanner;

public class MultiplyArrayBarringIndex2 {

    //We have to accept input integers and make an array out of them,
    // then create a new array that has values representing multiplication of all integers of first array
    // except the index on which this value is
    //1,2,3,4,5


    public static void main(String[] args) {

        System.out.println("Please enter the integers separated by comma(,):");
        Scanner sc = new Scanner(System.in);

        String stringOfInt = sc.nextLine();
        String[] strArray = stringOfInt.split(",");

        System.out.println("The length of array entered is: " + strArray.length);

        int[] intArray = new int[strArray.length];
        int[] finalArray = new int[strArray.length];

        for (int x = 0; x < strArray.length; x++) {
            intArray[x] = Integer.parseInt(strArray[x]);
        }
        int multiple=1;

        for(int x=0;x< strArray.length;x++){
            for(int y=0;y<strArray.length;y++){
                if(y!=x){
                multiple = multiple*(intArray[y]);}
            }
            finalArray[x]=multiple;
            multiple=1;

        }

        System.out.println("The final array is: ");
        for(int z:finalArray){
            System.out.print(z+"  ");
        }


    }

}
