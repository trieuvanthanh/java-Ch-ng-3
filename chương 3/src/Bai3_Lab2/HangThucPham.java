package Bai3_Lab2;

public class HangThucPham extends HangHoa {
	public String   NgaySanXuat;
	public String  NgayHetHan;
    public void nhap() {
    	System.out.println("Nhập vào Ngày Sản Xuất : ");
    	NgaySanXuat=s.nextLine();s.nextLine();
    	System.out.println("Nhậo vào Ngày Hết hạn : ");
    	NgayHetHan=s.nextLine();
    }
	public String toString() {
		return "Ngày sản xuất : " + NgaySanXuat +"\t" + "Ngày Hết Hạn : " + NgayHetHan;
	}
}
