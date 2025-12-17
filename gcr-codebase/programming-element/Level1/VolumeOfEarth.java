public class VolumeOfEarth {

public static void main (String [] args ) {

// Assigning the value of variables    
double radius =  6378; // in km 
double pi = 3.14;  

// calculating the value of volumeOfEarth, volumeInCubicMiles     
double volumeOfEarth = (4.0/3) * pi * radius * radius * radius;
double volumeInCubicMiles = volumeOfEarth * 0.239913;

// Printing the value of volumeOfEarth, volumeInCubicMiles 
System.out.println("Volume of Earth = " + volumeOfEarth + " cubic km"); 
System.out.println("Volume of Earth = " + volumeInCubicMiles + " cubic miles");
    

    }
}
