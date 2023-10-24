/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Report.ReportList;

import People.Student;
import People.Lecturer;
import static Statistic.Statistic.count;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import static Statistic.Statistic.f;
import static Statistic.Statistic.sc;
import java.text.ParseException;

/**
 *
 * @author SON
 */
public abstract class Report {
    protected String reportCode;
    protected String reportName;
    protected String reportLink;
    protected Date reportDay;
    protected List<Student> studentList = new ArrayList<>();
    protected Lecturer instructorLecturer;
    protected double reportScore;
    
    {
        reportCode = "DH2" + count++;
    }

    public Report(String reportName, String reportLink, Date reportDay, Lecturer instructorLecturer, double reportScore) {
        this.reportName = reportName;
        this.reportLink = reportLink;
        this.reportDay = reportDay;
        this.instructorLecturer = instructorLecturer;
        this.reportScore = reportScore;
    }
    
    
     public void inputReport() throws ParseException {
        System.out.print("- Nhap ma bao cao: ");
        this.setReportCode(sc.nextLine());

        System.out.print("- Nhap ten bao cao: ");
        this.setReportName(sc.nextLine());
        
        System.out.print("- Nhap link bao cao: ");
        this.setReportLink(sc.nextLine());
        
        System.out.print("- Ngay bao cao (dd/MM/yyyy): ");
        this.setReportDay(f.parse(sc.nextLine()));
        
        System.out.print("- Nhap ten giang vien: ");
        Lecturer l = new Lecturer(reportName);
        l.input();
        this.setInstructorLecturer(l);
        
        do {
            System.out.print("- Nhap diem bao cao: ");
            this.setReportScore(Double.parseDouble(sc.nextLine()));
            if (this.getReportScore() < 0.0 || this.getReportScore() > 10.0) {
                System.out.println("Diem khong the < 0 va > 10");
            }
        } while (this.getReportScore() < 0.0 || this.getReportScore() > 10.0);
    }
     
    public void displayReport() {
        System.out.println("\n-------------------------------------------------------------");
        System.out.printf("- Ma bao cao: %s\n- Ten bao cao: %s\n- Link bao cao: %s\n- Ngay bao cao: %s\n- Giang vien huong dan: %s\n- Diem bao cao: %.1f\n",this.getReportCode(),this.getReportName(), this.getReportLink(), f.format(this.getReportDay()), this.getInstructorLecturer().getName(), this.getReportScore());
        System.out.println("=============== SINH VIEN THUC HIEN ===============");
        this.getStudentList().forEach(s -> System.out.println(s));
    }
    
    public void addStudent(Student student) {
        this.getStudentList().add(student);
    }
    
    @Override
    public String toString() {
        return  String.format("- Ma bao cao: %s\n- Ten bao cao: %s\n- Link bao cao: %s\n- Ngay bao cao: %s\n- Giang vien huong dan: %s\n- Diem bao cao: %.1f\n",this.getReportCode(),this.getReportName(), this.getReportLink(), f.format(this.getReportDay()), this.getInstructorLecturer().getName(), this.getReportScore());
    }

    /**
     * @return the reportCode
     */
    public String getReportCode() {
        return reportCode;
    }

    /**
     * @param reportCode the reportCode to set
     */
    public void setReportCode(String reportCode) {
        this.reportCode = reportCode;
    }

    /**
     * @return the reportName
     */
    public String getReportName() {
        return reportName;
    }

    /**
     * @param reportName the reportName to set
     */
    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    /**
     * @return the reportLink
     */
    public String getReportLink() {
        return reportLink;
    }

    /**
     * @param reportLink the reportLink to set
     */
    public void setReportLink(String reportLink) {
        this.reportLink = reportLink;
    }

    /**
     * @return the reportDay
     */
    public Date getReportDay() {
        return reportDay;
    }

    /**
     * @param reportDay the reportDay to set
     */
    public void setReportDay(Date reportDay) {
        this.reportDay = reportDay;
    }

    /**
     * @return the studentList
     */
    public List<Student> getStudentList() {
        return studentList;
    }

    /**
     * @param studentList the studentList to set
     */
    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    /**
     * @return the instructorLecturer
     */
    public Lecturer getInstructorLecturer() {
        return instructorLecturer;
    }

    /**
     * @param instructorLecturer the instructorLecturer to set
     */
    public void setInstructorLecturer(Lecturer instructorLecturer) {
        this.instructorLecturer = instructorLecturer;
    }

    /**
     * @return the reportScore
     */
    public double getReportScore() {
        return reportScore;
    }

    /**
     * @param reportScore the reportScore to set
     */
    public void setReportScore(double reportScore) {
        this.reportScore = reportScore;
    }

    
}
