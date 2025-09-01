import java.util.Scanner;

public class Exception {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter your age : ");
            int age = sc.nextInt();
            System.out.println("Your age is : "+age);
        }
        catch (java.lang.Exception e )
        {
            System.out.println("Something Went Wrong :");
        }
        finally {
            sc.close();
            System.out.println("This block is executed");
        }
    }

}
