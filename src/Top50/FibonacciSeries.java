package Top50;

public class FibonacciSeries {

    public static void main(String [] args){

        int x =0;
        int y =1;
        System.out.println("The Fibonacci series is:");
        System.out.println(x);
        System.out.println(y);

        for(int i=1; i<=10; i++){
            int sum = x+y;
            System.out.println(sum);
            x=y;
            y=sum;
        }
    }
}
