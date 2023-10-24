/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package People;


/**
 *
 * @author SON
 */
public class Student extends Person {
    private String studentID;
    private String academicYear;
    private String sex;
    private int yearOfBirth;
    private String major;

    public Student(String name,String studentID, String academicYear, String sex, int yearOfBirth, String major) {
        super(name);
        this.studentID = studentID;
        this.academicYear = academicYear;
        this.sex = sex;
        this.yearOfBirth = yearOfBirth;
        this.major = major;
    }

    @Override
    public void display() {
        super.display(); 
        System.out.printf("ID: %s\nNam hoc: %s\nGioi tinh: %s\nNam sinh :%d\nChuyen nganh: %s\n", 
               this.getStudentID(), this.getAcademicYear(), this.getSex(), this.getYearOfBirth(), this.getMajor());
    }
    
    @Override
    public String toString() {
        return String.format("Ho ten: %s\nID: %s\nNam hoc: %s\nGioi tinh: %s\nNam sinh :%d\nChuyen nganh: %s\n", 
                this.name, this.getStudentID(), this.getAcademicYear(), this.getSex(), this.getYearOfBirth(), this.getMajor());
    }

    /**
     * @return the studentID
     */
    public String getStudentID() {
        return studentID;
    }

    /**
     * @param studentID the studentID to set
     */
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    /**
     * @return the academicYear
     */
    public String getAcademicYear() {
        return academicYear;
    }

    /**
     * @param academicYear the academicYear to set
     */
    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }

    /**
     * @return the sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return the yearOfBirth
     */
    public int getYearOfBirth() {
        return yearOfBirth;
    }

    /**
     * @param yearOfBirth the yearOfBirth to set
     */
    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    /**
     * @return the major
     */
    public String getMajor() {
        return major;
    }

    /**
     * @param major the major to set
     */
    public void setMajor(String major) {
        this.major = major;
    }
    
}
