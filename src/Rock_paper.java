import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Rock_paper {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] choice = {"rock", "paper", "scissors"};
        String playerchoice;
        String computerchoice;
        String playagian = "yes";


        do {



            System.out.println("Enter your move (rock , paper, scissors) ");
            playerchoice = sc.nextLine().toLowerCase(Locale.ROOT);

            if (!playerchoice.equals("rock")
                    && !playerchoice.equals("paper")
                    && !playerchoice.equals("scissors")) {
                System.out.println("Invalid Choice :");
                continue;
            }
            computerchoice = choice[random.nextInt(3)];
            System.out.println("Computer Choice : " + computerchoice);


            if (playerchoice.equals(computerchoice)) {
                System.out.println("It is a tie!");
            } else if ((playerchoice.equals("rock") && computerchoice.equals("scissors")) ||
                    (playerchoice.equals("paper") && computerchoice.equals("rock")) ||
                    (playerchoice.equals("scissors") && computerchoice.equals("paper"))) {
                System.out.println("You Win!");
            } else {
                System.out.println("You Lose !");
            }
            System.out.println("Play again (yes / no )");
            playagian = sc.nextLine().toLowerCase();
        }
        while (playagian.equals("yes"));
            sc.close();

        System.out.println("Thanks for Playing . Have a Nice Day");
    }

}
