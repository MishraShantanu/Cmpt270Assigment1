
import java.util.Scanner;

/**
 * NumberGuesser class prompt user to enter no until that is in the range of 1-100
 */
public class NumberGuesser {
    /**
     * start the execution of class
     *  @param args type string[]
     */
    public static void main(String[] args){
        int guess;
        do{ Scanner scanner = new Scanner(System.in);
            System.out.println("Guess a number between 1 and 100");
            guess = scanner.nextInt();
            if(guess<1){
                System.out.println("Too low..!!");
            }
            if(guess>100){
                System.out.println("Too High ..!!");
            }

            }while(guess < 1 || guess > 100);
        System.out.println("Valid guess");
    }
}
