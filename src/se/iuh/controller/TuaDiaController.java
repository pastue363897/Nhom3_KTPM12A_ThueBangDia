package se.iuh.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import se.iuh.model.TuaDia;

public class TuaDiaController extends GeneralCRUD<TuaDia> {
	// maTua là primary key, truyền đúng loại đối tượng so với class là được
	public TuaDia getTuaDia(String maTua, Session session) {
		return session.get(TuaDia.class, maTua);
	}
	
	public List<TuaDia> timKiemTheoTuKhoa(String keyword, Session session) {
		String hql = "From TuaDia T where maTua LIKE :keyword OR tenTua LIKE :keyword OR moTa LIKE :keyword OR loaiTua LIKE :keyword";
		Query<TuaDia> query = session.createQuery(hql);
		query.setParameter("keyword", "%"+keyword+"%");
		List<TuaDia> list = query.list();
		return list;
	}
}
