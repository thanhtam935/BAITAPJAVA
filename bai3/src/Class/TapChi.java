package Class;

import java.util.Scanner;

public class TapChi extends TaiLieu {
	// thuoc tinh
	private int soPhatHanh_117;
	private int thangPhatHanh_117;

	// phuong thuc
	// ham khoi tao khong doi so
	public TapChi() {

	}

	// ham khoi tao co doi so
	public TapChi(String maTaiLieu_117, String tenNXB_117, int soBanPhatHanh_117, int soPhatHanh_117, int thangPhatHanh_117) {
		super(maTaiLieu_117, tenNXB_117, soBanPhatHanh_117);
		this.soPhatHanh_117 = soPhatHanh_117;
		this.thangPhatHanh_117 = thangPhatHanh_117;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc_117) {
		super.nhapThongTin(sc_117);
		System.out.print("\tNhap so phat hanh: ");
		soPhatHanh_117 = sc_117.nextInt();
		System.out.print("\tNhap thang phat hanh: ");
		thangPhatHanh_117 = sc_117.nextInt();
		sc_117.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tSo phat hanh: " + soPhatHanh_117);
		System.out.println("\tThang phat hanh: " + thangPhatHanh_117);
	}
}
