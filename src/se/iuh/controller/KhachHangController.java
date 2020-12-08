package se.iuh.controller;

import org.hibernate.Session;

import se.iuh.model.KhachHang;

public class KhachHangController extends GeneralCRUD<KhachHang> {
	public KhachHang getKhachHang(String maKhachHang, Session session) {
		return session.get(KhachHang.class, maKhachHang);
	}
}
