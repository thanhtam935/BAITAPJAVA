package Class;
import java.util.Scanner;
public class CanBo {
	// thuoc tinh
	private String hoTen_117;
	private String ngaySinh_117;
	private String gioiTinh_117;
	private String diaChi_117;
	// phuong thuc
	// ham khoi tao khong doi so
	public CanBo() {
	}
	// ham khoi tao co doi so
	public CanBo(String hoTen_117, String ngaySinh_117, String gioiTinh_117, String diaChi_117) {
		this.hoTen_117 = hoTen_117;
		this.ngaySinh_117 = ngaySinh_117;
		this.gioiTinh_117 = gioiTinh_117;
		this.diaChi_117 = diaChi_117;
	}
	// ham nhap
	public void nhapThongTin(Scanner sc_117) {
		System.out.print("\tNhap ho ten: ");
		hoTen_117 = sc_117.nextLine();
		System.out.print("\tNhap ngay sinh (dd/MM/yyyy): ");
		ngaySinh_117 = sc_117.nextLine();
		System.out.print("\tNhap gioi tinh: ");
		gioiTinh_117 = sc_117.nextLine();
		System.out.print("\tNhap dia chi: ");
		diaChi_117 = sc_117.nextLine();
	}
	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen_117);
		System.out.println("\tNgay sinh: " + ngaySinh_117);
		System.out.println("\tGioi tinh: " + gioiTinh_117);
		System.out.println("\tDia chi: " + diaChi_117);
	}
	// ham lay thong tin ho ten
	public String getHoTen() {
		return this.hoTen_117;
	}
}
