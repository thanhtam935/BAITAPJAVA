package Test;

import java.util.Scanner;

import Class.PhanSo;

public class TestClass {
	
	public static void main(String[] args) {
		Scanner sc_117=new Scanner(System.in);
		PhanSo ps1_117=new PhanSo();
		PhanSo ps2_117=new PhanSo();
		PhanSo psTong_117 =new PhanSo();
		
		System.out.println("Nhap vao phan so thu nhat:");
		ps1_117.nhapPS(sc_117);
		System.out.println("Nhap vao phan so thu hai:");
		ps2_117.nhapPS(sc_117);
		
		psTong_117=ps1_117.congPS(ps2_117);
		
		System.out.println("\nPhan so thu nhat la:");
        ps1_117.hienThiPS();
        System.out.println("\nPhan so thu hai la:");
        ps2_117.hienThiPS();
        System.out.println("\nPhan so tong la:");
        psTong_117.hienThiPS();
		
		
		sc_117.close();

	}

}
