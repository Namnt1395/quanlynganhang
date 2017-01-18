package com.nguyenthanhnam.nganhang;

import java.util.ArrayList;

public class Bank {
	public static final float CUOCPHI = 330;
	public static final float SOTIENTOITHIEU = 100;
	private ArrayList<User> listUser;
	private float tienDuHienTai;
	private float tienAmHienTai;

	public Bank() {
		listUser = new ArrayList<User>();
	}

	public void createUser(User user) {
		listUser.add(user);
	}

	private int getSoTienHienTai(String soTaiKhoan, int index) {
		tienDuHienTai = listUser.get(index).getSoTienDu();
		tienAmHienTai = listUser.get(index).getSoTienAm();
		return index;
	}

	private int checkTaiKhoan(String soTaiKhoan) {
		User user = new User(soTaiKhoan);
		if (listUser.contains(user)) {
			return listUser.indexOf(user);
		}
		return -1;
	}

	public void guiTienVao(String soTaiKhoan, float soTien) {
		int index = checkTaiKhoan(soTaiKhoan);
		getSoTienHienTai(soTaiKhoan, index);
		if (tienDuHienTai > 0) {
			listUser.get(index).setSoTienDu((tienDuHienTai + soTien));
		} else {
			listUser.get(index).setSoTienDu((tienDuHienTai - soTien));
		}
	}

	public void guiTienChoNguoiKhac(String soTaiKhoan, float soTienChuyen,
			String soTaiKhoanDich) {
		int indexSend = checkTaiKhoan(soTaiKhoan);
		// thuc hien giao dich ben phia tai khoan chuyen tien
		getSoTienHienTai(soTaiKhoan, indexSend);
		if (tienDuHienTai > SOTIENTOITHIEU) {
			listUser.get(indexSend).setSoTienDu(
					(tienDuHienTai - soTienChuyen - CUOCPHI));
		} else if (tienDuHienTai < SOTIENTOITHIEU) {
			System.out.println("So du tai khoan cua ban khong du");
		}
		// thuc hien giao dich ben phia tai khoan nhan tien
		int indexRecive = checkTaiKhoan(soTaiKhoanDich);
		getSoTienHienTai(soTaiKhoan, indexRecive);
		if (tienDuHienTai > 0) {
			listUser.get(indexRecive).setSoTienDu(
					(tienDuHienTai + soTienChuyen));
		} else {
			listUser.get(indexRecive).setSoTienDu(
					(tienAmHienTai - soTienChuyen));
		}
	}

	public void rutTien(String soTaiKhoan, float soTienRut) {
		int index = checkTaiKhoan(soTaiKhoan);
		// thuc hien giao dich ben phia tai khoan chuyen tien
		getSoTienHienTai(soTaiKhoan, index);
		System.out.println("SO TIEN HIEN TAI:" + tienDuHienTai);
		if (tienDuHienTai > SOTIENTOITHIEU) {
			listUser.get(index).setSoTienDu(
					(tienDuHienTai - soTienRut - CUOCPHI));
		} else if (tienDuHienTai < SOTIENTOITHIEU) {
			System.out.println("So du tai khoan cua ban khong du");
		}
	}

	public void kiemTraSoTienDu(String soTaiKhoan) {
		int index = checkTaiKhoan(soTaiKhoan);
		System.out.println("So tien du:" + listUser.get(index).getSoTienDu());
	}

	public void kiemTraSoTienAm(String soTaiKhoan) {
		int index = checkTaiKhoan(soTaiKhoan);
		System.out.println("So tien du:" + listUser.get(index).getSoTienAm());
	}

	public void hienThiThongTinThe(String soTaiKhoan) {
		int index = checkTaiKhoan(soTaiKhoan);
		listUser.get(index).displayUser();
	}
}
