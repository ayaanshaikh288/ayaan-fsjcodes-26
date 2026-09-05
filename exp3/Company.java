import java.util.Scanner;
import java.util.InputMismatchException;

public class Company {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Gender: ");
            String gender = sc.nextLine();

            System.out.print("Enter Mobile Number: ");
            String mobile = sc.nextLine();

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter Position: ");
            String position = sc.nextLine();

            System.out.print("Enter Employee Code: ");
            String emp_code = sc.nextLine();

            System.out.print("Enter Experience: ");
            int experience = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Department: ");
            String department = sc.nextLine();

            System.out.print("Enter Projects Completed: ");
            int prj_comp = sc.nextInt();

            Manager m1 = new Manager(
                name,
                age,
                gender,
                mobile,
                salary,
                position,
                emp_code,
                experience,
                department,
                prj_comp
            );

            System.out.println("\n----- Manager Details -----");
            m1.display();

        } catch (InputMismatchException e) {
            System.out.println("Enter integer or double only.");
        } catch (Exception e) {
            System.out.println("There was an error in your input.");
        }

        sc.close();
    }
}
