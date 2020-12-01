package se.iuh.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.Box;
import javax.swing.JTextField;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class DangNhapGUI extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtMaNV;
	private JTextField txtMatKhau;
	
	private JButton btnDangNhap;
	private JButton btnDangKy;

	/**
	 * Create the frame.
	 */
	public DangNhapGUI() {
		setTitle("Đăng nhập");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblTitle = new JLabel("ĐĂNG NHẬP HỆ THỐNG");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblTitle, BorderLayout.NORTH);
		
		JPanel panelCenter = new JPanel();
		contentPane.add(panelCenter, BorderLayout.CENTER);
		panelCenter.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panelInput = new JPanel();
		panelInput.setPreferredSize(new Dimension(340, 90));
		panelCenter.add(panelInput);
		panelInput.setLayout(new BoxLayout(panelInput, BoxLayout.Y_AXIS));
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1.setPreferredSize(new Dimension(20, 20));
		panelInput.add(horizontalStrut_1);
		
		Box boxUsername = Box.createHorizontalBox();
		panelInput.add(boxUsername);
		
		JLabel lblMaNV = new JLabel("Mã nhân viên");
		boxUsername.add(lblMaNV);
		
		Component verticalStrutMaNV = Box.createVerticalStrut(20);
		verticalStrutMaNV.setPreferredSize(new Dimension(10, 20));
		boxUsername.add(verticalStrutMaNV);
		
		txtMaNV = new JTextField();
		boxUsername.add(txtMaNV);
		txtMaNV.setColumns(10);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setPreferredSize(new Dimension(20, 20));
		panelInput.add(horizontalStrut);
		
		Box horizontalBox = Box.createHorizontalBox();
		panelInput.add(horizontalBox);
		
		JLabel lblMatKhau = new JLabel("Mật khẩu ");
		horizontalBox.add(lblMatKhau);
		
		Component verticalStrutMatKhau = Box.createVerticalStrut(20);
		verticalStrutMatKhau.setPreferredSize(new Dimension(10, 20));
		horizontalBox.add(verticalStrutMatKhau);
		
		txtMatKhau = new JTextField();
		horizontalBox.add(txtMatKhau);
		txtMatKhau.setColumns(10);
		
		JPanel panelButton = new JPanel();
		panelButton.setPreferredSize(new Dimension(340, 90));
		contentPane.add(panelButton, BorderLayout.SOUTH);
		panelButton.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnDangNhap = new JButton("Đăng nhập");
		panelButton.add(btnDangNhap);
		btnDangNhap.addActionListener(this);
		
		btnDangKy = new JButton("Tạo tài khoản");
		panelButton.add(btnDangKy);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btnDangNhap)) {
			dispose();
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						ManHinhChinhGUI frame = new ManHinhChinhGUI();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
		else if(e.getSource().equals(btnDangKy)) {
			
		}
	}

}
