import java.util.Scanner;

public class Weight_Conversion {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double weight ;
        double lbs ;
        int choice ;
        double newweight ;

        System.out.println("Enter 1 for convert  Weight to lbs");
        System.out.println("Enter 2 for convert lbs to weight");

        choice = sc.nextInt();
        if (choice == 1)
        {
            System.out.println("Enter weight in kgs");
            weight = sc.nextDouble();
            newweight = weight * 2.20462;
            System.out.printf("The new Weight in Lbs is %.2f",newweight);
        } else if (choice==2)
        {
            System.out.println("Enter weight in lbs");
            weight = sc.nextDouble();
            newweight = weight * 0.453592;
            System.out.printf("The new Weight in Kgs is : %.2f",newweight);
        }
        else
        {
            System.out.println("Enter a valid choice , you put wrong choice");
        }



        sc.close();
    }

}
