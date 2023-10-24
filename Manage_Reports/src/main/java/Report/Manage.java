/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Report;

import People.Student;
import People.Lecturer;
import People.Council;
import People.Role;
import Report.ReportList.Project;
import Report.ReportList.Internship;
import Report.ReportList.Thesis;
import People.Mark;
import Report.ReportList.Report;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import static Statistic.Statistic.f;
import static Statistic.Statistic.sc;
import java.util.stream.Collectors;

/**
 *
 * @author SON
 */
public class Manage {

    List<Report> reportList = new ArrayList<>();
    Council c1 = new Council();
    List<Mark> markList = new ArrayList<>();
    List<Council> listCouncil = new ArrayList<>();


    public void addInternship() throws FileNotFoundException, ParseException {
        File f1 = new File("src/main/resources/internship.txt");
        int i = 0;
        try ( Scanner scanner = new Scanner(f1)) {
            while (scanner.hasNext()) {
                String reportName = scanner.nextLine();
                String link = scanner.nextLine();
                Date date = f.parse(scanner.nextLine());
                String instructorName = scanner.nextLine();
                String academicRank = scanner.nextLine();
                String degree = scanner.nextLine();
                Lecturer r = new Lecturer(instructorName, academicRank, degree);
                double score = Double.parseDouble(scanner.nextLine());
                String feedback = scanner.nextLine();
                Internship I = new Internship(reportName, link, date, r, score, feedback);
                this.reportList.add(I);
                File f2 = new File("src/main/resources/student1.txt");
                Scanner sc = new Scanner(f2);
                Scanner scan = new Scanner(System.in);
                int n, check = 1;
                do {
                    System.out.printf("- Nhap so luong sinh vien thuc hien cho bao cao %d: ", i + 1);
                    n = Integer.parseInt(scan.nextLine());
                    if (n < 0 || n > 2) {
                        System.out.println("<!> Toi da 2 sinh vien 1 nhom");
                    }
                } while (n < 0 || n > 2);
                while (sc.hasNext() && check <= n) {
                    String studentName = sc.nextLine();
                    String studentID = sc.nextLine();
                    String academicYear = sc.nextLine();
                    String sex = sc.nextLine();
                    int yearOfBirth = Integer.parseInt(sc.nextLine());
                    String major = sc.nextLine();
                    Student st = new Student(studentName, studentID, academicYear, sex, yearOfBirth, major);
                    I.addStudent(st);
                    check++;
                }
                if (scanner.hasNext()) {
                    scanner.nextLine();
                }
                i++;
            }
        }
    }

    public void addProject() throws FileNotFoundException, ParseException {
        File f1 = new File("src/main/resources/project.txt");
        int i = 0;
        try ( Scanner scanner = new Scanner(f1)) {
            while (scanner.hasNext()) {
                String reportName = scanner.nextLine();
                String link = scanner.nextLine();
                Date date = f.parse(scanner.nextLine());
                String instructorName = scanner.nextLine();
                String academicRank = scanner.nextLine();
                String degree = scanner.nextLine();
                Lecturer r = new Lecturer(instructorName, academicRank, degree);
                double score = Double.parseDouble(scanner.nextLine());
                double plagiarism = Double.parseDouble(scanner.nextLine());
                Project p = new Project(reportName, link, date, r, score, plagiarism);
                this.reportList.add(p);
                File f2 = new File("src/main/resources/student1.txt");
                Scanner sc = new Scanner(f2);
                Scanner scan = new Scanner(System.in);
                int n, check = 1;
                do {
                    System.out.printf("- Nhap so luong sinh vien thuc hien cho bao cao %d: ", i + 1);
                    n = Integer.parseInt(scan.nextLine());
                    if (n < 0 || n > 2) {
                        System.out.println("<!> Toi da 2 sinh vien 1 nhom");
                    }
                } while (n < 0 || n > 2);
                while (sc.hasNext() && check <= n) {
                    String studentName = sc.nextLine();
                    String studentID = sc.nextLine();
                    String academicYear = sc.nextLine();
                    String sex = sc.nextLine();
                    int yearOfBirth = Integer.parseInt(sc.nextLine());
                    String major = sc.nextLine();
                    Student st = new Student(studentName, studentID, academicYear, sex, yearOfBirth, major);
                    p.addStudent(st);
                    check++;
                }
                if (scanner.hasNext()) {
                    scanner.nextLine();
                }
                i++;
            }
        }
    }

