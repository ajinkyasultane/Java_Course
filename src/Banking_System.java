import java.util.Scanner;

public class Banking_System {

 static Scanner sc = new Scanner(System.in);

    public static void main(String[] agrs)
    {
        double balance = 1000;
        boolean isrunning = true;
        int choice ;

        while (isrunning)
        {

            System.out.println("*************************************************************************************");
            System.out.println("Banking Program");
            System.out.println("*************************************************************************************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("*************************************************************************************");


            System.out.println("Enter your choice (1-4)");
            choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    showbalance(balance);
                    break;
                }
                case 2:
                {
                   // deposit();
                    balance = balance + deposit();
                    break;
                }
                case 3:
                {
                    balance = balance - withdrawl(balance);
                    System.out.println("Your current balance is "+balance);
                    break;
                }
                case 4:
                {
                   isrunning = false;
                    System.out.println("Thank you! Have a Nice Day");

                    break;
                }
                default:
                {
                    System.out.println("You Enter Wrong Choice Plase check and enter new choice");
                }
            }

        }

        sc.close();
    }
    static void showbalance(double balance)
    {
        System.out.println("******************************************** ");
        System.out.printf("Your current balance is %.2f\n" , balance);
    }
    static double deposit()
    {
     double amount ;
        System.out.println("Enter a Amount to be deposited :");
       amount = sc.nextDouble();

       if (amount < 0)
       {
           System.out.println("Amount can't be negative");
           return 0;
       }
       else {
           return amount;
       }
    }

    static double withdrawl(double balance)
    {
        double withdraw;
        System.out.println("Enter amount you want to withdraw");
        withdraw = sc.nextDouble();
        if (withdraw >= balance)
        {
            System.out.println("Your withdrawal amount is greater than your current balance");
       return 0;
        }
        else {
            System.out.println("you withdraw rs "+ withdraw);
            return  withdraw;
        }


    }

}
