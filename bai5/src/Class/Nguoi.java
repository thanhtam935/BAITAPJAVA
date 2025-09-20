package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;

public class Nguoi {
    private String hoTen_117;
    private Date ngaySinh_117;
    private String ngheNghiep_117;

    public Nguoi() {}

    public Nguoi(String hoTen_117, Date ngaySinh_117, String ngheNghiep_117) {
        this.hoTen_117 = hoTen_117;
        this.ngaySinh_117 = ngaySinh_117;
        this.ngheNghiep_117 = ngheNghiep_117;
    }

    public void nhapThongTin(Scanner sc_117) {
        System.out.print("\tNhap ho ten: ");
        hoTen_117 = sc_117.nextLine();
        System.out.print("\tNhap ngay sinh (dd-MM-yyyy): ");
        String strDate_117 = sc_117.nextLine();
        ngaySinh_117 = strToDate(strDate_117);
        System.out.print("\tNhap nghe nghiep: ");
        ngheNghiep_117 = sc_117.nextLine();
    }

    private Date strToDate(String strDate_117) {
        SimpleDateFormat sdf_117 = new SimpleDateFormat("dd-MM-yyyy");
        try {
            return sdf_117.parse(strDate_117);
        } catch (ParseException e) {
            System.out.println("Loi dinh dang ngay thang! Mac dinh la ngay hien tai.");
            return new Date();
        }
    }

    public void hienThiThongTin() {
        System.out.println("\tHo ten: " + hoTen_117);
        System.out.println("\tNgay sinh: " + dateToString(ngaySinh_117));
        System.out.println("\tNghe nghiep: " + ngheNghiep_117);
        System.out.println("\tTuoi: " + tinhTuoi());
    }

    private String dateToString(Date date_117) {
       
     // Sửa đổi dòng 53 thành:
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return sdf.format(date);
    }

    public int tinhTuoi() {
        Calendar sinh = Calendar.getInstance();
        sinh.setTime(ngaySinh_117);
        Calendar now = Calendar.getInstance();
        int tuoi = now.get(Calendar.YEAR) - sinh.get(Calendar.YEAR);
        if (now.get(Calendar.DAY_OF_YEAR) < sinh.get(Calendar.DAY_OF_YEAR)) {
            tuoi--;
        }
        return tuoi;
    }
}
