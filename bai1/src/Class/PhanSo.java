package Class;

import java.util.Scanner;

public class PhanSo {
	// thuộc tính
	private int tuSo_117;
	private int mauSo_117;

	// hàm khởi tạo không đối số
	public PhanSo() {
		tuSo_117 = 0;
		mauSo_117 = 1;
	}

	// hàm khởi tạo có đối số
	public PhanSo(int tuSo, int mauSo) {
		this.tuSo_117 = tuSo;
		this.mauSo_117 = mauSo;
	}

	// hàm nhập phân số
	public void nhapPS(Scanner sc) {
		int a_117;
		int b_117;

		do {
			System.out.print("\tNhap vao tu so: ");
			a_117 = sc.nextInt();

			System.out.print("\tNhap vao mau so: ");
			b_117 = sc.nextInt();

			// kiểm tra
			if (b_117 == 0) {
				System.out.println("Mau so khong duoc bang 0. Hay nhap lai!");
			} else {
				tuSo_117 = a_117;
				mauSo_117 = b_117;
			}
		} while (b_117 == 0);
	}

	// hàm hiển thị
	public void hienThiPS() {
		if (tuSo_117 * mauSo_117 < 0) {
			System.out.println("\t-" + Math.abs(tuSo_117) + "/" + Math.abs(mauSo_117));
		} else {
			System.out.println("\t" + Math.abs(tuSo_117) + "/" + Math.abs(mauSo_117));
		}
	}

	// hàm cộng
	public PhanSo congPS(PhanSo ps2) {
		int a_117 = tuSo_117 * ps2.mauSo_117 + ps2.tuSo_117 * mauSo_117;
		int b_117 = mauSo_117 * ps2.mauSo_117;

		return new PhanSo(a_117, b_117);
	}

	// hàm trừ
	public PhanSo truPS(PhanSo ps2) {
		int a_117 = tuSo_117 * ps2.mauSo_117 - ps2.tuSo_117 * mauSo_117;
		int b_117 = mauSo_117 * ps2.mauSo_117;

		return new PhanSo(a_117, b_117);
	}

	// hàm nhân
	public PhanSo nhanPS(PhanSo ps2) {
		int a_117 = tuSo_117 * ps2.tuSo_117;
		int b_117 = mauSo_117 * ps2.mauSo_117;

		return new PhanSo(a_117, b_117);
	}

	// hàm chia
	public PhanSo chiaPS(PhanSo ps2) {
		int a_117 = tuSo_117 * ps2.mauSo_117;
		int b_117 = mauSo_117 * ps2.tuSo_117;

		return new PhanSo(a_117, b_117);
	}

	// hàm tìm USCLN
	private int timUSCLN(int a_117, int b_117) {
		int r_117 = a_117 % b_117;

		while (r_117 != 0) {
			a_117 = b_117;
			b_117 = r_117;
			r_117 = a_117 % b_117;
		}

		return b_117;
	}

	// hàm kiểm tra phân số tối giản hay chưa
	public boolean kiemTraToiGian() {
		if (timUSCLN(tuSo_117
				, mauSo_117) == 1) {
			return true;
		}
		return false;
	}

	// hàm tối giản
	public void toiGianPS() {
		int x_117 = timUSCLN(tuSo_117, mauSo_117);

		tuSo_117 /= x_117;
		mauSo_117 /= x_117;
	}
}
