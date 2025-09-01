import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args)
    {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Banana");
        fruits.add("Coconut");
        fruits.add("Grapes");

        System.out.println(fruits);

        fruits.remove(0);
        fruits.set(2,"Watermelon");

        fruits.get(3);
        fruits.size();

        Collections.sort(fruits);

        System.out.println(fruits);

        for (String fruit : fruits)
        {
            System.out.println(fruit);
        }


        // throw user

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        System.out.println("Enter the no of food you would like :");

        int numoffood = scanner.nextInt();
        scanner.nextLine();

        for(int i = 1 ; i <= numoffood ; i++)
        {
            System.out.println("Enter the Food no " + i + ": ");
        String food = scanner.nextLine();
        foods.add(food);
        }

        System.out.println(foods);


        scanner.close();
    }

}
