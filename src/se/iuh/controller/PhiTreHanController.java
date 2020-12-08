package se.iuh.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import se.iuh.model.PhiTreHan;

public class PhiTreHanController extends GeneralCRUD<PhiTreHan> {
	
	public PhiTreHan getPhiTreHan(String maPhiTreHan, Session session) {
		return session.get(PhiTreHan.class, maPhiTreHan);
	}
	
	public List<PhiTreHan> getListPhiTreHanChuaTraTheoMaKH(String maKH, Session session) {
		String hql = "From PhiTreHan pt where pt.phieuTra.phieuThue.khachHang.maKH = :maKH AND "
				+ "pt.maPhiTreHan NOT IN (select tt.ttPhi.maPhiTreHan from ThanhToanTreHan tt where tt.ttPhi.phieuTra = pt.phieuTra)";
		Query<PhiTreHan> query = session.createQuery(hql);
		query.setParameter("maKH", maKH);
		List<PhiTreHan> list = query.list();
		return list;
	}
}
