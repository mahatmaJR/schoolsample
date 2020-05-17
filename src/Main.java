import Logics.NewStudent;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
       NewStudent newstud = new NewStudent();
//        Logics.NewStudentClass student = new Logics.NewStudentClass();
        Scanner sc = new Scanner(System.in);

        System.out.println("WELCOME TO THE SCHOOL MANAGEMENT SYSTEM.");
        System.out.println("What Do You Wish To Do:");
        System.out.println("1. Add a New Student");
        System.out.println("2. Edit a Student's Record");

        if (sc.nextInt() == 1) {
//            student.addStudent();
            newstud.addStudent();

//            System.out.println("\nThis is the Fee Statements Records");
//            Logics.Finance fff = new Logics.Finance();
//            fff.feepaid();
        }
//      newstud.viewStudent();
//        student.viewStudent();
    }
}