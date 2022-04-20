package Bai3_Lab2;

import java.util.Scanner;

public class NgayThang extends HangThucPham{
    Integer ngay,thang,nam;
    public static Scanner sc= new Scanner(System.in);
    public void nhap() {
    	System.out.println("Nhập vào ngày : ");
    	ngay=sc.nextInt();
    	System.out.println("Nhập vào tháng : ");
    	thang=sc.nextInt();
    	System.out.println("Nhập vào năm : ");
    	nam=sc.nextInt();
    }
    public String toString() {
    	return "Ngày : " + ngay + "Tháng : " + thang + " Năm : " + nam;
    }
}
