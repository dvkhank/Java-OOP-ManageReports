/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Report.ReportList;

import People.Council;
import People.Lecturer;
import static Statistic.Statistic.sc;
import java.text.ParseException;
import java.util.Date;

/**
 *
 * @author SON
 */
public class Thesis extends Project{
    private String criticalLecturerFeedback;
    private Council council;
    private Lecturer critical;

    public Thesis(String reportName, String reportLink, Date reportDay, Lecturer instructor, double reportScore, double plagiarism,Lecturer critical, String criticalLecturerFeedback, Council council) {
        super(reportName, reportLink, reportDay, instructor, reportScore, plagiarism);
        this.criticalLecturerFeedback = criticalLecturerFeedback;
        this.council = council;
        this.critical=critical;
    }

    @Override
    public void inputReport() throws ParseException {
        super.inputReport(); 
        System.out.println("Giang vien phan bien: " + this.getCritical().getName());
        System.out.print("- Nhap danh giang vien phan bien: ");
        this.setCriticalLecturerFeedback(sc.nextLine());
    }
    
    
    @Override
    public void displayReport() {
        super.displayReport();
        System.out.println("- Giang vien phan bien: " + this.getCritical().getName());
        System.out.println("- Danh gia cua giang vien phan bien: " + this.getCriticalLecturerFeedback());
        this.getCouncil().displayCouncil();
        System.out.println("\n-------------------------------------------------------------");
    }

    /**
     * @return the criticalLecturerFeedback
     */
    public String getCriticalLecturerFeedback() {
        return criticalLecturerFeedback;
    }

    /**
     * @param criticalLecturerFeedback the criticalLecturerFeedback to set
     */
    public void setCriticalLecturerFeedback(String criticalLecturerFeedback) {
        this.criticalLecturerFeedback = criticalLecturerFeedback;
    }

    /**
     * @return the council
     */
    public Council getCouncil() {
        return council;
    }

    /**
     * @param council the council to set
     */
    public void setCouncil(Council council) {
        this.council = council;
    }

    /**
     * @return the critical
     */
    public Lecturer getCritical() {
        return critical;
    }

    /**
     * @param critical the critical to set
     */
    public void setCritical(Lecturer critical) {
        this.critical = critical;
    }
 
    
}
