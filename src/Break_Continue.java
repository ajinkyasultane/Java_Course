public class Break_Continue {
    public static void main(String args[])
    {
        int start = 1;
        System.out.println("The break statement");
        for(int i = start ; i<= 10 ; i++)
        {
            if (i == 5)
            {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println("\nThe continue statement");
        for (int i = start ; i<= 10; i++)
        {
            if (i == 5)
            {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
