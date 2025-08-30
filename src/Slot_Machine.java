import java.util.Random;
import java.util.Scanner;

public class Slot_Machine {
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

         int balanace = 1000;
         int bet;
         int payout;
         String[] row;
         String playAgain;

        System.out.println("**********************");
        System.out.println("Symbols :\uD83E\uDEB7\uD83C\uDF49\uD83C\uDF47\uD83C\uDF53\uD83C\uDF45\uD83C\uDF4E");
        System.out.println("Welcome to Java Slots ");
        System.out.println("***********************");

        while (balanace > 0)
        {
            System.out.println("Current balance :" + balanace);
            System.out.print("Enter your bet amount : ");
            bet =scanner.nextInt();
            scanner.nextLine();

            if (bet > balanace)
            {
                System.out.println("Insufficient Funds");
                continue;
            }
            else if (bet <= 0)
            {
                System.out.println("Bet must be greater than zero");
            continue;
            }
            else
            {
                balanace -= bet;
                System.out.println("Available Balance : " + balanace);
            }

            System.out.println("Spinnig.......");
          row =  spinRow();
          printRow(row);
          payout = getPayout(row ,bet);

          if (payout > 0)
          {
              System.out.println("You won " + payout);
              balanace += payout;
          }
          else
          {
              System.out.println("Sorry you lost this round");
          }
            System.out.println("Do you want to play again? (Y/N)");
        playAgain = scanner.nextLine().toUpperCase();

        if (!playAgain.equals("Y"))
        {
            break;
        }
        }


        System.out.println("Game Over! , your final Balance is "+balanace);
        scanner.close();
    }
    static String[] spinRow()
    {
        String[] symbols = { " 🍉 ","🍇" ,"🍓"," 🍅 "," 🍎"};
      String[] row = new String[3];
        Random random = new Random();


        for (int i = 0 ; i < 3 ; i++)
        {
            row[i] = symbols[random.nextInt(0,5)];
        }

        return row;
    }
    static void printRow(String[] row)
    {
        System.out.println("***************************************");
        System.out.println(" " + String.join(" | ",row));
        System.out.println("***************************************");

    }
    static int getPayout(String[] row,int bet)
    {
        if (row[0].equals(row[1]) &&
                row[1].equals(row[2]))
        {
            return switch (row[0])
            {
                case " 🍉 " -> bet * 5;
                case "🍇" -> bet * 6;
                case "🍓" -> bet * 9;
                case " 🍅 " -> bet * 18;
                case " 🍎" -> bet * 36;
                default -> 0;

            };
        } else if ( row[0].equals(row[1])) {
            return switch (row[0])
            {
                case " 🍉 " -> bet * 2;
                case "🍇" -> bet * 4;
                case "🍓" -> bet * 8;
                case " 🍅 " -> bet * 10;
                case " 🍎" -> bet * 15;
                default -> 0;

            };
        }

    else if ( row[1].equals(row[2])) {
        return switch (row[1])
        {
            case " 🍉 " -> bet * 2;
            case "🍇" -> bet * 4;
            case "🍓" -> bet * 8;
            case " 🍅 " -> bet * 10;
            case " 🍎" -> bet * 15;
            default -> 0;

        };
    }

        else if ( row[0].equals(row[2])) {
            return switch (row[0])
            {
                case " 🍉 " -> bet * 2;
                case "🍇" -> bet * 4;
                case "🍓" -> bet * 8;
                case " 🍅 " -> bet * 10;
                case " 🍎" -> bet * 15;
                default -> 0;

            };
        }


        return 0;
    }

}
