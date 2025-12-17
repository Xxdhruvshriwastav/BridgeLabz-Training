public class VolumeOfEarth {

public static void main (String [] args ) {

double radius =  6378; // in km 
double pi = 3.14;  

double volumeOfEarth = (4.0/3) * pi * radius * radius * radius;
double volumeInCubicMiles = volumeOfEarth * 0.239913;

System.out.println("Volume of Earth = " + volumeOfEarth + " cubic km"); 
System.out.println("Volume of Earth = " + volumeInCubicMiles + " cubic miles");
    

}

}
