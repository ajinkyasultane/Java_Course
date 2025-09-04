import javax.sound.sampled.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;
import javax.sound.sampled.*;

public class AlarmClock  implements  Runnable{

    private  final LocalTime alarmTime;
    private final String filePath;
    public  final Scanner scanner;

    AlarmClock(LocalTime alarmTime,String filePath , Scanner scanner)
    {
        this.alarmTime = alarmTime;
        this.filePath = filePath;
        this.scanner = scanner;
    }

    @Override
    public void run()
    {
LocalTime now = LocalTime.now();

while(LocalTime.now().isBefore(alarmTime))
{
    try {
        Thread.sleep(1000);
        int hours = now.getHour();
        int minutes = now.getMinute();
        int seconds = now.getSecond();

        System.out.println(hours + " " + minutes + " "+seconds);
    }
    catch (InterruptedException e)
    {
        System.out.println("Thread was Interrupted");
    }
}
        System.out.println("\n Alarm Noises");
        playSound(filePath);
    }

    private void playSound(String filePath)
    {
        File audiofile = new File(filePath);


        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(audiofile);
          Clip clip =AudioSystem.getClip();
          clip.open(audioInputStream);
          clip.start();
            System.out.println("Press *Enter* to stop the alarm : ");
            scanner.nextLine();
            clip.stop();



        }
        catch (UnsupportedAudioFileException e)
        {
            System.out.println("Audio file is not supportable");
        }
        catch (LineUnavailableException e)
        {
            System.out.println("Audio is UnAvailable");
        }
        catch (IOException e)
        {
            System.out.println("Error reading audio file");
        }

    }

}
