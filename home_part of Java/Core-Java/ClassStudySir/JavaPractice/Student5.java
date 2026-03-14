public class Student5 {
    public long id;
    public String name;
    public int roll;
    public static String address;

    public Student5() {

    }
    public Student5(int pId, String pName, int pRoll) {
        this.id = pId;
        this.name = pName;
        this.roll = pRoll;
    }
        public Student5(int pId) {
        this.id = pId;
    }

    public void showDetails() {
        System.out.println("Student Name: " + name + ", Roll No: " + roll + ", Id: " + id);
    }

    public static void main(String[] args) {
        Student5.address= "Khulna";

        Student5 st1 = new Student5(1, "Ahmad", 1);
        Student5 st2 = new Student5(2, "Fahim", 2);
        Student5 st3 = new Student5();

        Student5.address= "Dhaka";

        System.out.println(st1.name);
        System.out.println(Student5.address);
        Student5.address= "Rajshahi";
        System.out.println(st2.name);
        System.out.println(Student5.address);   
        
        
        st1.showDetails();
        st2.showDetails();
        st3.showDetails();
          showDetails01();
        calculate(5.0,5.0);
    }

    public static String showDetails01() {
        System.out.println("Hello I am from Dhaka!");
        System.out.println("Bangladesh!!");

        return "Bangladesh!!";
    }

    public static Integer showDetails02() {
        System.out.println("Hello I am from Dhaka!");
        System.out.println("Bangladesh!!");

        return 5000;
    }

    public static Boolean showDetails03() {
        System.out.println("Hello I am from Dhaka!");
        System.out.println("Bangladesh!!");

        return true;
    }

    public static void calculate(double a, double b) {
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
    }
   public static void calculate(double a, int b) {
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
    }
       public static void calculate( int y) {
        int a = 5, b = 6;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
    }

    public static void calculate() {
        int a = 5, b = 6;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
    }

}
