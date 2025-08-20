import java.sql.SQLOutput;
import java.util.Scanner;

public class User_Input {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your name");
       String name = sc.nextLine();
        System.out.println("The Name is "+ name);

    System.out.println("Enter your age");
    int age = sc.nextInt();
        System.out.println("Your age is "+age +"year old");

        System.out.println("Enter your CGPA");
        double cgpa = sc.nextDouble();
        System.out.println("your  CGPA is "+cgpa);


        System.out.println("Your are student true\false");
        boolean isstudent = sc.nextBoolean();
        System.out.println("You are Student "+isstudent);

        // is boolean witn if else

        if(isstudent)
        {
            System.out.println("You are Student");
        }
        else
        {
            System.out.println("You are not a student");
        }

        sc.close();
    }

}
