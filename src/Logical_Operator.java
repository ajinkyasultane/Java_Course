import java.util.Scanner;

public class Logical_Operator {
    public static void main(String agrs[])
    {
        Scanner sc = new Scanner(System.in);

        String username ;

        System.out.println("Enter you Username");
        username = sc.nextLine();

        if (username.length() < 4 || username.length() > 12)
        {
            System.out.println("Username must be 4-12 character");
        } else if (username.contains(" ") || username.contains("*"))
        {
            System.out.println("Enter username withour spaces and any other special symbol");
        }
        else
        {
            System.out.println("Welcome "+username);
        }

    }
}
