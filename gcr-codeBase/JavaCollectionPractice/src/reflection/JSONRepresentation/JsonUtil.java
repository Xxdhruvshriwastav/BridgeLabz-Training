package reflection.JSONRepresentation;


import java.lang.reflect.Field;

public class JsonUtil {

    public static String toJson(Object obj) {

        StringBuilder json = new StringBuilder();
        Class<?> clazz = obj.getClass();

        json.append("{\n");

        Field[] fields = clazz.getDeclaredFields();

        for (int i = 0; i < fields.length; i++) {

            Field field = fields[i];
            field.setAccessible(true);

            try {
                String name = field.getName();
                Object value = field.get(obj);

                json.append("  \"")
                    .append(name)
                    .append("\": ");

                // string formatting
                if (value instanceof String) {
                    json.append("\"").append(value).append("\"");
                } else {
                    json.append(value);
                }

                // comma handling
                if (i < fields.length - 1) {
                    json.append(",");
                }

                json.append("\n");

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        json.append("}");

        return json.toString();
    }
}
