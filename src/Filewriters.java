import java.io.FileWriter;
import java.io.IOException;

public class Filewriters {
    public static void main(String[] args)
    {

        try(FileWriter writer = new FileWriter("test.txt"))
        {
            writer.write("I Like Samosa");
            System.out.println("File has been Writen");
        }
        catch (IOException e)
        {
            System.out.println("Could not write file");
        }



    }
}
