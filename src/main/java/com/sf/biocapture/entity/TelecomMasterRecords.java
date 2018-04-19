package com.sf.biocapture.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

import com.sf.biocapture.entity.base.BaseEntity;
import com.sf.biocapture.entity.enums.ProcessingStatusCode;

@Audited
@Entity
@Table(name = "TELECOM_MASTER_RECORDS", indexes = {@Index(name="TMR_PS_IX", columnList = "PROCESSING_STATUS")})
public class TelecomMasterRecords extends BaseEntity {

	private static final long serialVersionUID = -6408804142546301294L;

	@Column(name = "MSISDN")
	private String msisdn;
	
	@Column(name = "PRIMARY_MSISDN")
	private String primaryMsisdn;
	
	@Column(name = "STATUS")
	private String status; //new/update
	
	@Column(name = "PROCESSING_STATUS")
	private String processingStatus;
	
	@Column(name = "PROCESSING_DATE")
	private Timestamp processingDate;
	
	@Column(name = "PIN_REF")
	private String pinRef;

	@Column(name = "INSERT_TIMESTAMP")
	private Timestamp insertTimestamp;
	
	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public String getPrimaryMsisdn() {
		return primaryMsisdn;
	}

	public void setPrimaryMsisdn(String primaryMsisdn) {
		this.primaryMsisdn = primaryMsisdn;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public ProcessingStatusCode getProcessingStatus() {
		return ProcessingStatusCode.fromString(processingStatus);
	}

	public void setProcessingStatus(ProcessingStatusCode processingStatus) {
		this.processingStatus = processingStatus.getCode();
	}

	public Timestamp getProcessingDate() {
		return processingDate;
	}

	public void setProcessingDate(Timestamp processingDate) {
		this.processingDate = processingDate;
	}

	public String getPinRef() {
		return pinRef;
	}

	public void setPinRef(String pinRef) {
		this.pinRef = pinRef;
	}
	
	public Timestamp getInsertTimestamp() {
		return insertTimestamp;
	}

	public void setInsertTimestamp(Timestamp insertTimestamp) {
		this.insertTimestamp = insertTimestamp;
	}
	
}
