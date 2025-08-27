import java.util.Random;
import java.util.Scanner;

public class Guess_Number {
    public static void main(String args[])
    {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int guess ;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomnumber ;

        randomnumber =random.nextInt(min,max +1);
        System.out.println("Number Guessing Game");
        System.out.println("Enter a number between 1-100 ");

        do {
            System.out.println("Enter a Guess no");
           guess = sc.nextInt();
           attempts++;

        if (guess > randomnumber)
        {
            System.out.println("Too Low! Try again");
        } else if (guess < randomnumber)
        {
            System.out.println("Too High! Try again");
        }
        else
        {
            System.out.println("Correct! the number was "+randomnumber);
            System.out.println("# no of attempts is " + attempts);
        }
        }
        while (guess != randomnumber);

        System.out.println("The guess no is "+randomnumber + " and you won");
    }

}
