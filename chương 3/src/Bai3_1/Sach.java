package Bai3_1;
import java.util.*;
public class Sach {
     public Integer MaSach,SoTrang,SoTap;
     public String TenSach,TenTacGia,LoaiSach,NXB;
     public Double Gia;
     public static Scanner sc=new Scanner(System.in);
     public Sach(){
     System.out.println("Nhập Thông Tin Sách ");
     System.out.println("Mã Sách : ");
     MaSach=sc.nextInt();
     sc.nextLine();
     System.out.println("Tên Sách : ");
     TenSach=sc.nextLine();
     System.out.println("Tên Tác Giả :");
     TenTacGia=sc.nextLine();
     System.out.println("Số Trang : ");
     SoTrang=sc.nextInt();
     sc.nextLine();
     System.out.println("Loại sách : ");
     LoaiSach=sc.nextLine();
     System.out.println("Nhà xuất bản : ");
     NXB=sc.nextLine();
     System.out.println("Số tập : ");
     SoTap=sc.nextInt();
     System.out.println("Giá : ");
     Gia=sc.nextDouble();
     }
     public void InSach() {
    	System.out.println("Thông Tin của cuốn sách : " +"Mã Sách : "
     + MaSach+ " "+"Tên Sách "+ TenSach+" " +"Tên Tác Giả : "+ TenTacGia+ " " +"Số Trang "+ SoTrang+" " +
    "Loại Sách : "+ LoaiSach + " " +"Nhà xuất bản : "+ NXB+" " +"Số Tập "+ SoTap+" "+ "Giá bán " + Gia ); 
     }
} //Triệu Văn Thành 2021050599
