package reflection.JSONRepresentation;


public class JsonTest {

    public static void main(String[] args) {

        Student s = new Student(101, "Ashish", 22);

        String json = JsonUtil.toJson(s);

        System.out.println(json);
    }
}
