package reflection.MapperTest;

import java.util.HashMap;
import java.util.Map;

public class MapperTest {

    public static void main(String[] args) {

        Map<String, Object> map = new HashMap<>();

        map.put("id", 101);
        map.put("name", "Ashish");
        map.put("age", 22);

        Student student =
                ObjectMapperUtil.toObject(Student.class, map);

        System.out.println(student);
    }
}

