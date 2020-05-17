package Logics;

import Logics.NewStudentClass;
import Models.StudentDetails;

import javax.swing.*;
import java.util.*;

public class Finance extends NewStudentClass {
    DefaultListModel<StudentDetails> listModelNew;

    public void feepaid(){
        NewStudentClass feeclass = new NewStudentClass();
        List<StudentDetails> feeDetails = new ArrayList<>(feeclass.list);
        listModelNew = new DefaultListModel<>();

        for (int i = 0; i < feeclass.list.size(); i++){
            listModelNew.add(i, feeDetails.get(i));

        }
        
    }
}
