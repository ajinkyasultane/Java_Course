import java.util.Scanner;

public class Array_User {
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        String[] foods ;
        int size;
        System.out.println("Enter the Size of Array");
        size = sc.nextInt();
        sc.nextLine();

        //int length = 4;

        foods = new String[size];


        for (int i = 0 ; i < foods.length; i++)
        {
            System.out.print("Enter a food   :  ");
            foods[i] = sc.nextLine();

        }

        for (String foodie : foods)
        {
            System.out.println(foodie);
        }
        System.out.println(foods.length);
        sc.close();
    }
}
