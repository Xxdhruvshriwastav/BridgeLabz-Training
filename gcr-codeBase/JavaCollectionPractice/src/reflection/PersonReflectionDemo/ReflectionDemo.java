package reflection.PersonReflectionDemo;

import java.lang.reflect.Field;

public class ReflectionDemo {

    public static void main(String[] args) throws Exception {

        // Step 1: Create object of Person
        Person person = new Person();

        //  Get Class object
        Class<?> personClass = person.getClass();

        //  Get private field "age"
        Field ageField = personClass.getDeclaredField("age");

        //  Make private field accessible
        ageField.setAccessible(true);

        //  Read private field value
        int oldAge = (int) ageField.get(person);
        System.out.println("Old Age = " + oldAge);

        //  Modify private field value
        ageField.set(person, 30);

        // Read updated value
        int newAge = (int) ageField.get(person);
        System.out.println("New Age = " + newAge);
    }
}
