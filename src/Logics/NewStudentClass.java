package Logics;

import Models.StudentDetails;

import java.util.*;

public class NewStudentClass extends StudentDetails {
    StudentDetails student = new StudentDetails();
    int number;
    Scanner scan = new Scanner(System.in);
    public ArrayList<StudentDetails> list;
    TreeSet<StudentDetails> list2;

    public void addStudent(){
        list = new ArrayList<>();
        list2 = new TreeSet<>(new StudentComparator());

        System.out.println("How Many Students Do You Wish To Add?");
        number = scan.nextInt();

        for (int s = 0; s < number; s++) {

        System.out.println("Enter Admission Number: ");
        int adm = (scan.nextInt());

        System.out.println("Enter Student's Surname: ");
        String surname = (scan.next());

        System.out.println("Enter Student's First Name: ");
        String fname = (scan.next());

        System.out.println("Enter Student's Last Name: ");
        String lname = (scan.next());

        System.out.println("Enter Student's Address: ");
        String address = (scan.next());

        System.out.println("Enter Student's Parent Name: ");
        String pname = scan.next();

        System.out.println("Enter Student's Parent Number: ");
        long pnum = (scan.nextLong());


            addStudentToArray(adm, surname, fname, lname, address, pname, pnum);
            student.printStudentDetails();

            addStudentToTreeSet(adm, surname, fname, lname, address, pname, pnum);
            student.printStudentDetails();

            System.out.println("\nThis is an ArrayList Record Of Students");
            viewStudent(list);

            System.out.println("\nThis is a Sorted TreeSet Record of Students");
            viewStudent2(list2);
        }
        System.out.println("1. Check Student Fee Statement?" );
        System.out.println("2. Enter Student Exam Details?");

        if (scan.nextInt() == 1){
            System.out.println("Enter Student Admission...");
            searchAdm(list);
//            Logics.Finance finance = new Logics.Finance();
//            finance.feePaid((Logics.NewStudentClass) list);
        }
    }


    public void addStudentToArray(int adm, String snme, String fnme, String lnme, String
            ads, String pnme, long pnmbr){
        list.add(new StudentDetails(adm, snme, fnme, lnme, ads, pnme, pnmbr));
    }

    public void addStudentToTreeSet(int adm, String snme, String fnme, String lnme, String
            ads, String pnme, long pnmbr){
        list2.add(new StudentDetails(adm, snme, fnme, lnme, ads, pnme, pnmbr));
    }

    public void viewStudent(List<StudentDetails> display) {
        for (int i = 0; i < display.size(); i++) {
            System.out.println(display.get(i));
        }
        System.out.println("Number of Student is: " + list.size());
    }

    public void viewStudent2(TreeSet<StudentDetails> displ) {
        for (StudentDetails disp: displ) {
            System.out.println(disp);
        }
        System.out.println("Number of Student is: " + displ.size());
    }

    public void searchAdm(List<StudentDetails> dis){
        for (int i = 0; i < dis.size(); i++){
            int searchStudent = scan.nextInt();
            if (student.getAdm() == searchStudent) {
                System.out.println(list.lastIndexOf(searchStudent));
            }
            else{
                System.out.println("No such Record");
            }
        }
    }
}
