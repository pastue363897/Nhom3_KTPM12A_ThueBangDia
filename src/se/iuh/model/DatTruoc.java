package se.iuh.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DatTruoc")
public class DatTruoc {
	@Id
	private String maDatTruoc;
	@ManyToOne
	@JoinColumn(name = "diaDatTruoc")
	private Dia diaDatTruoc;
	private Date thoiGianLap;
	@ManyToOne
	@JoinColumn(name = "khachHang")
	private KhachHang khachHang;
	public String getMaDatTruoc() {
		return maDatTruoc;
	}
	public void setMaDatTruoc(String maDatTruoc) {
		this.maDatTruoc = maDatTruoc;
	}
	public Dia getDiaDatTruoc() {
		return diaDatTruoc;
	}
	public void setDiaDatTruoc(Dia diaDatTruoc) {
		this.diaDatTruoc = diaDatTruoc;
	}
	public Date getThoiGianLap() {
		return thoiGianLap;
	}
	public void setThoiGianLap(Date thoiGianLap) {
		this.thoiGianLap = thoiGianLap;
	}
	public KhachHang getKhachHang() {
		return khachHang;
	}
	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}
	public DatTruoc(String maDatTruoc, Dia diaDatTruoc, Date thoiGianLap, KhachHang khachHang) {
		super();
		this.maDatTruoc = maDatTruoc;
		this.diaDatTruoc = diaDatTruoc;
		this.thoiGianLap = thoiGianLap;
		this.khachHang = khachHang;
	}
	public DatTruoc() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "DatTruoc [maDatTruoc=" + maDatTruoc + ", diaDatTruoc=" + diaDatTruoc + ", thoiGianLap=" + thoiGianLap
				+ ", khachHang=" + khachHang + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maDatTruoc == null) ? 0 : maDatTruoc.hashCode());
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
		DatTruoc other = (DatTruoc) obj;
		if (maDatTruoc == null) {
			if (other.maDatTruoc != null)
				return false;
		} else if (!maDatTruoc.equals(other.maDatTruoc))
			return false;
		return true;
	}
}
