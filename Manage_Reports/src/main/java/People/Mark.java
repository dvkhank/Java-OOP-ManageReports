/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package People;

import Report.ReportList.Report;

/**
 *
 * @author SON
 */
public class Mark {
    private double score;
    private String feedback;
    private Role role;
    private Report thesis ;

    public Mark(double score, String feedback, Role role, Report thesis) {
        this.score = score;
        this.feedback = feedback;
        this.role = role;
        this.thesis = thesis;
    }

    @Override
    public String toString() {
        return String.format("Bao cao: %s\nGiang vien: %s\nVai tro: %s\nDiem: %.1f\nNhan xet: %s\n", this.getThesis().getReportName(),this.getRole().getLecturer().name,this.role.getRole(), this.getScore(), this.getFeedback());
    }
    
    /**
     * @return the score
     */
    public double getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(double score) {
        this.score = score;
    }

    /**
     * @return the feedback
     */
    public String getFeedback() {
        return feedback;
    }

    /**
     * @param feedback the feedback to set
     */
    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    /**
     * @return the role
     */
    public Role getRole() {
        return role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(Role role) {
        this.role = role;
    }

    /**
     * @return the thesis
     */
    public Report getThesis() {
        return thesis;
    }

    /**
     * @param thesis the thesis to set
     */
    public void setThesis(Report thesis) {
        this.thesis = thesis;
    }
}
