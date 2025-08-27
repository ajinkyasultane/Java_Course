import java.util.Scanner;

public class While_Loop {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = sc.nextInt();

        while(age < 0 || age > 150) {
            System.out.println("your age should not be negative and not greater than 150 year");
            System.out.println("Enter new positive age");
            age = sc.nextInt();
        }

        System.out.println("Your age is "+age);


        System.out.println("Enter a number");
        int number = sc.nextInt();

        while (number < 1 || number > 10)
        {
            System.out.println("Enter a number between 1-10 ");
            number = sc.nextInt();

        }
        System.out.println("The Number is "+ number);

        sc.close();
    }
}
