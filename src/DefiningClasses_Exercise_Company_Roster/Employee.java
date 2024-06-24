package DefiningClasses_Exercise_Company_Roster;

public class Employee {
    //Fields
    private String name;
    private Double salary;
    private String position;
    private String email;
    private int age;

    //Constructor:
    public Employee(String name, Double salary, String position, String email, int age){
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.email = email;
        this.age = age;

    }



    public double getSalary() {
        return this.salary;
    }

    public String toString() {
        return String.format("%s %.2f %s %d", this.name, this.salary, this.email, this.age);
    }
}
