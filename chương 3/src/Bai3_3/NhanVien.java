package Bai3_3;

import java.util.Scanner;

public class NhanVien {
	private String ma, ten, ngaySinh;
	private double luong;

	public void nhap() {
		Scanner s = new Scanner(System.in);
		System.out.println("nhap ma, ten, ngay sinh");
		ma = s.nextLine();
		ten = s.nextLine();
		ngaySinh = s.nextLine();
		System.out.println("nhap luong=");
		luong = s.nextDouble();
	}

	public String toString() {
		return "ma=" + ma + "\t ten=" + ten + "\t ngaySinh=" + ngaySinh + "\tluong=" + luong;
	}

	public static void main(String[] args) {
		int n; // số nhân viên
		NhanVien dsNV[]; // khai báo mảng nhân viên
		Scanner s = new Scanner(System.in);
		System.out.print("nhap so luong nhan vien n=");
		n = s.nextInt();
		dsNV = new NhanVien[n]; // xin cấp phát mảng
		System.out.println("nhap danh sách nhan vien");
		for (int i = 0; i < n; i++) {
			dsNV[i] = new NhanVien();
			dsNV[i].nhap();
			// xin cấp phát đối tượng dsNV[i].nhap();
		}
		System.out.println("Danh sách sau khi nhap la");
		for (int i = 0; i < n; i++)
			System.out.println(dsNV[i]);
	}
}
