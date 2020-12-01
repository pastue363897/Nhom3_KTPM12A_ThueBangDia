package se.iuh.application;

import java.awt.EventQueue;
import java.util.List;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import se.iuh.controller.KhachHangController;
import se.iuh.controller.TuaDiaController;
import se.iuh.database.HibernateUtil;
import se.iuh.model.KhachHang;
import se.iuh.model.TuaDia;
import se.iuh.view.DangNhapGUI;

public class Main {

	public static void main(String[] args) {
		/*System.out.println("Hello, world");
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		// get danh sách
		List<KhachHang> list = new KhachHangController().getAll(KhachHang.class, session);
		list.forEach(x -> {
			System.out.println(x);
		});
		session.close();
		
		// insert vào database
		session = sessionFactory.openSession();
		KhachHang nKH = new KhachHang("KH0001", "1214 rqwrqwf qfqf", "0949849849", "Nguyễn Văn A");
		new KhachHangController().insert(nKH, session);
		
		list = new KhachHangController().getAll(KhachHang.class, session);
		list.forEach(x -> {
			System.out.println(x);
		});
		session.close();
		
		// update vào database
		session = sessionFactory.openSession();
		nKH.setSoDT("1415151525");
		new KhachHangController().update(nKH, session);
		
		list = new KhachHangController().getAll(KhachHang.class, session);
		list.forEach(x -> {
			System.out.println(x);
		});
		session.close();
		
		// delete khỏi database
		
		session = sessionFactory.openSession();
		new KhachHangController().delete(nKH, session);
		
		list = new KhachHangController().getAll(KhachHang.class, session);
		list.forEach(x -> {
			System.out.println(x);
		});
		
		session.close();*/
		
		/*SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		TuaDia td = new TuaDia("T001", "HE", "HE", 0, 7, 75000.0, 25000.0);
		new TuaDiaController().insert(td, session);
		session.close();*/
		
		
		try {
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e){}
		catch (InstantiationException e) {}
		catch (IllegalAccessException e) {}
		catch (UnsupportedLookAndFeelException e) {}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DangNhapGUI frame = new DangNhapGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

}
