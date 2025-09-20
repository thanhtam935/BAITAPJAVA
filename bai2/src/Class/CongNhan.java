package Class;

import java.util.Scanner;

public class CongNhan extends CanBo {
	// thuoc tinh
	private String bac_117;

	// phuong thuc
	// ham khoi tao khong doi so
	public CongNhan() {

	}

	// ham khoi tao co doi so
	public CongNhan(String hoTen_117, String ngaySinh_117, String gioiTinh_117, String diaChi_117, String bac_117) {
		super(hoTen_117, ngaySinh_117, gioiTinh_117, diaChi_117);
		this.bac_117 = bac_117;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc_117) {
		super.nhapThongTin(sc_117);
		System.out.print("\tNhap bac: ");
		bac_117 = sc_117.nextLine();
	}

	// ham hien thi thong tin
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tBac: " + bac_117
				);
	}
}
