package Class;

import java.util.Scanner;

public class KhoiA extends ThiSinh {
    // thuoc tinh
    private String mon1_117;
    private String mon2_117;
    private String mon3_117;

    // phuong thuc
    // ham khoi tao khong doi so
    public KhoiA() {

    }

    // ham khoi tao co doi so
    public KhoiA(String mon1_117, String mon2_117, String mon3_117) {
        this.mon1_117 = mon1_117;
        this.mon2_117 = mon2_117;
        this.mon3_117 = mon3_117;
    }

    // ham nhap
    public void nhapThongTin(Scanner sc_117) {
        super.nhapThongTin(sc_117);
        System.out.print("\tNhap mon 1: ");
        mon1_117 = sc_117.nextLine();
        System.out.print("\tNhap mon 2: ");
        mon2_117 = sc_117.nextLine();
        System.out.print("\tNhap mon 3: ");
        mon3_117 = sc_117.nextLine();
    }

    // ham hien thi
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tTo hop mon thi: " + mon1_117 + " - " + mon2_117 + " - " + mon3_117);
    }
}