    public void addThesis() throws FileNotFoundException, ParseException {
        File f1 = new File("src/main/resources/thesis.txt");
        int i = 0;
        try ( Scanner scanner = new Scanner(f1)) {
            while (scanner.hasNext()) {
                String reportName = scanner.nextLine();
                String link = scanner.nextLine();
                Date date = f.parse(scanner.nextLine());
                String instructorName = scanner.nextLine();
                String academicRank = scanner.nextLine();
                String degree = scanner.nextLine();
                Lecturer r = new Lecturer(instructorName, academicRank, degree);
                double score = scanner.nextDouble();
                scanner.nextLine();
                double plagiarism = scanner.nextDouble();
                scanner.nextLine();
                String criticalName = scanner.nextLine();
                String criticalRank = scanner.nextLine();
                String criticalDegree  = scanner.nextLine();
                Lecturer critical = new Lecturer(criticalName,criticalRank,criticalDegree);
                String feedback = scanner.nextLine();
                Thesis t = new Thesis(reportName, link, date, r, score, plagiarism,critical, feedback, c1);
                this.reportList.add(t);
                File f2 = new File("src/main/resources/student1.txt");
                try ( Scanner sc = new Scanner(f2)) {
                    Scanner scan = new Scanner(System.in);
                    int n, check = 1;
                    do {
                        System.out.printf("- Nhap so luong sinh vien thuc hien cho bao cao %d: ", i + 1);
                        n = Integer.parseInt(scan.nextLine());
                        if (n < 0 || n > 2) {
                            System.out.println("<!> Toi da 2 sinh vien 1 nhom");
                        }
                    } while (n < 0 || n > 2);
                    while (sc.hasNext() && check <= n) {
                        String studentName = sc.nextLine();
                        String studentID = sc.nextLine();
                        String academicYear = sc.nextLine();
                        String sex = sc.nextLine();
                        int yearOfBirth = Integer.parseInt(sc.nextLine());
                        String major = sc.nextLine();
                        Student a = new Student(studentName, studentID, academicYear, sex, yearOfBirth, major);
                        t.addStudent(a);
                        check++;
                    }
                }
                if (scanner.hasNext()) {
                    scanner.nextLine();
                }
                i++;
            }
        }

    }

    public void removeReport() {
        System.out.print("- Nhap ma bao cao can xoa: ");
        String keyWordsRemove = sc.nextLine();
        Report reportFound = null;
        for (Report r : reportList) {
            if (r.getReportCode().equalsIgnoreCase(keyWordsRemove)) {
                reportFound = r;
                break;
            }
        }
        if (reportFound != null) {
            reportList.remove(reportFound);
            System.out.println("-- Xoa thanh cong --");
        } else {
            System.out.println("<!>Khong tim thay ma bao bao!! " + keyWordsRemove);
        }
    }

    public void editReport() throws ParseException {
        System.out.print("- Nhap ma bao cao can sua: ");
        String keyWordsEdit = sc.nextLine();
        Report reportFound = null;
        for (Report r : reportList) {
            if (r.getReportCode().equalsIgnoreCase(keyWordsEdit)) {
                reportFound = r;
                break;
            }
        }
        if (reportFound != null) {
            if (reportFound instanceof Internship internship) {
                internship.inputReport();
            } else if (reportFound instanceof Project project) {
                project.inputReport();
            } else if (reportFound instanceof Thesis thesis) {
                thesis.inputReport();
            }
            System.out.println("-- Sua thanh cong --");
        } else {
            System.out.println("<!>Khong tim thay ma bao bao!!! " + keyWordsEdit);
        }
    }

