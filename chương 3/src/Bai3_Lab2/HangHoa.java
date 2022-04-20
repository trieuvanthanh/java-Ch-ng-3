package Bai3_Lab2;

import java.util.Scanner;

public class HangHoa {
   public int MaHang;
   public String TenHang,NhaSanXuat;
   public double Gia;
   public static Scanner s = new Scanner(System.in);
   public void  nhap() {
	   System.out.println(" Mã Hàng : ");
	   MaHang=s.nextInt();
	   s.nextLine();
	   System.out.println(" Tên Hàng : ");
	   TenHang=s.nextLine();
	   System.out.println("Nhà Sản Xuất : ");
	   NhaSanXuat=s.nextLine();
	   System.out.println("Giá : ");
	   Gia=s.nextDouble();
}
   public String toString() {
	   return "Mã Hàng " + MaHang + "Tên Hàng : " + TenHang + "Nhà Sản Xuất " + NhaSanXuat + "Gía : " + Gia;
   }
}
