import java.util.Scanner;
import java.util.Random;
public class If_Statement {
    public static void main(String args[])
    {
        //if statement

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your age and check you are eligible or not for voting");

        int age = sc.nextInt();

        if(age >= 18 && age<= 50)
        {
            System.out.println("You are a Yonger Voter");
        } else if (age > 50 ) {
            System.out.println("you are a older voter");
        }
        else if(age >= 10 && age<= 17)
        {
            System.out.println("You are a adult but not eligible for a vote ");
        } else if (age>=1 && age<=9)
        {
            System.out.println("Your are a Child");
        }
        else {
            System.out.println("You are not born yet");
        }


 sc.close();

        // Random Number Generate

        Random rm = new Random();

        int newrcno = rm.nextInt(2,2000);

        System.out.println("The Generated Random no is "+newrcno);
    }

}
