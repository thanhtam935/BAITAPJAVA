package Class;

import java.util.Scanner;

public class ThiSinh {
    // thuoc tinh
    private int soBD_117;
    private String hoTen_117;
    private String diaChi_117;
    private String dienUuTien_117;

    // phuong thuc
    // ham khoi tao khong doi so
    public ThiSinh() {

    }

    // ham khoi tao co doi so
    public ThiSinh(int soBD_117, String hoTen_117, String diaChi_117, String dienUuTien_117) {
        this.soBD_117 = soBD_117;
        this.hoTen_117 = hoTen_117;
        this.diaChi_117 = diaChi_117;
        this.dienUuTien_117 = dienUuTien_117;
    }

    // ham nhap
    public void nhapThongTin(Scanner sc_117) {
        System.out.print("\tNhap so bao danh: ");
        soBD_117 = sc_117.nextInt();
        sc_117.nextLine();
        System.out.print("\tNhap ho ten: ");
        hoTen_117 = sc_117.nextLine();
        System.out.print("\tNhap dia chi: ");
        diaChi_117 = sc_117.nextLine();
        System.out.print("\tNhap dien uu tien: ");
        dienUuTien_117 = sc_117.nextLine();
    }

    // ham hien thi
    public void hienThiThongTin() {
        System.out.println("\tSo bao danh: " + soBD_117);
        System.out.println("\tHo ten: " + hoTen_117);
        System.out.println("\tDia chi: " + diaChi_117);
        System.out.println("\tDien uu tien: " + dienUuTien_117);
    }

    // ham lay ra thong tin ve so bao danh
    public int getSoBD_117() {
        return soBD_117;
    }
}
