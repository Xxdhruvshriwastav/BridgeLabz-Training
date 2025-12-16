class VolumeOfCylinder {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the radius of the cylinder: ");

    double raduish = sc.nextDouble();
    System.out.print("Enter the height of the cylinder: ");
    double height = sc.nextDouble();

    double pi = 3.14;

    double voulome = pi * raduish * raduish * height;

    System.out.println("The volume of the cylinder is: " + voulome);
  }
}