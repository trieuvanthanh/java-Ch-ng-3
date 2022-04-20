package Bai3_Lab2;

import java.util.ArrayList;
import java.util.Scanner;

import Bai3_Lab2.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n; // số Hàng Hóa
		//HangHoa HangHoa[]; // khai báo mảng Hàng hóa
		//Scanner s = new Scanner(System.in);
		//System.out.print("Nhập Số Lượng Hàng Hóa  n =");
		//n = s.nextInt();
		//HangHoa = new HangHoa[n]; // xin cấp phát mảng
		//System.out.println("Nhập danh sách hàng hóa : ");
		//for (int i = 0; i < n; i++) {
		//	HangHoa[i] = new HangHoa();
			//HangHoa[i].nhap();
	//	}
		//System.out.println("Danh sách sau khi nhap la");
		//for (int i = 0; i < n; i++)
			//System.out.println(HangHoa[i]);
		ArrayList<HangHoa> list = new ArrayList<HangHoa>();
		HangHoa hh = new HangHoa();
		hh.nhap();
		System.out.println(hh);
		list.add(hh);
		HangThucPham ht = new HangThucPham();
		ht.nhap();
		System.out.println(ht);;
		}
}
	
