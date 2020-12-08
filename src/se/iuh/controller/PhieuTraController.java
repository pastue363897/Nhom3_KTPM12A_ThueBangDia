package se.iuh.controller;

import org.hibernate.Session;
import se.iuh.model.PhieuTra;

public class PhieuTraController extends GeneralCRUD<PhieuTra> {
	public PhieuTra getPhieuTraTheoMa(String maPhieuTra, Session session) {
		return session.get(PhieuTra.class, maPhieuTra);
	}
}
