public class Manager extends Employee {
    private String department;
    private int no_of_projects_completed;

    Manager(String name, int age, String gender, String mobile,
            double salary, String position, String emp_code,
            int experience, String department,
            int no_of_projects_completed) {

        super(name, age, gender, mobile, salary, position,
              emp_code, experience);

        this.department = department;
        this.no_of_projects_completed = no_of_projects_completed;
    }

    void display() {
        super.display();

        System.out.println("Department: " + this.department);
        System.out.println("Projects Completed: "
                           + this.no_of_projects_completed);
    }
}
