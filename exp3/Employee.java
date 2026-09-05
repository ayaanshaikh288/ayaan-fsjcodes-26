public class Employee extends Person {
    private String position;
    private String emp_code;
    private int experience;
    private double salary;

    Employee(String name, int age, String gender, String mobile,
             double salary, String position, String emp_code,
             int experience) {

        super(name, age, gender, mobile);

        this.salary = salary;
        this.position = position;
        this.emp_code = emp_code;
        this.experience = experience;
    }

    void display() {
        super.display();

        System.out.println("Salary: " + this.salary);
        System.out.println("Position: " + this.position);
        System.out.println("Employee Code: " + this.emp_code);
        System.out.println("Experience: " + this.experience);
    }
}
