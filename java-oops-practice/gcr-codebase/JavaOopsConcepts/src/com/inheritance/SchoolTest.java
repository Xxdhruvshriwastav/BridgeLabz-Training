package com.inheritance;

public class SchoolTest {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Anil Verma", 40, "Mathematics", 15);
        Student s1 = new Student("Ashish Kumar", 19, "B.Tech 1st Year");
        Staff st1 = new Staff("Ravi Sharma", 35, "Administration");

        t1.displayInfo();

        s1.displayInfo();

        st1.displayInfo();
    }
}
