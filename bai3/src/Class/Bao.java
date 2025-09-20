package Class;

import java.util.Scanner;

public class Bao extends TaiLieu {
	// thuoc tinh
	private String ngayPhatHanh_117;

	// phuong thuc
	// ham khoi tao khong doi so
	public Bao() {

	}

	// ham khoi tao co doi so
	public Bao(String maTaiLieu_117, String tenNXB_117, int soBanPhatHanh_117, String ngayPhatHanh_117) {
		super(maTaiLieu_117, tenNXB_117, soBanPhatHanh_117);
		this.ngayPhatHanh_117 = ngayPhatHanh_117;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc_117) {
		super.nhapThongTin(sc_117);
		System.out.print("\tNhap ngay phat hanh: ");
		ngayPhatHanh_117 = sc_117.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tNgay phat hanh: " + ngayPhatHanh_117);
	}
}
