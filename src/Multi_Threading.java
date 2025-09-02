public class Multi_Threading {
    public static void main(String[] args)
    {
      //  MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(new Myrun("Nivrutti"));
        Thread thread2 = new Thread(new Myrun("Ajinkya"));


        thread1.start();
        thread2.start();

    }

}
