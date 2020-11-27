package se.iuh.application;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import se.iuh.controller.GeneralCRUD;
import se.iuh.database.HibernateUtil;
import se.iuh.model.KhachHang;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello, world");
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		// get danh sách
		List<KhachHang> list = GeneralCRUD.getAll(KhachHang.class, session);
		list.forEach(x -> {
			System.out.println(x);
		});
		session.close();
		
		// insert vào database
		session = sessionFactory.openSession();
		KhachHang nKH = new KhachHang("KH0001", "1214 rqwrqwf qfqf", "0949849849", "Nguyễn Văn A");
		GeneralCRUD.insert(nKH, session);
		
		list = GeneralCRUD.getAll(KhachHang.class, session);
		list.forEach(x -> {
			System.out.println(x);
		});
		session.close();
		
		// update vào database
		session = sessionFactory.openSession();
		nKH.setSoDT("1415151525");
		GeneralCRUD.update(nKH, session);
		
		list = GeneralCRUD.getAll(KhachHang.class, session);
		list.forEach(x -> {
			System.out.println(x);
		});
		session.close();
		
		// delete khỏi database
		
		session = sessionFactory.openSession();
		GeneralCRUD.delete(nKH, session);
		
		list = GeneralCRUD.getAll(KhachHang.class, session);
		list.forEach(x -> {
			System.out.println(x);
		});
		
		session.close();
	}

}
