package reflection.MapperTest;


import java.lang.reflect.Field;
import java.util.Map;

public class ObjectMapperUtil {

    public static <T> T toObject(
            Class<T> clazz,
            Map<String, Object> properties) {

        try {
            // 1️⃣ create object dynamically
            T obj = clazz.getDeclaredConstructor().newInstance();

            // 2️⃣ get all fields
            Field[] fields = clazz.getDeclaredFields();

            // 3️⃣ loop through fields
            for (Field field : fields) {

                String fieldName = field.getName();

                // 4️⃣ match map key with field name
                if (properties.containsKey(fieldName)) {

                    field.setAccessible(true);

                    Object value = properties.get(fieldName);

                    // 5️⃣ set field value
                    field.set(obj, value);
                }
            }

            return obj;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
