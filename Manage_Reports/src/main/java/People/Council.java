/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package People;

import Report.ReportList.Thesis;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 *
 * @author SON
 */
public class Council {

    private String councilName;
    private Date workingDate;
    private List<Thesis> listThesis = new ArrayList<>();
    private List<Role> roleList = new ArrayList<>();

    public Council() {
    }

    public Council(String councilName, Date workingDate) {
        this.councilName = councilName;
        this.workingDate = workingDate;
    }

   

    public void displayCouncil() {
//        System.out.println(getCouncilCode());
        System.out.println("\n========== DANH SACH HOI DONG ==========");
        this.getRoleList().forEach(h -> System.out.println(h));
    }

    public void addRole(Role... a) {
        this.getRoleList().addAll(Arrays.asList(a));

    }

    /**
     * @return the councilName
     */
    public String getCouncilName() {
        return councilName;
    }

    /**
     * @param councilName the councilName to set
     */
    public void setCouncilName(String councilName) {
        this.councilName = councilName;
    }

    /**
     * @return the lecturerList
     */
 
    /**
     * @return the workingDate
     */
    public Date getWorkingDate() {
        return workingDate;
    }

    /**
     * @param workingDate the workingDate to set
     */
    public void setWorkingDate(Date workingDate) {
        this.workingDate = workingDate;
    }

    /**
     * @return the listThesis
     */
    public List<Thesis> getListThesis() {
        return listThesis;
    }

    /**
     * @param listThesis the listThesis to set
     */
    public void setListThesis(List<Thesis> listThesis) {
        this.listThesis = listThesis;
    }

    /**
     * @return the roleList
     */
    public List<Role> getRoleList() {
        return roleList;
    }

    /**
     * @param roleList the roleList to set
     */
    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }
    
    
}
