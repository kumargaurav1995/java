import java.time.*;
import java.util.stream.Stream;

public class DateTimeApi {
    public static void main(String[] args){
        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.of(1995, Month.APRIL,12);
        System.out.println(d1);
        System.out.println(d2);

        LocalTime t1 = LocalTime.MIDNIGHT;
        LocalTime t2 = LocalTime.now();
        LocalTime t3 = LocalTime.of(12, 14);
        LocalTime t4 = LocalTime.now(ZoneId.of("Indian/Mauritius"));
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        for(String s: ZoneId.getAvailableZoneIds()){
            System.out.println(s);
        }


    }
}
