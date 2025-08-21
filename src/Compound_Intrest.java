import java.util.Scanner;
import java.lang.Math;
public class Compound_Intrest {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        double principal;
        double rate;
        double timeofcompound;
        int year;

        System.out.println("Enter Principal Amount");
        principal = sc.nextDouble();

        System.out.println("Enter the Intrest rate");
        rate = sc.nextDouble() /100;

        System.out.println("Enter the Timeofcompound");
        timeofcompound = sc.nextDouble();

        System.out.println("Enter the no of year");
        year = sc.nextInt();

        double result = principal * Math.pow(1+rate/timeofcompound,timeofcompound*year);

        System.out.println("The Compounded Amount is " +result);

        sc.close();
    }

}
