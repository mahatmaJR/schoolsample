package Logics;

import Models.StudentDetails;
import Utility.DBConnection;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class NewStudent extends StudentDetails {

    int count = 0;
    StudentDetails[] studentDetails;
    Scanner scan = new Scanner(System.in);
    DBConnection dbc;

    public boolean addStudent() throws SQLException, IOException, ClassNotFoundException {

        try{
            dbc = new DBConnection();
        }catch (SQLException se){
            System.out.println("NO CONNECTION " + se);
        }


        System.out.println("How Many Students Do You Wish Do Add? ");
        int number = scan.nextInt();
        studentDetails = new StudentDetails[number];

        for (int i = 0; i <= number - 1; i++){
           Scanner scan = new Scanner(System.in);
           studentDetails[i] = new StudentDetails();

           System.out.println("Enter Admission Number: ");
           int id =  studentDetails[i].setAdm(scan.nextInt());

           System.out.println("Enter Student's Surname: ");
           String surname = studentDetails[i].setSurname(scan.next());

           System.out.println("Enter Student's First Name: ");
           String fname = studentDetails[i].setFName(scan.next());

           System.out.println("Enter Student's Last Name: ");
           String lname = studentDetails[i].setLName(scan.next());

           System.out.println("Enter Student's Address: ");
           String address =  studentDetails[i].setAddress(scan.next());

           System.out.println("Enter Student's Parent Name: ");
           String pname = studentDetails[i].setPName(scan.next());

           System.out.println("Enter Student's Parent Number: ");
           int pnumber = studentDetails[i].setPNumber(scan.nextInt());

            count++;

            String stSql = "INSERT INTO students (id, surname, fname, lname, address, pname, " +
                    "pnumber) values ('"+id+"', '"+surname+"', '"+fname+"', '"+lname+"', " +
                    "'"+address+"', '"+pname+"', '"+pnumber+"')";
            dbc.write(stSql);


            }
            return true;
    }


    public boolean viewStudent(){
        for (int j = count - 1; j > -1; j--){
            System.out.println(" Adm: " + studentDetails[j].getAdm() + " Surname: " + studentDetails[j].getSurname() +
                    " First Name: " + studentDetails[j].getFName() + " Last Name: " + studentDetails[j].getLName() +
                    " Address:" + studentDetails[j].getAddress() + " Parent's Name: "  + studentDetails[j].getPName() +
                    " Parent's Number: " + studentDetails[j].getPNumber());


        }

        System.out.println("There are " + studentDetails.length + " Student(s)");
            return true;
    }
}
