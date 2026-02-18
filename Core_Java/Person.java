package Method8;

public class Person {
    private String name;
    private int age;

    public Person(String n, int a){  //public called "Access modifier"
        this.name = n;
        this.age = a;
    }

    public void display(){
        System.out.println("Age: " + age+ " Name: " + name);
    }

   //Getter and setter;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 20){
        this.age = age;
        }
    }
}
