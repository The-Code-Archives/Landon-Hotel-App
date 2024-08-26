package edu.wgu.d387_sample_code.timezone;

import org.springframework.web.bind.annotation.CrossOrigin;
import java.time.*;
import java.time.format.DateTimeFormatter;

@CrossOrigin(origins = "http:/localhost:4200")
public class TZConverter {
    public static String getTime() {
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

//        ZonedDateTime est = time.withZoneSameInstant(ZoneId.of("America/New York"));
//        ZonedDateTime mt = time.withZoneSameInstant(ZoneId.of("America/Denver"));
//        ZonedDateTime utc = time.withZoneSameInstant(ZoneId.of("UTC"));

        ZonedDateTime est = ZonedDateTime.of(time, ZoneId.of("America/New_York"));
        ZonedDateTime mt = ZonedDateTime.of(time, ZoneId.of("America/Denver"));
        ZonedDateTime utc = ZonedDateTime.of(time, ZoneId.of("UTC"));

        String times = est.format(formatter) + "EST | " + mt.format(formatter) + "MST | " + utc.format(formatter) + "UTC";
        return times;
    }
}
