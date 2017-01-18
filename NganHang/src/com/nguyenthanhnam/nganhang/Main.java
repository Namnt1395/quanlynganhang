package com.nguyenthanhnam.nganhang;

public class Main {
	public static void main(String[] args) {
         Bank bank=new Bank();
         //tao tai khoan moi
         User nam=new User(1,"Nguyen thanh nam","13207377","0973006457","Ha hoa-phu tho","12345678",100,0,"12/12/2016");
         User hung=new User(1,"Nguyen Manh Hung","13207378","0973006457","Ha Noi","123456789",200,0,"12/12/2015");
         //create acrout
         bank.createUser(nam);
         bank.createUser(hung);
         //gui tien vao
         bank.guiTienVao("12345678", 1200);
         bank.hienThiThongTinThe("12345678");
         bank.rutTien("12345678", 200);
         bank.hienThiThongTinThe("12345678");
         bank.guiTienChoNguoiKhac("12345678",100,"123456789");
         System.out.println("THONG TIN NGUOI NHAN");
         bank.hienThiThongTinThe("123456789");
	}
}
