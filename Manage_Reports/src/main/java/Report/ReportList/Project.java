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
public class Project extends Report{
    private double plagiarismRate;

    public Project(String reportName, String reportLink, Date reportDay, Lecturer instructorLecturer, double reportScore, double plagiarismRate) {
        super(reportName, reportLink, reportDay, instructorLecturer, reportScore);
        this.plagiarismRate = plagiarismRate;
    }

    @Override
    public void inputReport() throws ParseException {
        super.inputReport();
        System.out.print("- Nhap ty le dao van: ");
        this.plagiarismRate = Double.parseDouble(sc.nextLine());
    }
    
  @Override
    public void displayReport(){
        super.displayReport();
        System.out.println("- Ty le dao van: " + this.plagiarismRate);
        
    }

    @Override
    public String toString() {
        return super.toString() + "\n- Ty le dao van: " + this.plagiarismRate;
    }
    

    /**
     * @return the plagiarism
     */
    public double getPlagiarismRate() {
        return plagiarismRate;
    }

    /**
     * @param plagiarismRate
     */
    public void setPlagiarismRate(double plagiarismRate) {
        this.plagiarismRate = plagiarismRate;
    }
    

}
