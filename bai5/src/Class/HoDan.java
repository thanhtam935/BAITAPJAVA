package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class HoDan {
    private ArrayList<Nguoi> danhSachNguoi_117 = new ArrayList<>();

    public void nhapThongTin(Scanner sc_117) {
        System.out.print("Nhap so nguoi trong ho dan: ");
        int n = sc_117.nextInt();
        sc_117.nextLine(); // đọc bỏ ký tự Enter còn dư
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin nguoi thu " + (i+1) + ":");
            Nguoi nguoi = new Nguoi();
            nguoi.nhapThongTin(sc_117);
            danhSachNguoi_117.add(nguoi);
        }
    }

    public void hienThiNguoi80TuoiTroLen() {
        for (Nguoi nguoi : danhSachNguoi_117) {
            if (nguoi.tinhTuoi() >= 80) {
                nguoi.hienThiThongTin();
            }
        }
    }
}
