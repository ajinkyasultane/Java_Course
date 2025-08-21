import java.lang.Math;
import java.util.Scanner;

public class Math_Function {
    public static void main(String args[])
    {
        System.out.println("The value of pi is "+ java.lang.Math.PI);
        System.out.println("The Value of e is "+ java.lang.Math.E);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no to find a power ");

        int no1 = sc.nextInt();
        System.out.println("Enter a no who's power you find");
        int powno = sc.nextInt();
        System.out.println("The pow no is "+Math.pow(no1,powno));
        System.out.println("Enter a no two find a min and max no ");

       // int checkmax = sc.nextInt();

        System.out.println("Enter a first no");
        int no1max = sc.nextInt();

        System.out.println("ENter a second no");
        int no2max = sc.nextInt();

        System.out.println("The maximum no is "+ Math.max(no1max,no2max));

        //find a area of square

        System.out.println("Enter a length of one side of a Square");

        double square = sc.nextDouble();
        System.out.println("The Area of Square is "+ Math.pow(square,2));

        System.out.println("Check a hypothenius lenth");
        System.out.println("Enter side one length");
        int side1 = sc.nextInt();
        System.out.println("Enter side two length");
        int side2 = sc.nextInt();

        double hypothesis = (Math.pow(side1,2)+Math.pow(side2,2));

        System.out.println("The Hypothesis is "+Math.sqrt(hypothesis));

     // circumference of circle

        System.out.println("Enter the length of radius");
        double radius = sc.nextDouble();
        double circumference = 2 * Math.PI*radius;
        System.out.println("The Circumference is "+circumference);

        double area = Math.PI*Math.pow(radius,2);
        System.out.println("The Area of Circle is " +area);
        sc.close();
    }
}
