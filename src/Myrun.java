public class Myrun implements Runnable{
 private final String text;


 Myrun(String text)
 {
     this.text  = text;
 }

    @Override
    public  void run()
    {
        for(int i = 1; i<=5; i++)
        {
            try {
                Thread.sleep(1000);
               System.out.println(Thread.currentThread().getName() + " Hello  "+text);
               // System.out.println(text);
            }
            catch (InterruptedException e)
            {
                System.out.println("Thread was interrupted");
            }
        }
    }

}
