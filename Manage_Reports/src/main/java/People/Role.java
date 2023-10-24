/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package People;

/**
 *
 * @author SON
 */
public class Role {

    private String role;
    private Lecturer lecturer;
    private Council council;

    public Role() {
    }

    public Role(String role, Lecturer lecturer, Council council) {
        this.role = role;
        this.lecturer = lecturer;
        this.council = council;
    }

    public int check() {
        String sample1 = "THU KY";
        String sample2 = "CHU TICH";
        String sample3 = "PHAN BIEN";

        if (this.role.toUpperCase().equals(sample1)) {
            return 1;
        } else if (this.role.toUpperCase().equals(sample2)) {
            return 3;
        } else if (this.role.toUpperCase().equals(sample3)) {
            return 9;
        }

        return 0;

    }

    @Override
    public String toString() {
        return String.format("Ten giang vien: %s\nHoc ham: %s\nHoc ham: %s\nHoi dong: %s\nVai tro: %s\n",
                this.lecturer.getName(), this.lecturer.getAcademicRank(), this.lecturer.getDegree(), this.council.getCouncilName(), this.role);
    }

    /**
     * @return the role
     */
    public String getRole() {
        return role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * @return the lecturer
     */
    public Lecturer getLecturer() {
        return lecturer;
    }

    /**
     * @param lecturer the lecturer to set
     */
    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
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

}
