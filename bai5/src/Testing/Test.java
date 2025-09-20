package Testing;

import java.util.Scanner;
import Class.KhuPho;

public class Test {
    public static void main(String[] args) {
        Scanner sc_117 = new Scanner(System.in);
        KhuPho qlkp_117 = new KhuPho();
        
        // Nhập danh sách hộ dân
        qlkp_117.nhapDanhSach(sc_117);

        // Hiển thị người >= 80 tuổi
        System.out.println("\nDanh sach ho dan co nguoi 80 tuoi tro len:");
        qlkp_117.timKiemThongTin();

        sc_117.close();
    }
}
