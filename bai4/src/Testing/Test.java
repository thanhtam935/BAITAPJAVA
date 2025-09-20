package Testing;

import java.util.Scanner;
import Class.TuyenSinh;

public class Test {

    public static void main(String[] args) {
        Scanner sc_117 = new Scanner(System.in);

        TuyenSinh dsTuyenSinh_117 = new TuyenSinh();

        System.out.println("Nhap vao danh sach thi sinh: ");
        dsTuyenSinh_117.nhapDanhSach(sc_117);

        System.out.println("Danh sach thi sinh du thi la:");
        dsTuyenSinh_117.hienThiDanhSach();

        System.out.print("Nhap so bao danh can tim: ");
        int soBaoDanh_117 = sc_117.nextInt();
        sc_117.nextLine();

        dsTuyenSinh_117.timKiemThiSinh(soBaoDanh_117);

        sc_117.close();
    }

}
