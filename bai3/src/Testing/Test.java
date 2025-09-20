package Testing;

import java.util.Scanner;
import Class.QuanLySach;

public class Test {

    public static void main(String[] args) {
        Scanner sc_117 = new Scanner(System.in);

        QuanLySach qls_117 = new QuanLySach();

        qls_117.nhapDanhSachTL(sc_117);

        System.out.print("\n\nNhap vao loai tai lieu can tim: ");
        String loai_117 = sc_117.nextLine();
        qls_117.timLoaiTL(loai_117);

        System.out.print("\n\nNhap vao ma tai lieu can tim1: ");
        String maTL_117 = sc_117.nextLine();
        qls_117.timMaTL(maTL_117);

        sc_117.close();
    }

}
