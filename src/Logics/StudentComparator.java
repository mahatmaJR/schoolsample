package Logics;

import Models.StudentDetails;

import java.util.Comparator;

public  class StudentComparator implements Comparator<StudentDetails> {

    public static Comparator<StudentDetails> surnameComp = new Comparator<StudentDetails>() {
        @Override
        public int compare(StudentDetails o1, StudentDetails o2) {
            return o1.getSurname().compareTo(o2.getSurname());
        }
    };

    public static Comparator<StudentDetails> admComp = new Comparator<StudentDetails>() {
        @Override
        public int compare(StudentDetails sd1, StudentDetails sd2) {
            if (sd1.getAdm() > sd2.getAdm()) {
                return 1;
            } else if (sd1.getAdm() < sd2.getAdm()) {
                return -1;
            }
            return 0;
        }
    };

    @Override
    public int compare(StudentDetails o1, StudentDetails o2) {
        return 0;
    }
}










//        implements Comparable<Models.StudentDetails>{
//

//    public void compare(){
//        String s1 = "s13/100/08";
//        String s2 = null;
//
//        if (s2.equals(s1)){
//            System.out.println("they are the same");
//        }
//        else{
//            System.out.println("They are different");
//        }
//    }
//
//    public static void main(String[] args){
//        Logics.StudentComparator com = new Logics.StudentComparator();
//        com.compare();