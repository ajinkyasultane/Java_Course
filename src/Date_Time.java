import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date_Time {
    public static void main(String[] args)
    {
        LocalDate date  =LocalDate.now();

        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime datetime = LocalDateTime.now();
        System.out.println(datetime);

        Instant instant = Instant.now();
        System.out.println(instant);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm:ss");
        String newdatetime = datetime.format(dateTimeFormatter);
        System.out.println(newdatetime);

        LocalDate localDate = LocalDate.of(2024 ,11,02);

        System.out.println(localDate);
    }
}
