package day5.ParkEase;

import java.util.ArrayList;
import java.util.List;

public class ParkingManager {

    private List<String> bookingRecords = new ArrayList<>();

    public void addLog(String log) {
        bookingRecords.add(log);
    }

    public void showLogs() {
        for (String log : bookingRecords) {
            System.out.println(log);
        }
    }
}

