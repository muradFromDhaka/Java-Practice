package Method;

public class Problem1 {
    public String name;
    public int age;

    public void displayName() {
        System.out.println("Nmae: " + name);
        System.out.println("Age: " + age);

    }

    public static void main(String[] args) {
        Problem1 s1 = new Problem1();
        s1.name = "Murad";
        s1.age = 25;
        s1.displayName();
    }
}
