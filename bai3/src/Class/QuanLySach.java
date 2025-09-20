package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {
	// thuoc tinh
	private ArrayList<TaiLieu> dstl_117;

	// phuong thuc
	// ham khoi tao
	public QuanLySach() {
		dstl_117 = new ArrayList<TaiLieu>(10);
	}

	// them moi 1 tai lieu
	public void themTaiLieu(TaiLieu tl_117) {
		dstl_117.add(tl_117);
	}

	// nhap danh sach tai lieu
	public void nhapDanhSachTL(Scanner sc_117) {
		int chon_117;
		String stop_117;
		TaiLieu tl_117;

		do {
			System.out.print("Chon loai tai lieu (1-Sach; 2-TapChi; 3-Bao): ");
			chon_117= sc_117.nextInt();
			sc_117.nextLine();

			switch (chon_117) {
			case 1:
				tl_117 = new Sach();
				break;
			case 2:
				tl_117 = new TapChi();
				break;
			case 3:
				tl_117 = new Bao();
				break;
			default:
				
				tl_117 = new Sach();
				break;
			}

			tl_117.nhapThongTin(sc_117);
			themTaiLieu(tl_117);

			System.out.print("\nBan co muon nhap vao nua hay khong (c/k): ");
			stop_117 = sc_117.nextLine();
		} while (stop_117.equals("c"));
	}

	// tim kiem theo ma tai lieu
	public void timMaTL(String maTL_117) {
	    for (TaiLieu tl_117 : dstl_117) {
	        if (tl_117.getMaTaiLieu_117().equals(maTL_117)) {
	            tl_117.hienThiThongTin();
	        }
	    }
	}

	// tim kiem theo loai tai lieu
	public void timLoaiTL(String loai_117) {
		for (TaiLieu tl_117 : dstl_117) {
			if (loai_117.equals("Sach") && (tl_117 instanceof Sach)) {
				tl_117.hienThiThongTin();
			} else if (loai_117.equals("TapChi") && (tl_117 instanceof TapChi)) {
				tl_117.hienThiThongTin();
			} else if (loai_117.equals("Bao") && (tl_117 instanceof Bao)) {
				tl_117.hienThiThongTin();
			}
		}
	}
}
