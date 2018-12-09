package com.structure.data.model;
// Generated Dec 8, 2018 2:09:31 PM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Tmkelas generated by hbm2java
 */
@Entity
@Table(name = "tmkelas", catalog = "sdn_pasirkaliki")
public class Tmkelas implements java.io.Serializable {

	private String idKelas;
	private String idWalikelas;
	private Integer jumlahKursi;
	private Integer jumlahMeja;
	private String createdBy;
	private Date createdDt;
	private String modifiedBy;
	private Date modifiedDt;

	public Tmkelas() {
	}

	public Tmkelas(String idKelas) {
		this.idKelas = idKelas;
	}

	public Tmkelas(String idKelas, String idWalikelas, Integer jumlahKursi, Integer jumlahMeja, String createdBy,
			Date createdDt, String modifiedBy, Date modifiedDt) {
		this.idKelas = idKelas;
		this.idWalikelas = idWalikelas;
		this.jumlahKursi = jumlahKursi;
		this.jumlahMeja = jumlahMeja;
		this.createdBy = createdBy;
		this.createdDt = createdDt;
		this.modifiedBy = modifiedBy;
		this.modifiedDt = modifiedDt;
	}

	@Id

	@Column(name = "ID_KELAS", unique = true, nullable = false, length = 5)
	public String getIdKelas() {
		return this.idKelas;
	}

	public void setIdKelas(String idKelas) {
		this.idKelas = idKelas;
	}

	@Column(name = "ID_WALIKELAS", length = 10)
	public String getIdWalikelas() {
		return this.idWalikelas;
	}

	public void setIdWalikelas(String idWalikelas) {
		this.idWalikelas = idWalikelas;
	}

	@Column(name = "JUMLAH_KURSI")
	public Integer getJumlahKursi() {
		return this.jumlahKursi;
	}

	public void setJumlahKursi(Integer jumlahKursi) {
		this.jumlahKursi = jumlahKursi;
	}

	@Column(name = "JUMLAH_MEJA")
	public Integer getJumlahMeja() {
		return this.jumlahMeja;
	}

	public void setJumlahMeja(Integer jumlahMeja) {
		this.jumlahMeja = jumlahMeja;
	}

	@Column(name = "CREATED_BY", length = 30)
	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATED_DT", length = 19)
	public Date getCreatedDt() {
		return this.createdDt;
	}

	public void setCreatedDt(Date createdDt) {
		this.createdDt = createdDt;
	}

	@Column(name = "MODIFIED_BY", length = 30)
	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "MODIFIED_DT", length = 19)
	public Date getModifiedDt() {
		return this.modifiedDt;
	}

	public void setModifiedDt(Date modifiedDt) {
		this.modifiedDt = modifiedDt;
	}

}
