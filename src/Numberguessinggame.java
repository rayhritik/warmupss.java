import java.security.SecureRandom;
import java.util.Scanner;

public class Numberguessinggame {
    public static void main (String[]args)
    {
        Scanner keyboard = new Scanner(System.in);
        SecureRandom randomNumGenrator = new SecureRandom();

        int userGuessCount = 0;

        int compNum = randomNumGenrator.nextInt(10)+1;
        int userGuess=0;

        do {
            System.out.printf("enter your guess (1-10): ");
            userGuess = keyboard.nextInt();
            userGuessCount++;

            if (userGuess<compNum)
                System.out.printf("higher%n");
            else if (userGuess>compNum)
                System.out.printf("lower%n");
        }
        while (userGuess !=compNum);

        System.out.printf("You guess it in %d attempts%n", userGuessCount);

    }
}
