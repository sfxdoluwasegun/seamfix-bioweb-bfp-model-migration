package com.sf.biocapture.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "KYC_AGILITY_MAPPER")
public class KycAgilityMapper implements Serializable {

    private static final long serialVersionUID = -2860770747999470393L;

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @Column(name = "ID", nullable = false, insertable = true, updatable = true)
    private String id;

    @OneToOne(optional = false)
	@JoinColumn(name="BASIC_DATA_FK", nullable = false)
	private BasicData basicData;

	@Column(name = "AGILITY_STATUS", nullable = true)
	private boolean agilityStatus = false;

	@Column(name = "OWC_STATUS", nullable = true)
	private boolean owcStatus = false;

	@Column(name = "AGILITY_TIMESTAMP")
	private Timestamp agilityTimestamp;

	@Column(name = "OWC_TIMESTAMP")
	private Timestamp owcTimestamp;

	@Column(name = "INIT_TIMESTAMP")
	private Timestamp initTimestamp = new Timestamp(new Date().getTime());
        
	@Column(name = "CONFIRMATION_STATUS", nullable = true)
	private Boolean confirmationStatus = false;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BasicData getBasicData() {
		return basicData;
	}

	public void setBasicData(BasicData basicData) {
		this.basicData = basicData;
	}

	public boolean isAgilityStatus() {
		return agilityStatus;
	}

	public void setAgilityStatus(boolean agilityStatus) {
		this.agilityStatus = agilityStatus;
	}

	public boolean isOwcStatus() {
		return owcStatus;
	}

	public void setOwcStatus(boolean owcStatus) {
		this.owcStatus = owcStatus;
	}

	public Timestamp getAgilityTimestamp() {
		return agilityTimestamp;
	}

	public void setAgilityTimestamp(Timestamp agilityTimestamp) {
		this.agilityTimestamp = agilityTimestamp;
	}

	public Timestamp getOwcTimestamp() {
		return owcTimestamp;
	}

	public void setOwcTimestamp(Timestamp owcTimestamp) {
		this.owcTimestamp = owcTimestamp;
	}

	public Timestamp getInitTimestamp() {
		return initTimestamp;
	}

	public void setInitTimestamp(Timestamp initTimestamp) {
		this.initTimestamp = initTimestamp;
	}

    public void setConfirmationStatus(Boolean confirmationStatus) {
        this.confirmationStatus = confirmationStatus;
    }

    public Boolean getConfirmationStatus() {
        return confirmationStatus;
    }


}
