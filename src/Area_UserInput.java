import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Area_UserInput {
    public static void main(String agrs[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of Rectangle");
        double length = sc.nextDouble();
        System.out.println("Enter the width of Rectangle");
        double width = sc.nextDouble();

        double area = length * width ;

        System.out.println("The Area of Rectangle is = "+ area);


        System.out.println("Calculate the Area of Square");
        System.out.println("Enter the Length of Square");
        double sqlenth = sc.nextDouble();

        double squarearea = sqlenth * sqlenth ;

        System.out.println("The area of sqaure is = "+squarearea);

    }

}
