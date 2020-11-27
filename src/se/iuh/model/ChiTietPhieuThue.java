package se.iuh.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ChiTietPhieuThue")
@IdClass(PK_Dia_PhieuThue.class)
public class ChiTietPhieuThue {
	@Id
	@ManyToOne
	@JoinColumn(name = "diaThue", referencedColumnName = "maDia")
	private Dia diaThue;
	@Id
	@ManyToOne
	@JoinColumn(name = "phieuThue", referencedColumnName = "maPhieuThue")
	private PhieuThue phieuThue;
	private double giaThue;
	private double phiTreHan;
	private Date hanTraDia;
	public Dia getDiaThue() {
		return diaThue;
	}
	public void setDiaThue(Dia diaThue) {
		this.diaThue = diaThue;
	}
	public PhieuThue getPhieuThue() {
		return phieuThue;
	}
	public void setPhieuThue(PhieuThue phieuThue) {
		this.phieuThue = phieuThue;
	}
	public double getGiaThue() {
		return giaThue;
	}
	public void setGiaThue(double giaThue) {
		this.giaThue = giaThue;
	}
	public double getPhiTreHan() {
		return phiTreHan;
	}
	public void setPhiTreHan(double phiTreHan) {
		this.phiTreHan = phiTreHan;
	}
	public Date getHanTraDia() {
		return hanTraDia;
	}
	public void setHanTraDia(Date hanTraDia) {
		this.hanTraDia = hanTraDia;
	}
	public ChiTietPhieuThue(Dia diaThue, PhieuThue phieuThue, double giaThue, double phiTreHan, Date hanTraDia) {
		super();
		this.diaThue = diaThue;
		this.phieuThue = phieuThue;
		this.giaThue = giaThue;
		this.phiTreHan = phiTreHan;
		this.hanTraDia = hanTraDia;
	}
	public ChiTietPhieuThue() {
		super();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((diaThue == null) ? 0 : diaThue.hashCode());
		result = prime * result + ((phieuThue == null) ? 0 : phieuThue.hashCode());
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
		ChiTietPhieuThue other = (ChiTietPhieuThue) obj;
		if (diaThue == null) {
			if (other.diaThue != null)
				return false;
		} else if (!diaThue.equals(other.diaThue))
			return false;
		if (phieuThue == null) {
			if (other.phieuThue != null)
				return false;
		} else if (!phieuThue.equals(other.phieuThue))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ChiTietPhieuThue [diaThue=" + diaThue + ", phieuThue=" + phieuThue + ", giaThue=" + giaThue
				+ ", phiTreHan=" + phiTreHan + ", hanTraDia=" + hanTraDia + "]";
	}
}
