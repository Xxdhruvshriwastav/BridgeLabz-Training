package reflection.StaticFieldReflection;



import java.lang.reflect.Field;

public class StaticFieldReflection {

    public static void main(String[] args) throws Exception {

        // Load class
        Class<?> clazz =
                Class.forName("reflection.StaticFieldReflection.Configuration");

        //  Get private static field
        Field field = clazz.getDeclaredField("API_KEY");

        //  Remove private restriction
        field.setAccessible(true);

        // Read old value
        String oldValue = (String) field.get(null);
        System.out.println("Old API KEY = " + oldValue);

        //  Modify static field value
        field.set(null, "NEW_SECRET_API_KEY_999");

        //  Read updated value
        String newValue = (String) field.get(null);
        System.out.println("New API KEY = " + newValue);
    }
}
