/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Report.ReportList;

import People.Lecturer;
import static Statistic.Statistic.sc;
import java.text.ParseException;
import java.util.Date;

/**
 *
 * @author SON
 */
public class Internship extends Report {
    private String businessFeedback;

    public Internship(String reportName, String reportLink, Date date, Lecturer instructorLecturer, double reportScore ,String businessFeedback) {
        super(reportName, reportLink, date, instructorLecturer, reportScore);
        this.businessFeedback = businessFeedback;
    }
    
    @Override
    public void inputReport() throws ParseException {
        super.inputReport();
        System.out.print("- Nhap ty le dao van: ");
        this.businessFeedback = sc.nextLine();
    }
    
    @Override
    public void displayReport() {
        super.displayReport();
        System.out.println("- Danh gia doanh nghiep: " + this.businessFeedback);
        System.out.println("-------------------------------------------------------------");
    }
    
    @Override
    public String toString() {
        return super.toString();
        
    }
    
    /**
     * @return the businessFeedback
     */
    public String getBusinessFeedback() {
        return businessFeedback;
    }

    /**
     * @param businessFeedback the businessFeedback to set
     */
    public void setBusinessFeedback(String businessFeedback) {
        this.businessFeedback = businessFeedback;
    }
}
