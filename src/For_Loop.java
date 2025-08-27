public class For_Loop {
    public static void main(String args[]) throws InterruptedException
    {
//        String aj = "Ajinkya Sultane";
//     for(int i = 1; i <= aj.length() ; i++)
//     {
//         System.out.println(i);
//     }
//  System.out.println("The length is " + aj.length());

        int start = 10;
        for (int i = start ; i > 0 ; i--)
        {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Happy Birthday To You! ");
    }

}
