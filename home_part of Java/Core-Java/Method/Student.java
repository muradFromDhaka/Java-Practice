package Method;

public class Student {
    public Long id;
    public String name;
    public String department;
    public String address;
    public static String school = " ABC School , Chakaria, Cox's Bazar.";

    //(Constractor method)
    public Student(Long i, String n, String d, String a) {
        this.id = i;
        this.name = n;
        this.department = d;
        this.address = a;
    }

    //(Static method)
    public static void School() {
        System.out.println("School: " + school);
    }

    //(instance method)
    public void showInfo() {
        System.out.println("id: " + id + " Name " + name + " Department: " + department + " address: " + address);

    }

    public static void main(String[] args) {
        Student s1 = new Student(101L, "Rajon", "B", "Tangail");
        Student s2 = new Student(101L, "Arman", "C", "Manikgonj");
        Student s3 = new Student(101L, "Limon", "D", "Monmonsing");
        Student s4 = new Student(101L, "Mehadi", "B", "Borisal");
        Student s5 = new Student(101L, "Manik", "C", "Tangail");


        Student.School();
        s1.showInfo();
        s2.showInfo();
        s3.showInfo();
        s4.showInfo();
        s5.showInfo();
        s1.showInfo();

    }
}