// CSC-151-O1
// Sterling Clark 
// 10/8/20
package abtechapp;


public class Student {
    private String firstName;
    private String lastName;
    private int graduationYear; 
    
    // default constructor, no args, sets null values
    public Student() {
        firstName = "";
        lastName = "";
        graduationYear = 0;
    }
    
    // constructor 3 args
    public Student(String fname, String lname, int graduation_year) {
        this.firstName = fname;
        this.lastName = lname;
        this.graduationYear = graduation_year;
    }
    
    public String getStudent() {
        return firstName + " " + lastName + " " + graduationYear;
    }
}
