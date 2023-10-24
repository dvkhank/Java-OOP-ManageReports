/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package People;

import static Statistic.Statistic.sc;

/**
 *
 * @author SON
 */
public class Lecturer extends Person {
    private String academicRank;
    private String degree;

    public Lecturer(String name) {
        super(name);
    }
    
    public Lecturer(String name,String academicRank, String degree) {
        super(name);
        this.academicRank = academicRank;
        this.degree = degree;
    }
    
    public void input() {
        this.name = sc.nextLine();
    }

    @Override
    public void display() {
        super.display(); 
        System.out.printf("\nHoc ham: %s\nHoc vi: %s\n", this.academicRank,this.degree);
    }

    @Override
    public String toString() {
        return String.format("Ten giang vien: %s\nHoc ham: %s\nHoc vi: %s\n", this.name,this.academicRank,this.degree);
    }
    
    /**
     * @return the academicRank
     */
    public String getAcademicRank() {
        return academicRank;
    }

    /**
     * @param academicRank the academicRank to set
     */
    public void setAcademicRank(String academicRank) {
        this.academicRank = academicRank;
    }

    /**
     * @return the degree
     */
    public String getDegree() {
        return degree;
    }

    /**
     * @param degree the degree to set
     */
    public void setDegree(String degree) {
        this.degree = degree;
    }
    
   
}
