package lambdaexpressions.HospitalAlertWithLambda;



import java.util.*;
import java.util.function.Predicate;

public class HospitalNotificationApp {

    public static void main(String[] args) {

        List<Alert> alerts = List.of(
                new Alert("EMERGENCY", "Patient heart rate critical"),
                new Alert("MEDICINE", "Take insulin at 8 AM"),
                new Alert("LAB", "Blood test report ready"),
                new Alert("APPOINTMENT", "Doctor visit at 5 PM")
        );

        
        Predicate<Alert> userPreference =
                alert -> alert.type.equals("EMERGENCY")
                      || alert.type.equals("MEDICINE");

        System.out.println("Filtered Notifications:\n");

        alerts.stream()
                .filter(userPreference)   
                .forEach(System.out::println);
    }
}
