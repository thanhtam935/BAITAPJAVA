package Class;

import java.util.Scanner;

public class KySu extends CanBo {
	// thuoc tinh
	private String nganhDaoTao_117;

	// phuong thuc
	// ham khoi tao khong doi so
	public KySu() {

	}

	// ham khoi tao co doi so
	public KySu(String hoTen_117, String ngaySinh_117, String gioiTinh_117, String diaChi_117, String nganhDaoTao_117) {
		super(hoTen_117, ngaySinh_117, gioiTinh_117, diaChi_117);
		this.nganhDaoTao_117 = nganhDaoTao_117;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc_117) {
		super.nhapThongTin(sc_117);
		System.out.print("\tNhap nganh dao tao: ");
		nganhDaoTao_117 = sc_117.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tNganh dao tao: " + nganhDaoTao_117
				);
	}
}
