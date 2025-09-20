package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh {
    // thuoc tinh
    private ArrayList<ThiSinh> dsts_117;

    // phuong thuc
    public TuyenSinh() {
        dsts_117 = new ArrayList<ThiSinh>(10);
    }

    // ham them 1 thi sinh
    public void themThiSinh(ThiSinh ts_117) {
        dsts_117.add(ts_117);
    }

    // nhap danh sach
    public void nhapDanhSach(Scanner sc_117) {
        ThiSinh ts_117;
        int chon_117;

        System.out.print("Nhap vao so luong thi sinh: ");
        int n_117 = sc_117.nextInt();
        sc_117.nextLine();

        for (int i = 0; i < n_117; i++) {
            System.out.println("Thi sinh thuoc khoi nao (1-KhoiA; 2-KhoiB; 3-KhoiC): ");
            chon_117 = sc_117.nextInt();

            switch (chon_117) {
            case 1:
                ts_117 = new KhoiA("Toan", "Ly", "Hoa");
                break;
            case 2:
                ts_117 = new KhoiB("Toan", "Hoa", "Sinh");
                break;
            case 3:
                ts_117 = new KhoiC("Van", "Su", "Dia");
                break;
            default:
                ts_117 = new KhoiA("Toan", "Ly", "Hoa");
                break;
            }

            ts_117.nhapThongTin(sc_117);
            themThiSinh(ts_117);
        }
    }

    // ham hien thi
    public void hienThiDanhSach() {
        int n_117 = dsts_117.size();
        for (int i = 0; i < n_117; i++) {
            System.out.println("Thi sinh thu " + (i + 1) + " la:");
            dsts_117.get(i).hienThiThongTin();
        }
    }

    // tim kiem thi sinh theo so bao danh
    public void timKiemThiSinh(int soBaoDanh_117) {
        for (ThiSinh ts_117 : dsts_117) {
            if (ts_117.getSoBD_117() == soBaoDanh_117) {
                ts_117.hienThiThongTin();
            }
        }
    }
}
