package TravelLog;
import java.io.Serializable;

public class Trip implements Serializable {
    private static final long serialVersionUID = 1L;

    private String city;
    private String country;
    private int duration; // in days
    private String experience;

    public Trip(String city, String country, int duration, String experience) {
        this.city = city;
        this.country = country;
        this.duration = duration;
        this.experience = experience;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public int getDuration() {
        return duration;
    }

    public String getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return city + ", " + country + " (" + duration + " days)";
    }
}
