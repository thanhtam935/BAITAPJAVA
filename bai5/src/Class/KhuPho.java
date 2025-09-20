package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class KhuPho {
    private ArrayList<HoDan> danhSachHoDan_117 = new ArrayList<>();

    public void nhapDanhSach(Scanner sc_117) {
        System.out.print("Nhap so ho dan: ");
        int n = sc_117.nextInt();
        sc_117.nextLine(); // đọc bỏ Enter
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin ho dan thu " + (i+1) + ":");
            HoDan hd = new HoDan();
            hd.nhapThongTin(sc_117);
            danhSachHoDan_117.add(hd);
        }
    }

    public void timKiemThongTin() {
        for (HoDan hd : danhSachHoDan_117) {
            hd.hienThiNguoi80TuoiTroLen();
        }
    }
}
