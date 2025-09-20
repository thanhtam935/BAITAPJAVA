package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
	// thuoc tinh
	private ArrayList<CanBo> dscb_117;

	// phuong thuc
	// ham khoi tao
	public QLCB() {
		dscb_117 = new ArrayList<CanBo>(10);
	}

	// ham them can bo
	public void themCanBo(CanBo cb_117) {
		dscb_117.add(cb_117);
	}

	// ham nhap danh sach
	public void nhapDanhSach(Scanner sc_117) {
		CanBo cb_117;
		System.out.print("Nhap vao so luong can bo: ");
		int n_117 = sc_117.nextInt();
		sc_117.nextLine();

		System.out.println("Nhap thong tin chi tiet:");
		for (int i_117 = 0; i_117 < n_117; i_117++) {
			System.out.println("Lan nhap thu " + (i_117 + 1) + ":");
			System.out.print("Chon can bo (1-KySu; 2-NhanVien; 3-CongNhan): ");
			int chon_117 = sc_117.nextInt();
			sc_117.nextLine();

			cb_117 = new CanBo();

			switch (chon_117) {
			case 1:
				cb_117 = new KySu();
				break;
			case 2:
				cb_117 = new NhanVien();
				break;
			case 3:
				cb_117 = new CongNhan();
				break;
			default:
				cb_117 = new KySu();
				break;
			}

			// sau khi chon loai can bo thi nhap thong tin cho can bo do
			cb_117.nhapThongTin(sc_117);

			// nhap xong roi thi them can bo vao danh sach
			themCanBo(cb_117);
		}
	}

	// ham tim kiem theo ten
	public void timKiemCanBo(String hoTen_117) {
		for (CanBo cb_117 : dscb_117) {
			if (hoTen_117.equals(cb_117.getHoTen())) {
				cb_117.hienThiThongTin();
			}
		}
	}
}
