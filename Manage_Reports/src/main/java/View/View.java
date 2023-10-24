/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package View;

import Report.Manage;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Date;
import static Statistic.Statistic.f;
import static Statistic.Statistic.sc;

/**
 *
 * @author SON
 */
public class View {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Manage ql = new Manage();
        int choice ;
        do {
            System.out.println("\n================== MENU ==================");
            System.out.println("1. Them bao cao thuc tap doanh nghiep");
            System.out.println("2. Them do an nganh");
            System.out.println("3. Them khoa luan");
            System.out.println("4. Xoa bao cao");
            System.out.println("5. Sua thong tin bao cao");
            System.out.println("6. Thanh lap hoi dong");
            System.out.println("7. Xem bao cao theo thuc tap doanh nghiep");
            System.out.println("8. Xem bao cao theo do an nganh");
            System.out.println("9. Xem bao cao theo khoa luan");
            System.out.println("10. Cham diem khoa luan");
            System.out.println("11. Sap xep bao cao theo ngay");
            System.out.println("12. Tim bao cao theo ma bao cao");
            System.out.println("13. Tim bao cao theo thoi gian");
            System.out.println("14. Tim hoi dong theo ngay lam viec");
            System.out.println("15. Thoat");
            System.out.println("==========================================\n");  
            
            System.out.print("=> Moi ban nhap lua chon: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 ->  {
                    ql.addInternship();
                }
                case 2 ->  {
                    ql.addProject();
                }
                case 3 ->  {
                    ql.addThesis();
                }
                case 4 -> {
                    ql.removeReport();
                }
                case 5 -> {
                    ql.editReport();
                }
                case 6 ->  {
                    ql.establishCouncil();
                }
                case 7 ->  {
                    ql.listByInternship().forEach(r -> r.displayReport());
                }
                case 8 ->  {
                    ql.listByProject().forEach(r -> r.displayReport());
                }
                case 9 ->  {
                    ql.listByThesis().forEach(r -> r.displayReport());
                }
                case 10 ->  {
                    ql.markScore();
                }
                case 11 ->  {
                    ql.listByDate();
                    System.out.println("-- Sap xep thanh cong --");
                }
                case 12 ->  {
                    System.out.print("- Nhap ma bao cao can tim: ");
                    String keyWord = sc.nextLine();
                    ql.searchReportByName(keyWord);
                }
                case 13 ->  {
                    System.out.print("- Nhap ngay can tim: ");
                    Date date = f.parse(sc.nextLine());
                    ql.searchReportByDate(date);
                }
                case 14 ->  {
                    System.out.print("- Tu ngay: ");
                    Date from = f.parse(sc.nextLine());
                    System.out.print("- Den ngay: ");
                    Date to = f.parse(sc.nextLine());
                    ql.searchCouncilByDate(from, to).forEach(h -> h.displayCouncil());
                }
            }
        } while (choice != 13);
    }
}
