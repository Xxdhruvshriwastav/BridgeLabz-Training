package TravelLog;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class TravelLogManager {

    private static final String FILE_NAME = "trips.dat";

    public static void main(String[] args) {

        List<Trip> trips = new ArrayList<>();

        trips.add(new Trip("Paris", "France", 7,
                "Loved walking around Paris and visiting museums"));
        trips.add(new Trip("Rome", "Italy", 4,
                "Rome was historic and beautiful"));
        trips.add(new Trip("Paris", "France", 6,
                "Second visit to Paris was even better"));
        trips.add(new Trip("Berlin", "Germany", 8,
                "Berlin nightlife was amazing"));

        writeTrips(trips);
        List<Trip> loadedTrips = readTrips();

        summarizeTrips(loadedTrips);
    }

    private static void writeTrips(List<Trip> trips) {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(trips);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    private static List<Trip> readTrips() {
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (List<Trip>) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    private static void summarizeTrips(List<Trip> trips) {

        Pattern cityPattern = Pattern.compile("\\b[A-Z][a-z]+\\b");
        Set<String> uniqueCountries = new HashSet<>();
        Map<String, Integer> cityCount = new HashMap<>();

        System.out.println("=== Trips longer than 5 days ===");
        for (Trip trip : trips) {

            if (trip.getDuration() > 5) {
                System.out.println(trip);
            }

            uniqueCountries.add(trip.getCountry());

            cityCount.put(trip.getCity(),
                    cityCount.getOrDefault(trip.getCity(), 0) + 1);

            Matcher matcher = cityPattern.matcher(trip.getExperience());
            while (matcher.find()) {
                System.out.println("City mentioned in experience: " + matcher.group());
            }
        }

        System.out.println("\nUnique countries visited: " + uniqueCountries);

        System.out.println("\nTop 3 most visited cities:");
        cityCount.entrySet().stream()
                .sorted((a, b) -> b.getValue() - a.getValue())
                .limit(3)
                .forEach(e ->
                        System.out.println(e.getKey() + " -> " + e.getValue() + " visits"));
    }
}
