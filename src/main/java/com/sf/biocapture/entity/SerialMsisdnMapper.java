package com.sf.biocapture.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

import com.sf.biocapture.entity.base.BaseEntity;

@Audited
@Entity
@Table(name = "SERIAL_MSISDN_MAPPER")
public class SerialMsisdnMapper extends BaseEntity {

	private static final long serialVersionUID = -4877764068066933538L;

	@Column(name = "MSISDN")
	private String msisdn;

	@Column(name = "SIM_SERIAL")
	private String simSerial;
	
	@Column(name = "STATUS")
	private String status;

	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public String getSimSerial() {
		return simSerial;
	}

	public void setSimSerial(String simSerial) {
		this.simSerial = simSerial;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
