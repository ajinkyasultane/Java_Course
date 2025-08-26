import java.util.Scanner;

public class Switch_Case {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a day name and check your working or weekend status");

        String day = sc.nextLine();

        switch (day)
        {
            case "Monday" , "Tuesday" , "Wednesday","Thursday","Friday"-> System.out.println("This is Weekday");
            case "Saturday","Sunday"-> System.out.println("This is Weekend day");
            default -> System.out.println(day+" This is wrong day ");
        }
    }

}
