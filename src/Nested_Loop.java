import java.util.Scanner;

public class Nested_Loop {
    public static void main(String agrs[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows no");
        int rows = sc.nextInt();

        System.out.println("Enter column no");
        int columns = sc.nextInt();

        System.out.println("Enter Symbol ");
        char symbol = sc.next().charAt(0);

        for(int i = 0; i < rows ; i++)
        {
            for (int j = 0; j < columns ; j++)
            {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }

}
