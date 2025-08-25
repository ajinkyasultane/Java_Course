import java.util.Scanner;

public class nested_if {
public static void main(String args[])
{
    boolean isstudent ;
    boolean issenior ;
    double price ;

    Scanner sc  = new Scanner(System.in);

    System.out.println("Enter you are student or not in (True/false)format");
    isstudent = sc.nextBoolean();

    System.out.println("Enter you are senior or not in(True/false)");
    issenior = sc.nextBoolean();

    System.out.println("Enter the Price of Product");
    price = sc.nextDouble();

//    double seniordiscount = ((20/price)*100);
//    double studentdiscount = ((10/price)*100);

    double discountratestudent = 0.10;
    double discountratesenior = 0.20;

    double studentdiscount = price * discountratestudent ;
    double seniordiscoiunt = price * discountratesenior;

    System.out.println(studentdiscount);

    double studentfinaldiscount = price - studentdiscount;
    double seniorfinaldiscount = price - seniordiscoiunt;

    System.out.println(studentfinaldiscount);

    double all = price -(studentdiscount+seniordiscoiunt);

    double paymentall = price - all;

    double paymentstudent = price - studentfinaldiscount;
    double paymentsenior = price -seniorfinaldiscount;


 //   System.out.println(seniordiscount);
   // System.out.println(seniordiscount);
//    double total =  + studentdiscount;
//    double payment = price - total;

    if(isstudent)
    {
        if(issenior)
        {
            System.out.println("You Got a senior discount of 20%");

            System.out.println("You Got a Student discount of 10%");
//            System.out.println("Total Discount = "+ total);
           // double payment = price - total;
            System.out.println("You got a discount =  rs "+all);
            System.out.println("You need payment = "+paymentall);
        }
        else
        {
            System.out.println("You Got Student discount = " +studentfinaldiscount);
            System.out.println("You need to payment = "+paymentstudent);
        }
    }
    else
    {
        System.out.println("You don't got any discount "+price);
    }
}

}
