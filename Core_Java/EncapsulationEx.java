package Method8;

public class EncapsulationEx {
    public static void main(String[] args) {
        Person per1 = new Person("Jon Doe", 23);
        Person per2 = new Person("Jon Doe", 23);
        Person per3 = new Person("Jon Doe", 23);

        per1.setName("Jon Doe");
        per1.setAge(24);
    }
}
