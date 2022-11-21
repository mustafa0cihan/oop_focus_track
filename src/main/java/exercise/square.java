package exercise;
import java.util.Scanner;
public class square {

    public static int mySquareMethod ( int myNumber ){
        return myNumber*myNumber;
    }

    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.print("Please enter a number: ");
            int pNumber = scan.nextInt();

            int result = mySquareMethod(pNumber);

        System.out.println("Square of your number : " + result);
        }
}

