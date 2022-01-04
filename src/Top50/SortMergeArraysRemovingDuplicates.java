package Top50;

import java.util.Arrays;

public class SortMergeArraysRemovingDuplicates {

    public static void main(String[] args){
        int[] array1 = {1,2,3,4,7};
        int[] array2 = {3,4,5,6,7};
        Arrays.sort(array1);
        Arrays.sort(array2);
        int count = 0;
        int s=0;
        int[] resultArray = new int[array1.length+ array2.length];

        for(int x=0; x<array1.length;x++){
            resultArray[x]= array1[x];
            count++;
        }

        for(int y=0;y< array2.length;y++){
            for (int z=0;z< array1.length;z++){
                if(array2[y]==array1[z]){
                    System.out.println("The duplicate value being removed is: "+array2[y]);
                    s = 0;
                }
                else if(array2[y]!=array1[z]){
                    s++;
                }
            }
            if(s==array1.length){
                resultArray[count] = array2[y];
                count++;
                s=0;
            }else{s=0;}
        }

        int[] finalArray = new int[count];

        for(int a=0;a< finalArray.length;a++){
            finalArray[a]=resultArray[a];
        }

        System.out.println("The resultant array is: ");
        System.out.print("[ ");

        for(int b:finalArray){
            System.out.print(b+" ");
        }
        System.out.print("]");




    }
}
