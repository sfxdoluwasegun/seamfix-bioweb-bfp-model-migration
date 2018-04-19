package com.sf.biocapture.entity;

import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sf.biocapture.entity.base.BaseEntity;
import com.sf.biocapture.entity.enums.CrmStatusType;

@Entity
@Table(name = "MSISDN_STATUS_LOG")
public class MsisdnStatusLog extends BaseEntity{

	/**
	 *
	 */
	private static final long serialVersionUID = 1633517452345467063L;

	@Enumerated(EnumType.STRING)
	@Column(name = "STATUS_TYPE", nullable = false)
	private CrmStatusType statusType;

	@Column(name = "INIT_TIMESTAMP", nullable = false)
	private Timestamp initTimestamp;

	@Column(name = "FINAL_TIMESTAMP", nullable = true)
	private Timestamp finalTimstamp;

	@Column(name = "REMARKS", nullable = true, length = 1024)
	private String remarks;

	@ManyToOne(optional = false)
	@JoinColumn(name = "MSISDN_STATUS_FK")
	private MsisdnStatus status;

	public MsisdnStatus getStatus() {
		return status;
	}

	public void setStatus(MsisdnStatus status) {
		this.status = status;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Timestamp getFinalTimstamp() {
		return finalTimstamp;
	}

	public void setFinalTimstamp(Timestamp finalTimstamp) {
		this.finalTimstamp = finalTimstamp;
	}

	public Timestamp getInitTimestamp() {
		return initTimestamp;
	}

	public void setInitTimestamp(Timestamp initTimestamp) {
		this.initTimestamp = initTimestamp;
	}

	public CrmStatusType getStatusType() {
		return statusType;
	}

	public void setStatusType(CrmStatusType statusType) {
		this.statusType = statusType;
	}

}
