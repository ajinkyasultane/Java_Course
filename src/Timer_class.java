import java.util.Timer;
import java.util.TimerTask;

public class Timer_class {
    public  static void main(String[] args)
    {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            int count = 5;
            @Override
            public void run() {
                System.out.println("Hello Ajinkya");
                count--;
                if (count <= 0)
                {
                    System.out.println("Task Completed");
                timer.cancel();
                }
            }
        };

        timer.schedule(task,0,2000);
    }

    }


