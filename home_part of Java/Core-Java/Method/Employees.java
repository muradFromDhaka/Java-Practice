package Method;

public class Employees {
    public Long id;
    public String name;
    public String designation;
    public double salary;

    public Employees(){   // (Default constructor , ati Java nije theke create kore rake,jokon user 'constructor'create kore na, but ami diye raklam)

    }

    public Employees(Long id, String name, String designation, double salary) { // constructor
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public double getSalary() {    // instance method;         
        if (designation == "MD") {
            return salary * 1.5;

        } else if (designation == "DEV") {
            return salary * 1.2;

        } else if (designation == "MAN") {
            return salary * 1.1;

        } else if (designation == "DES") {
            return salary * 1.3;

        } else if (designation == "HR") {
            return salary * 1.4;

        }else {
            return salary;
        }
    }

    public static double calculateTax(double salary, double parcentage){  //static method
        return salary * parcentage / 100;
    }

}
