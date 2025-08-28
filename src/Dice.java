import java.util.Random;
import java.util.Scanner;

public class Dice {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();
    public static void main(String[] args)
    {
        int noofdice;
        int total =0;

        System.out.println("Enter the no of dice to roll");
        noofdice = sc.nextInt();

        if (noofdice > 0)
        {
            for (int i = 0; i < noofdice ;i++)
            {
                int roll = random.nextInt(1,7);
                System.out.println("You rolled : "+roll);
                printDie(roll);
                total += roll;
            }
            System.out.println("Total = " + total);

        }
        else
        {
            System.out.println("The no of dice is greater than 0");
        }
    }
    static  void printDie(int roll)
    {
        String dice1 = """
                --------
               |        |
               |   ●    |
               |        |
                --------
                """;

        String dice2 = """
                --------
               | ●      |
               |        |
               |      ● |
                --------
                """;
        String dice3 = """
                --------
               | ●      |
               |    ●   |
               |      ● |
                --------
                """;
        String dice4 = """
                --------
               | ●    ● |
               |    ●   |
               |      ● |
                --------
                """;
        String dice5 = """
                --------
               | ●    ● |
               | ●    ● |
               |      ● |
                --------
                """;
        String dice6 = """
                --------
               | ●    ● |
               | ●    ● |
               | ●    ● |
                --------
                """;

        switch (roll)
        {
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);

            default -> System.out.println("Invalid roll ");
        }
    }

}