    public void establishCouncil() throws FileNotFoundException, ParseException {
        int n, i = 1, count = 0;
        File f1 = new File("src/main/resources/council.txt");
        try ( Scanner scanner = new Scanner(f1)) {
            Scanner sc = new Scanner(System.in);
            System.out.print("- Nhap ten hoi dong: ");
            String nameCouncil = sc.nextLine();
            System.out.print("- Nhap ngay lam viec: ");
            Date workingDate = f.parse(sc.nextLine());
            c1.setWorkingDate(workingDate);
            c1.setCouncilName(nameCouncil);
            do {
                System.out.print("- Nhap so luong giang vien: ");
                n = Integer.parseInt(sc.nextLine());
                if (n < 3 || n > 5) {
                    System.out.println("<!> Vui long nhap lai");
                }
            } while (n < 3 || n > 5);
            while (scanner.hasNext() && i <= n) {
                String name = scanner.nextLine();
                String academicRank = scanner.nextLine();
                String degree = scanner.nextLine();
                Lecturer l = new Lecturer(name, academicRank, degree);
                String vaiTro = scanner.nextLine();
                Role r = new Role(vaiTro, l, c1);
                  c1.addRole(r);

                i++;
                count += r.check();
                if ((count == 2 || count == 6 || count == 18 || count == 11 || count == 5 || count == 7) || count > 14) {
                    c1.getRoleList().clear();
                    System.out.println("<!> Khong the thanh lap hoi dong");
                    break;
                }
            }
            
        }
        System.out.println("-- Thanh lap hoi dong thanh cong --");
        listCouncil.add(c1);

    }

    public void displayReport() {
        this.reportList.forEach(r -> r.displayReport());
    }

    public void markScore() {
        for (Report x : reportList) {
            double tb = 0;
            System.out.println("\n=== CHAM DIEM KHOA LUAN: " + x.getReportName() + " === ");
            if (x instanceof Thesis) {
                for (Role y : c1.getRoleList()) {
                    System.out.println("\n Giang vien: " + y.getLecturer().getName());
                    System.out.print("- Nhap diem cho khoa luan: ");
                    double score = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("- Nhap nhan xet: ");
                    String feedback = sc.nextLine();
                    Mark a = new Mark(score, feedback, y, x);
                    markList.add(a);
                    tb += score;
                }
                System.out.println("---------------------------------------");
                tb = tb / c1.getRoleList().size();
                markList.forEach(h -> System.out.println(h));
                System.out.printf("=> Diem cua hoi dong: %.1f", tb);
                System.out.println("\n---------------------------------------");
                markList.clear();
            }

        }

    }

    public List<Report> listByInternship() {
        List<Report> result = new ArrayList<>();
        for (Report r : this.reportList) {
            if (r instanceof Internship) {
                result.add(r);
            }
        }
        return result;
    }

    public List<Report> listByProject() {
        List<Report> result = new ArrayList<>();
        for (Report r : this.reportList) {
            if (r instanceof Project) {
                result.add(r);
            }
        }
        return result;
    }

    public List<Report> listByThesis() {
        List<Report> result = new ArrayList<>();
        for (Report r : this.reportList) {
            if (r instanceof Thesis) {
                result.add(r);
            }
        }
        return result;
    }

    public void listByDate() {
        this.reportList.sort((r1, r2) -> {
            if (r1 instanceof Internship && r2 instanceof Internship
                    || r1 instanceof Project && r2 instanceof Project
                    || r1 instanceof Thesis && r2 instanceof Thesis) {
                Date d1 = r1.getReportDay();
                Date d2 = r2.getReportDay();
                return d1.compareTo(d2) == 1 ? 1 : (d1.compareTo(d2) == 0 ? 0 : -1);
            }
            return 0;
        });
    }

    public void searchReportByName(String kw) {
        this.reportList.stream().filter(s -> s.getReportCode().contains(kw)).forEach(r -> r.displayReport());
    }

    public void searchReportByDate(Date kw) {
        this.reportList.stream().filter(s -> s.getReportDay().equals(kw)).forEach(r -> r.displayReport());
    }

   
    public List<Council> searchCouncilByDate(Date from, Date to) {
          return this.listCouncil.stream().filter(s -> s.getWorkingDate().getTime() >= 
                  from.getTime() && s.getWorkingDate().getTime() <= to.getTime()).collect(Collectors.toList());
    }

}
