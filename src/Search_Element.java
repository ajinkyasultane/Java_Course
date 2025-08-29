import java.util.Scanner;

public class Search_Element {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int size;
        int[] number;

        System.out.println("Enter the Size of Array : ");
        size = sc.nextInt();
        sc.nextLine();

        number = new int[size];

        for (int i=0; i< number.length; i++)
        {
            System.out.println("Enter the number : ");
            number[i] = sc.nextInt();

        }

       // int[] number = {1,3,4,6,7,34,54,9,8,11,23,43};
        //int target = 6;

        System.out.println("Enter a Element you want to find");
        int target = sc.nextInt();

        boolean isfound = false;

        for (int i = 0 ; i < number.length;i++)
        {
            if (target ==number[i])
            {
                System.out.println("Element is found at "+ i);
                isfound = true;
                break;
            }
        }
          if(!isfound)
    {
        System.out.println("Element is not found");
    }
    }
}
