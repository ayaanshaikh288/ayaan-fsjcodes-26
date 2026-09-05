/*
AIM : WAP to store and display student information of few students.
Information like name, uin, cgpa.
NAME : REHAN AKHTAR ALI SHAIKH 
CLASS : COMPUTER A
 */

public class StudentTest {
    public static void main(String[] args) {
        // DETAIL OF 1 STUDENT
         Student s1=new Student();
         s1.name="Rehan Akhtar Ali Shaikh ";
         s1.uin="251P038";
         s1.cgpa=8.54;
         s1.display();

         // DETAIL OF 2 STUDENT
    
     Student s2=new Student();
         s2.name="Ayaan Shaikh ";
         s2.uin="251P037";
         s2.cgpa=8.35;
         s2.display();

         // DETAIL OF 3 STUDENT

         Student s3=new Student();
         s3.name="Mujahid  Shaikh ";
         s3.uin="251P024";
         s3.cgpa=8.87;
         s3.display();
    }
}  

/**
 * InnerStudentTest
 */
 class Student {
    String name;
    String uin;
    Double cgpa;

      void display(){
        System.out.println("................................");

        System.out.println("NAME :"+ name);
        System.out.println("UIN :"+uin);
        System.out.println("CGPA :"+cgpa);
          System.out.println("................................");
    
      }

    
    
}
