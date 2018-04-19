
package com.sf.biocapture.entity;

/**
 *
 * @author wizzyclems
 */

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sf.biocapture.entity.base.BaseEntity;
import com.sf.biocapture.entity.enums.CrmStatus;
import com.sf.biocapture.entity.enums.SfxCrmTypes;

@Entity
@Table(name = "CRM_PUSH_STATUS")
public class CrmPushStatus extends BaseEntity{
     
	private static final long serialVersionUID = 2690286805744674591L;

	@Enumerated(EnumType.STRING)
    @Column(name = "CRM_TYPE")
    private SfxCrmTypes crmType;

    @Enumerated(EnumType.STRING)
    @Column(name = "PUSH_STATUS")
    private CrmStatus pushStatus;

    @Column(name = "CRM_CREATE_TIMESTAMP")
    private Timestamp crmCreateTimestamp;

    @Column(name = "CRM_PUSH_TIMESTAMP_")
    private Timestamp crmPushTimestamp;

    @Column(name = "UNIQUE_ID")
    private String uniqueId;

    @Column(name = "SKIP")
    private Boolean skip;
    
    @Column(name = "SKIP_REASON",length = 1024)
    private String skipReason;

    
    @ManyToOne(optional = false)
    @JoinColumn(name = "MSISDN_DETAIL_FK", nullable = false)
    private MsisdnDetail msisdnDetail;

    public SfxCrmTypes getCrmType() {
        return crmType;
    }

    public void setCrmType(SfxCrmTypes crmType) {
        this.crmType = crmType;
    }

    public CrmStatus getPushStatus() {
        return pushStatus;
    }

    public void setPushStatus(CrmStatus pushStatus) {
        this.pushStatus = pushStatus;
    }

    public Timestamp getCrmCreateTimestamp() {
        return crmCreateTimestamp;
    }

    public void setCrmCreateTimestamp(Timestamp crmCreateTimestamp) {
        this.crmCreateTimestamp = crmCreateTimestamp;
    }

    public Timestamp getCrmPushTimestamp() {
        return crmPushTimestamp;
    }

    public void setCrmPushTimestamp(Timestamp crmPushTimestamp) {
        this.crmPushTimestamp = crmPushTimestamp;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public MsisdnDetail getMsisdnDetail() {
        return msisdnDetail;
    }

    public void setMsisdnDetail(MsisdnDetail msisdnDetail) {
        this.msisdnDetail = msisdnDetail;
    }

    public Boolean getSkip() {
        return skip;
    }

    public void setSkip(Boolean skip) {
        this.skip = skip;
    }

    public String getSkipReason() {
        return skipReason;
    }

    public void setSkipReason(String skipReason) {
        this.skipReason = skipReason;
    }

    
}