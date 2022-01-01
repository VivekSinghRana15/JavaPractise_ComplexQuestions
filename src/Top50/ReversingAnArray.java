package Top50;

public class ReversingAnArray {

    public static void main(String[] args){

        Object[] inputArray = {1,'a',1.2,"name",2,null};
        Object[] outputArray = new Object[inputArray.length];
        System.out.println("The entered array is: ");
        for(Object x:inputArray){
        System.out.print(x+"  ");}
        System.out.println();

        for(int y=0;y< inputArray.length;y++){
            outputArray[(inputArray.length-1)-y]=inputArray[y];
        }
        System.out.println("The reversed array is: ");
        for(Object z:outputArray){
            System.out.print(z+"  ");}

    }
}
