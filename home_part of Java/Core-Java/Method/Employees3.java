package Method;

public class Employees3 {
    public Long id;
    public String name;
    public String designation;
    public double salary;
    static String Company = "ABC Garments Ltd"; // (static variable, because all employee are same compony)

    // (Constructor, constructor and class both name are same)
    public Employees3(Long i, String n, String d, double s) {
        this.id = i;
        this.name = n;
        this.designation = d;
        this.salary = s;
    }

    // (instance method)
    public void displayInfo() {
        System.out.println("id: " + id + " Name: " + name + " Designation: " + designation + " salary: " + salary);
        System.out.println("-----------------------------------------");

    }

    // (Static method)
    public static void showCompany() {
        System.out.println("Conmany: " + Company);
        System.out.println("============================================");
    }

    public static void main(String[] args) {
        Employees3 emp1 = new Employees3(101L, "Rahim", "HR", 213372.32);
        Employees3 emp2 = new Employees3(102L, "Karim", "MO", 134434.32);
        Employees3 emp3 = new Employees3(103L, "Sohel", "MD", 213232.32);
        Employees3 emp4 = new Employees3(104L, "Sadik", "CEO", 343434.32);

        Employees3.showCompany();
        emp1.displayInfo();
        emp2.displayInfo();
        emp3.displayInfo();
        emp4.displayInfo();

    }

}
