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
 * Tmwalisiswa generated by hbm2java
 */
@Entity
@Table(name = "tmwalisiswa", catalog = "sdn_pasirkaliki")
public class Tmwalisiswa implements java.io.Serializable {

	private int nis;
	private String namaAyah;
	private String tahunLahirAyah;
	private String pendidikanAyah;
	private String pekerjaanAyah;
	private Integer penghasilanMinAyah;
	private Integer penghasilanMaxAyah;
	private String namaIbu;
	private String tahunLahitIbu;
	private String pendidikanIbu;
	private String pekerjaanIbu;
	private Integer penghasilanMinIbu;
	private Integer penghasilanMaxIbu;
	private String createdBy;
	private Date createdDt;
	private String modifiedBy;
	private Date modifiedDt;

	public Tmwalisiswa() {
	}

	public Tmwalisiswa(int nis) {
		this.nis = nis;
	}

	public Tmwalisiswa(int nis, String namaAyah, String tahunLahirAyah, String pendidikanAyah, String pekerjaanAyah,
			Integer penghasilanMinAyah, Integer penghasilanMaxAyah, String namaIbu, String tahunLahitIbu,
			String pendidikanIbu, String pekerjaanIbu, Integer penghasilanMinIbu, Integer penghasilanMaxIbu,
			String createdBy, Date createdDt, String modifiedBy, Date modifiedDt) {
		this.nis = nis;
		this.namaAyah = namaAyah;
		this.tahunLahirAyah = tahunLahirAyah;
		this.pendidikanAyah = pendidikanAyah;
		this.pekerjaanAyah = pekerjaanAyah;
		this.penghasilanMinAyah = penghasilanMinAyah;
		this.penghasilanMaxAyah = penghasilanMaxAyah;
		this.namaIbu = namaIbu;
		this.tahunLahitIbu = tahunLahitIbu;
		this.pendidikanIbu = pendidikanIbu;
		this.pekerjaanIbu = pekerjaanIbu;
		this.penghasilanMinIbu = penghasilanMinIbu;
		this.penghasilanMaxIbu = penghasilanMaxIbu;
		this.createdBy = createdBy;
		this.createdDt = createdDt;
		this.modifiedBy = modifiedBy;
		this.modifiedDt = modifiedDt;
	}

	@Id

	@Column(name = "NIS", unique = true, nullable = false)
	public int getNis() {
		return this.nis;
	}

	public void setNis(int nis) {
		this.nis = nis;
	}

	@Column(name = "NAMA_AYAH", length = 30)
	public String getNamaAyah() {
		return this.namaAyah;
	}

	public void setNamaAyah(String namaAyah) {
		this.namaAyah = namaAyah;
	}

	@Column(name = "TAHUN_LAHIR_AYAH", length = 4)
	public String getTahunLahirAyah() {
		return this.tahunLahirAyah;
	}

	public void setTahunLahirAyah(String tahunLahirAyah) {
		this.tahunLahirAyah = tahunLahirAyah;
	}

	@Column(name = "PENDIDIKAN_AYAH", length = 30)
	public String getPendidikanAyah() {
		return this.pendidikanAyah;
	}

	public void setPendidikanAyah(String pendidikanAyah) {
		this.pendidikanAyah = pendidikanAyah;
	}

	@Column(name = "PEKERJAAN_AYAH", length = 20)
	public String getPekerjaanAyah() {
		return this.pekerjaanAyah;
	}

	public void setPekerjaanAyah(String pekerjaanAyah) {
		this.pekerjaanAyah = pekerjaanAyah;
	}

	@Column(name = "PENGHASILAN_MIN_AYAH")
	public Integer getPenghasilanMinAyah() {
		return this.penghasilanMinAyah;
	}

	public void setPenghasilanMinAyah(Integer penghasilanMinAyah) {
		this.penghasilanMinAyah = penghasilanMinAyah;
	}

	@Column(name = "PENGHASILAN_MAX_AYAH")
	public Integer getPenghasilanMaxAyah() {
		return this.penghasilanMaxAyah;
	}

	public void setPenghasilanMaxAyah(Integer penghasilanMaxAyah) {
		this.penghasilanMaxAyah = penghasilanMaxAyah;
	}

	@Column(name = "NAMA_IBU", length = 30)
	public String getNamaIbu() {
		return this.namaIbu;
	}

	public void setNamaIbu(String namaIbu) {
		this.namaIbu = namaIbu;
	}

	@Column(name = "TAHUN_LAHIT_IBU", length = 4)
	public String getTahunLahitIbu() {
		return this.tahunLahitIbu;
	}

	public void setTahunLahitIbu(String tahunLahitIbu) {
		this.tahunLahitIbu = tahunLahitIbu;
	}

	@Column(name = "PENDIDIKAN_IBU", length = 30)
	public String getPendidikanIbu() {
		return this.pendidikanIbu;
	}

	public void setPendidikanIbu(String pendidikanIbu) {
		this.pendidikanIbu = pendidikanIbu;
	}

	@Column(name = "PEKERJAAN_IBU", length = 20)
	public String getPekerjaanIbu() {
		return this.pekerjaanIbu;
	}

	public void setPekerjaanIbu(String pekerjaanIbu) {
		this.pekerjaanIbu = pekerjaanIbu;
	}

	@Column(name = "PENGHASILAN_MIN_IBU")
	public Integer getPenghasilanMinIbu() {
		return this.penghasilanMinIbu;
	}

	public void setPenghasilanMinIbu(Integer penghasilanMinIbu) {
		this.penghasilanMinIbu = penghasilanMinIbu;
	}

	@Column(name = "PENGHASILAN_MAX_IBU")
	public Integer getPenghasilanMaxIbu() {
		return this.penghasilanMaxIbu;
	}

	public void setPenghasilanMaxIbu(Integer penghasilanMaxIbu) {
		this.penghasilanMaxIbu = penghasilanMaxIbu;
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
