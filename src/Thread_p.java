import java.util.Scanner;

public class Thread_p {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("You have 5 second to enter your name ");

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true);
        thread.start();

        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Hello " + name);


        sc.close();
    }
}
