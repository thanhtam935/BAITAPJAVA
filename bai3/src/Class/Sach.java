package Class;

import java.util.Scanner;

public class Sach extends TaiLieu {
	// thuoc tinh
	private String tacGia_117;
	private int soTrang_117;

	// phuong thuc
	// ham khoi tao khong doi so
	public Sach() {

	}

	// ham khoi tao co doi so
	public Sach(String maTaiLieu_117, String tenNXB_117, int soBanPhatHanh_117, String tacGia_117, int soTrang_117) {
		super(maTaiLieu_117, tenNXB_117, soBanPhatHanh_117);
		this.tacGia_117 = tacGia_117;
		this.soTrang_117 = soTrang_117;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc_117) {
		super.nhapThongTin(sc_117);
		System.out.print("\tNhap tac gia: ");
		tacGia_117 = sc_117.nextLine();
		System.out.print("\tNhap so trang: ");
		soTrang_117 = sc_117.nextInt();
		sc_117.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tTac gia: " + tacGia_117);
		System.out.println("\tSo trang: " + soTrang_117);
	}
}
