import java.util.Scanner;

 class Calculator {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;

        System.out.println("Enter num1");
        num1 = sc.nextDouble();

        System.out.println("Enter a any Operator (+,_,*,/,^");
        operator = sc.next().charAt(0);

        System.out.println("Enter num2");
        num2 = sc.nextDouble();

        switch (operator)
        {
            case '+'-> result = num1 + num2 ;
            case '-'-> result = num1 - num2;
            case '*'-> result = num1 * num2;
            case '/' ->
            {
                if (num2 == 0)
                {
                    System.out.println("Cannot divide by zero");
                }
                else
                {
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1,num2);
            default -> {
                System.out.println("you enter wrong operator");

            }

        }
        System.out.println("The Result is = "+result);
    }
}
