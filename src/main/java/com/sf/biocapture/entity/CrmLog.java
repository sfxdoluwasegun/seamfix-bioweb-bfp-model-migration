package com.sf.biocapture.entity;

import com.sf.biocapture.entity.base.BaseEntity;
import java.sql.Timestamp; 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "CRM_LOG")
public class CrmLog extends BaseEntity {

	private static final long serialVersionUID = 8809181567614620399L;

	@Column(name = "TXN_ID", nullable = false)
	private String transactionId;

	@Column(name = "STATUS", nullable = true)
	private String statusCode;

	@Column(name = "STATUS_MESSAGE", nullable = true)
	private String statusMessage;

	@Column(name = "RESPONSE", length = 2000)
	private String responseXml;

	@Column(name = "INIT_TIMESTAMP")
	private Timestamp initTimestamp;

	@Column(name = "FINAL_TIMESTAMP")
	private Timestamp finalTimestamp;

	@Column(name = "MSISDN", nullable = false, length = 18)
	private String msisdn;

	@Column(name = "DATA_TYPE", nullable = false,length=2000)
	private String dataType;

	@Column(name = "DATA_ID", nullable = false)
	private String dataId;

        @Column(name = "REQUEST_XML",columnDefinition = "CLOB")
	private String requestXml;

        public String getRequestXml() {
            return requestXml;
        }

        public void setRequestXml(String requestXml) {
            this.requestXml = requestXml;
        }
        
        public Timestamp getInitTimestamp() {
            return initTimestamp;
        }

        public void setInitTimestamp(Timestamp initTimestamp) {
            this.initTimestamp = initTimestamp;
        }

        public Timestamp getFinalTimestamp() {
            return finalTimestamp;
        }

        public void setFinalTimestamp(Timestamp finalTimestamp) {
            this.finalTimestamp = finalTimestamp;
        }

	public String getResponseXml() {
		return responseXml;
	}

	public void setResponseXml(String responseXml) {
		this.responseXml = responseXml;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public String getDataId() {
		return dataId;
	}

	public void setDataId(String dataId) {
		this.dataId = dataId;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

}
