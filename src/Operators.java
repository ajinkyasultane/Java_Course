
import java.util.Scanner;

public class Operators {

public static void main(String args[])
{
    // Arithmetic operators

//    int a = 9;
//    int b = 3;

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a value of element A");
    int elementa = sc.nextInt();

    System.out.println("Enter a value of element B");
    int elementb = sc.nextInt();

    int addtion = elementa+elementb;
    System.out.println("The Addition of two element is A + B = " +addtion );

    int sub = elementa - elementb;
    System.out.println("Substraction is "+sub);

    int mul = elementa* elementb;
    System.out.println("Multiplication is " + mul);

 int div = elementa / elementb ;
    System.out.println("Division is "+div);

    int modulus = elementa % elementb;
    System.out.println("Modulus is "+modulus);

    sc.close();
}

}
