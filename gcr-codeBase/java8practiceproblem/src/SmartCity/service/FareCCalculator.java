package SmartCity.service;

@FunctionalInterface
public interface FareCCalculator {

    double calculateFare(double distance);
}