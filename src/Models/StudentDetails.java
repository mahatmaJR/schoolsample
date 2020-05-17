package Models;

public class StudentDetails implements Comparable<StudentDetails>{

    int Adm;
    String Surname;
    String FName;
    String LName;
    String Address;
    String PName;
    long PNumber;

   public StudentDetails(int Adm, String Surname, String FName, String LName,
                         String Address, String PName, long PNumber){
       this.Adm = Adm;
       this.Surname = Surname;
       this.FName = FName;
       this.LName = LName;
       this.Address = Address;
       this.PName = PName;
       this.PNumber = PNumber;
   }

   public StudentDetails(){}

   public void printStudentDetails(){
       System.out.println("["+ Adm +"; "+ Surname +"; "+ FName +"; "+ LName +";  "+ Address +"; "+ PName +"; "+ PNumber +"]");
   }

   public int getAdm() {
        return Adm;
    }

   public int setAdm(int adm) {
        Adm = adm;
        return adm;
    }

    public String getSurname() {
        return Surname;
    }

    public String setSurname(String surname) {
        Surname = surname;
        return surname;
    }

    public String getFName() {
        return FName;
    }

    public String setFName(String FName) {
        this.FName = FName;
        return FName;
    }

    public String getLName() {
        return LName;
    }

    public String setLName(String LName) {
        this.LName = LName;
        return LName;
    }

    public String getAddress() {
        return Address;
    }

    public String setAddress(String address) {
        Address = address;
        return address;
    }

    public String getPName() {
        return PName;
    }

    public String setPName(String PName) {
        this.PName = PName;
        return PName;
    }

    public long getPNumber() {
        return PNumber;
    }

    public int setPNumber(int PNumber) {
        this.PNumber = PNumber;
        return PNumber;
    }

    public int compareTo(StudentDetails details){

       if(this.Adm == details.getAdm()){
           return 0;
       }
       else if(this.Adm > details.getAdm()){
           return 1;
       }else {
           return -1;
       }
    }


    @Override
    public String toString(){
       return "["+ Adm +"; "+ Surname +"; "+ FName +"; "+ LName +";  "+ Address +"; "+ PName +"; "+ PNumber +"]";
    }
}
