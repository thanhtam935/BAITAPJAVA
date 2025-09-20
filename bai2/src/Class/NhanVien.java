package Class;

import java.util.Scanner;

public class NhanVien extends CanBo {
	// thuoc tinh
	private String congViec_117;

	// phuong thuc
	// ham khoi tao khong doi so
	public NhanVien() {

	}

	// ham khoi tao co doi so
	public NhanVien(String hoTen_117, String ngaySinh_117, String gioiTinh_117, String diaChi_117, String congViec_117) {
		super(hoTen_117, ngaySinh_117, gioiTinh_117, diaChi_117);
		this.congViec_117 = congViec_117;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc_117) {
		super.nhapThongTin(sc_117);
		System.out.print("\tNhap cong viec: ");
		congViec_117 = sc_117.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tCong viec: " + congViec_117);
	}
}
