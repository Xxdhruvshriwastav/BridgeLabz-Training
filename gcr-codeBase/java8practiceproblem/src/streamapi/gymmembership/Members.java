package streamapi.gymmembership;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Members {

    public static void main(String[] args) {

        List<Gym> members = List.of(
                new Gym("Ashish", LocalDate.parse("2026-03-05")),
                new Gym("Neeraj", LocalDate.parse("2026-03-01")),
                new Gym("Shriyansh", LocalDate.parse("2026-02-20"))
        );

        LocalDate today = LocalDate.now();

        members.stream()
               .filter(m -> {
                   long daysLeft =
                           ChronoUnit.DAYS.between(today, m.getExpiryDate());
                   return daysLeft >= 0 && daysLeft <= 30;
               })
               .forEach(System.out::println);
    }
}
