package se.iuh.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import se.iuh.utility.GlobalConfig;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Dimension;

public class ManHinhChinhGUI extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JMenuItem mntmThemDia;
	private JMenuItem mntmXoaDia;
	private JMenuItem mntmThongKeKhachHangTatCa;
	private JMenuItem mntmThongKeKhachHangQuaHan;
	private JMenuItem mntmThongKeKhachHangNoPhi;
	private JMenuItem mntmThongKeTuaDia;
	private JMenuItem mntmThemTuaDia;
	private JMenuItem mntmXoaTuaDia;
	/**
	 * Create the frame.
	 */
	public ManHinhChinhGUI() {
		setSize(new Dimension(720, 440));
		setPreferredSize(new Dimension(800, 450));
		setTitle("Quản lý thuê băng đĩa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnThueDia = new JMenu("Thuê đĩa");
		menuBar.add(mnThueDia);
		
		JMenuItem mntmLapPhieuThue = new JMenuItem("Lập phiếu thuê");
		mnThueDia.add(mntmLapPhieuThue);
		
		JMenuItem mntmLapPhieuTra = new JMenuItem("Lập phiếu trả");
		mnThueDia.add(mntmLapPhieuTra);
		
		JMenuItem mntmHuyPhiTraMuon = new JMenuItem("Hủy phí trả muộn");
		mnThueDia.add(mntmHuyPhiTraMuon);
		
		JMenu mnDatTruoc = new JMenu("Đặt trước");
		menuBar.add(mnDatTruoc);
		
		JMenuItem mntmThemTTDatTruoc = new JMenuItem("Thêm thông tin đặt trước");
		mnDatTruoc.add(mntmThemTTDatTruoc);
		
		JMenuItem mntmHuyDatTruoc = new JMenuItem("Hủy đặt trước");
		mnDatTruoc.add(mntmHuyDatTruoc);
		
		JMenu mnKhachHang = new JMenu("Khách hàng");
		menuBar.add(mnKhachHang);
		
		JMenuItem mntmThemKhachHang = new JMenuItem("Thêm khách hàng");
		mnKhachHang.add(mntmThemKhachHang);
		
		JMenuItem mntmSuaKhachHang = new JMenuItem("Sửa khách hàng");
		mnKhachHang.add(mntmSuaKhachHang);
		
		JMenuItem mntmXoaKhachHang = new JMenuItem("Xóa khách hàng");
		mnKhachHang.add(mntmXoaKhachHang);
		
		JMenu mnDia = new JMenu("Đĩa");
		menuBar.add(mnDia);
		
		mntmThemDia = new JMenuItem("Thêm đĩa");
		mntmThemDia.addActionListener(this);
		mnDia.add(mntmThemDia);
		
		mntmXoaDia = new JMenuItem("Xem danh sách / xóa đĩa");
		mntmXoaDia.addActionListener(this);
		mnDia.add(mntmXoaDia);
		
		JMenu mnTuaDia = new JMenu("Tựa đĩa");
		menuBar.add(mnTuaDia);
		
		mntmThemTuaDia = new JMenuItem("Thêm tựa đĩa");
		mntmThemTuaDia.addActionListener(this);
		mnTuaDia.add(mntmThemTuaDia);
		
		mntmXoaTuaDia = new JMenuItem("Quản lý / xóa tựa đĩa");
		mntmXoaTuaDia.addActionListener(this);
		mnTuaDia.add(mntmXoaTuaDia);
		
		JMenuItem mntmYeuCauTuaDiaMoi = new JMenuItem("Yêu cầu thêm tựa đĩa mới");
		mnTuaDia.add(mntmYeuCauTuaDiaMoi);
		
		JMenu mnThongKe = new JMenu("Thống kê");
		menuBar.add(mnThongKe);
		
		mntmThongKeKhachHangTatCa = new JMenuItem("Thống kê tất cả khách hàng");
		mntmThongKeKhachHangTatCa.addActionListener(this);
		mnThongKe.add(mntmThongKeKhachHangTatCa);
		
		mntmThongKeKhachHangQuaHan = new JMenuItem("Thống kê khách hàng đang mượn quá hạn");
		mntmThongKeKhachHangQuaHan.addActionListener(this);
		mnThongKe.add(mntmThongKeKhachHangQuaHan);
		
		mntmThongKeKhachHangNoPhi = new JMenuItem("Thống kê khách hàng nợ phí");
		mntmThongKeKhachHangNoPhi.addActionListener(this);
		mnThongKe.add(mntmThongKeKhachHangNoPhi);
		
		mntmThongKeTuaDia = new JMenuItem("Thống kê tựa đĩa");
		mntmThongKeTuaDia.addActionListener(this);
		mnThongKe.add(mntmThongKeTuaDia);
		
		JMenu mnTaiKhoan = new JMenu("Tài khoản");
		menuBar.add(mnTaiKhoan);
		
		JMenuItem mntmDangXuat = new JMenuItem("Đăng xuất");
		mnTaiKhoan.add(mntmDangXuat);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(mntmThemDia)) {
			ThemDiaGUI themDiaGui = new ThemDiaGUI(this);
			themDiaGui.setVisible(true);
		}
		else if(e.getSource().equals(mntmXoaDia)) {
			XoaDiaGUI xoaDiaGui = new XoaDiaGUI(this);
			xoaDiaGui.setVisible(true);
		}
		else if(e.getSource().equals(mntmThongKeKhachHangTatCa)) {
			ThongKeKhachHangGUI frame = new ThongKeKhachHangGUI(this, GlobalConfig.THONGKE_TATCA);
			frame.setVisible(true);
		}
		else if(e.getSource().equals(mntmThongKeKhachHangQuaHan)) {
			ThongKeKhachHangGUI frame = new ThongKeKhachHangGUI(this, GlobalConfig.THONGKE_TREHAN);
			frame.setVisible(true);
		}
		else if(e.getSource().equals(mntmThongKeKhachHangNoPhi)) {
			ThongKeKhachHangGUI frame = new ThongKeKhachHangGUI(this, GlobalConfig.THONGKE_NOPHI);
			frame.setVisible(true);
		}
		else if(e.getSource().equals(mntmThongKeTuaDia)) {
			ThongKeTuaDiaGUI frame = new ThongKeTuaDiaGUI(this);
			frame.setVisible(true);
		}
		else if(e.getSource().equals(mntmThemTuaDia)) {
			ThemTuaJDialog frame = new ThemTuaJDialog(this);
			frame.setVisible(true);
		}
		else if(e.getSource().equals(mntmXoaTuaDia)) {
			QuanLyTua frame = new QuanLyTua(this);
			frame.setVisible(true);
		}
	}

}
