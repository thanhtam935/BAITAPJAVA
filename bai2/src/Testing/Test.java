package Testing;

import java.util.Scanner;
import Class.QLCB;

public class Test {

	public static void main(String[] args) {
		Scanner sc_117 = new Scanner(System.in);

		QLCB qlcb_117 = new QLCB();

		qlcb_117.nhapDanhSach(sc_117);

		System.out.print("Nhap vao ho ten can tim kiem: ");
		String name_117 = sc_117.nextLine();

		qlcb_117.timKiemCanBo(name_117);

		// huy sc
		sc_117.close();
	}

}
