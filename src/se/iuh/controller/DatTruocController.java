package se.iuh.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import se.iuh.model.DatTruoc;

public class DatTruocController extends GeneralCRUD<DatTruoc> {

	
	public List<DatTruoc> getDatTruocTheoMaTua(String maTua, Session session) {
		String hql = "From DatTruoc d where d.diaDatTruoc.tuaDia.maTua = :maTua";
		Query<DatTruoc> query = session.createQuery(hql);
		query.setParameter("maTua", maTua);
		List<DatTruoc> list = query.list();
		return list;
	}
}
