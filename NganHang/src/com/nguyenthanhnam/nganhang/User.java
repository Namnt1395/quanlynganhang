package com.nguyenthanhnam.nganhang;

public class User {
	private int id;
	private String hoTen;
	private String CMTND;
	private String soDT;
	private String soTaiKhoan;
	private String diaChi;
	private float soTienDu;
	private float soTienAm;
	private int soLanGiaoDich;
	private String ngayLap;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((soTaiKhoan == null) ? 0 : soTaiKhoan.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (soTaiKhoan == null) {
			if (other.soTaiKhoan != null)
				return false;
		} else if (!soTaiKhoan.equals(other.soTaiKhoan))
			return false;
		return true;
	}

	public User(String soTaiKhoan) {
		super();
		this.soTaiKhoan = soTaiKhoan;
	}

	public User(int id, String hoTen, String cMTND, String soDT, String diaChi,
			String soTaiKhoan, float soTienDu, float soTienAm, String ngayLap) {
		this.id = id;
		this.hoTen = hoTen;
		CMTND = cMTND;
		this.soDT = soDT;
		this.diaChi = diaChi;
		this.soTaiKhoan = soTaiKhoan;
		this.soTienDu = soTienDu;
		this.soTienAm = soTienAm;
		this.ngayLap = ngayLap;
	}

	public void displayUser() {
		System.out.println("ID:" + id);
		System.out.println("Ho Ten Chu The:" + hoTen);
		System.out.println("Chung Minh Thu Nhan Dan:" + CMTND);
		System.out.println("So dien thoai:" + soDT);
		System.out.println("Dia Chi:" + diaChi);
		System.out.println("So tai khoan:" + soTaiKhoan);
		System.out.println("So tien du:" + soTienDu);
		System.out.println("So tien am:" + soTienAm);
		System.out.println("So lan giao dich:" + soLanGiaoDich);
		System.out.println("Ngay lap tai khoan:" + ngayLap);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getCMTND() {
		return CMTND;
	}

	public void setCMTND(String cMTND) {
		CMTND = cMTND;
	}

	public String getSoDT() {
		return soDT;
	}

	public void setSoDT(String soDT) {
		this.soDT = soDT;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public float getSoTienDu() {
		return soTienDu;
	}

	public void setSoTienDu(float soTienDu) {
		this.soTienDu = soTienDu;
	}

	public float getSoTienAm() {
		return soTienAm;
	}

	public void setSoTienAm(float soTienAm) {
		this.soTienAm = soTienAm;
	}

	public int getSoLanGiaoDich() {
		return soLanGiaoDich;
	}

	public void setSoLanGiaoDich(int soLanGiaoDich) {
		this.soLanGiaoDich = soLanGiaoDich;
	}

	public String getNgayLap() {
		return ngayLap;
	}

	public void setNgayLap(String ngayLap) {
		this.ngayLap = ngayLap;
	}

	public String getSoTaiKhoan() {
		return soTaiKhoan;
	}

	public void setSoTaiKhoan(String soTaiKhoan) {
		this.soTaiKhoan = soTaiKhoan;
	}

}
