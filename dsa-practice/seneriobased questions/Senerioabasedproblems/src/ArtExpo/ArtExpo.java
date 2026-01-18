package ArtExpo;

import java.util.Scanner;


public class ArtExpo {

    // Insertion Sort by registration time
    public static void insertionSort(Artist[] artists) {

        for (int i = 1; i < artists.length; i++) {

            Artist key = artists[i];
            int j = i - 1;

            // shift artists registered later
            while (j >= 0 && artists[j].registrationTime > key.registrationTime) {
                artists[j + 1] = artists[j];
                j--;
            }

            // insert at correct position
            artists[j + 1] = key;
        }
    }

    // Display artist list
    public static void printArtists(Artist[] artists) {

        for (Artist a : artists) {
            System.out.println(
                "Artist: " + a.name +
                " | Registration Time: " + a.registrationTime
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of artists: ");
        int n = sc.nextInt();

        Artist[] artists = new Artist[n];

        System.out.println("Enter artist name and registration time:");

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            long time = sc.nextLong();
            artists[i] = new Artist(name, time);
        }

        System.out.println("\nBefore sorting:");
        printArtists(artists);

        insertionSort(artists);

        System.out.println("\nAfter sorting by registration time:");
        printArtists(artists);

        sc.close();
    }
}
