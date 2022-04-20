package Bai3_2;

public class TamGiac extends Diem {
	public double c;

	TamGiac() {
		System.out.println("Nhập vào C : ");
		c = sc.nextDouble();
	}

	public void KiemTra() {
		// kiểm tra xem ba cạnh có phải là ba cạnh của một tam giác hay không
		if (x < y + c && y < x + c && c < x + y) {
			
			if (x * x == y * y + c * c || y * y == x * x + c * c || c * c == x * x + y * y) {
				System.out.println("Đây là tam giác vuông");
			}
			// điều kiện tam giác đều là 3 cạnh bằng nhau
			else if (x == y && y == c) {
				System.out.println("Đây là tam giác đều");
			}
			// điều kiện tam giác cân là 2 cạnh bằng nhau
			else if (x == y || x == c || y == c) {
				System.out.println("Đây là tam giác cân");
			}
			// điều kiện tam giác tù là có một góc lơn hơn 90 độ
			else if (x * x > y * y + c * c || y * y > x * x + c * c || c * c > x * x + y * y) {
				System.out.println("Đây là tam giác tù");
			}
			// và trường hợp còn lại là tam giác nhọn
			else {
				System.out.println("Đây là tam giác nhọn");
			}
		}
		// điều kiện ba cạnh nhập vào không phải là ba cạnh của một tam giác
		else
			System.out.println("Ba cạnh a, b, c không phải là ba cạnh của một tam giác");
	}

	public void TinhChuVi() {
		double chuVi = 0;
		if ((x + y > c) && (x + c > y) && (y + c > x)) {
			chuVi = x + y + c;
			System.out.println("Chu vi của tam giác bằng = " + chuVi);
		} else {
			System.out.println("Không tồn tại tam giác");
			return;
		}
	}

	public void TinhDienTich() {
		double Dientich = 0;
		if ((x + y > c) && (x + c > y) && (y + c > x)) {
			Dientich = Math.sqrt(x + y + c);
			System.out.println("Diện tích  của tam giác bằng = " + Dientich);
		} else {
			System.out.println("Không tồn tại tam giác");
			return;
		}
	}
}
