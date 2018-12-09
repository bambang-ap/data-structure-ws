package com.structure.data.model;
// Generated Dec 8, 2018 2:09:31 PM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Tmguru generated by hbm2java
 */
@Entity
@Table(name = "tmguru", catalog = "sdn_pasirkaliki")
public class Tmguru implements java.io.Serializable {

	private TmguruId id;
	private String namaGuru;
	private String alamat;
	private String createdBy;
	private Date createdDt;
	private String modifiedBy;
	private Date modifiedDt;

	public Tmguru() {
	}

	public Tmguru(TmguruId id) {
		this.id = id;
	}

	public Tmguru(TmguruId id, String namaGuru, String alamat, String createdBy, Date createdDt, String modifiedBy,
			Date modifiedDt) {
		this.id = id;
		this.namaGuru = namaGuru;
		this.alamat = alamat;
		this.createdBy = createdBy;
		this.createdDt = createdDt;
		this.modifiedBy = modifiedBy;
		this.modifiedDt = modifiedDt;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "idGuru", column = @Column(name = "ID_GURU", nullable = false, length = 10)),
			@AttributeOverride(name = "nip", column = @Column(name = "NIP", nullable = false, length = 11)) })
	public TmguruId getId() {
		return this.id;
	}

	public void setId(TmguruId id) {
		this.id = id;
	}

	@Column(name = "NAMA_GURU", length = 30)
	public String getNamaGuru() {
		return this.namaGuru;
	}

	public void setNamaGuru(String namaGuru) {
		this.namaGuru = namaGuru;
	}

	@Column(name = "ALAMAT", length = 50)
	public String getAlamat() {
		return this.alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
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
