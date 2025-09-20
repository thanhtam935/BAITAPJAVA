package Class;

import java.util.Scanner;

public class TaiLieu {
	// thuoc tinh
	private String maTaiLieu_117;
	private String tenNXB_117;
	private int soBanPhatHanh_117;

	// phuong thuc
	// ham khoi tao khong doi so
	public TaiLieu() {

	}

	// ham khoi tao co doi so
	public TaiLieu(String maTaiLieu_117, String tenNXB_117, int soBanPhatHanh_117) {
		this.maTaiLieu_117 = maTaiLieu_117;
		this.tenNXB_117 = tenNXB_117;
		this.soBanPhatHanh_117 = soBanPhatHanh_117;
	}

	// nhap
	public void nhapThongTin(Scanner sc_117) {
		System.out.print("\tNhap ma tai lieu: ");
		maTaiLieu_117 = sc_117.nextLine();
		System.out.print("\tNhap ten nha xuat ban: ");
		tenNXB_117 = sc_117.nextLine();
		System.out.print("\tNhap so ban phat hanh: ");
		soBanPhatHanh_117 = sc_117.nextInt();
		sc_117.nextLine();
	}

	// hien thi
	public void hienThiThongTin() {
		System.out.println("\tMa tai lieu: " + maTaiLieu_117);
		System.out.println("\tTen nha xuat ban: " + tenNXB_117);
		System.out.println("\tSo ban phat hanh: " + soBanPhatHanh_117);
	}

	// ham lay ra ma tai lieu
	public String getMaTaiLieu_117() {
		return maTaiLieu_117;
	}
}
