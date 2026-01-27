package reflection.Injectannotation;



import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class DIContainer {

    private static final Map<Class<?>, Object> objects = new HashMap<>();

    public static <T> T getBean(Class<T> clazz) {

        try {
            // create object
            T instance = clazz.getDeclaredConstructor().newInstance();

            // scan fields
            for (Field field : clazz.getDeclaredFields()) {

                //  check @Inject
                if (field.isAnnotationPresent(Inject.class)) {

                    Class<?> fieldType = field.getType();

                    //  reuse object if exists
                    Object dependency =
                            objects.get(fieldType);

                    if (dependency == null) {
                        dependency =
                                fieldType.getDeclaredConstructor().newInstance();
                        objects.put(fieldType, dependency);
                    }

                    // inject dependency
                    field.setAccessible(true);
                    field.set(instance, dependency);
                }
            }

            return instance;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
