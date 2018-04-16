/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sf.biocapture.entity.audit;

import com.sf.biocapture.entity.EnrollmentRef;
import com.sf.biocapture.entity.base.BaseEntityPK;
import com.sf.biocapture.entity.enums.ActivationStatusEnum;
import com.sf.biocapture.entity.enums.BfpSyncStatusEnum;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Marcel
 * @since 07-Oct-2016, 09:41:47
 */
@Entity
@Table(name = "BFP_SYNC_LOG")
public class BfpSyncLog extends BaseEntityPK{

    private static final long serialVersionUID = -4324319610622971809L;

    @Column(name = "UNIQUE_ID", nullable = false)
    private String uniqueId;
    @Column(name = "FILE_NAME")
    private String fileName;
    @Column(name = "SOURCE_PATH")
    private String sourcePath;
    @Column(name = "TARGET_PATH")
    private String targetPath;
    @Enumerated(EnumType.STRING)
    private BfpSyncStatusEnum bfpSyncStatusEnum;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FILE_SYNC_DATE")
    private Date fileSyncDate;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "ACTIVATION_DATE")
    private Date activationDate;
    @Enumerated(EnumType.STRING)
    private ActivationStatusEnum activationStatusEnum;

    @Column(name = "MSISDN")
    private String msisdn;

    @Column(name = "SIM_SERIAL")
    private String simSerial;

    @JoinColumn(name = "ENROLLMENT_REF_FK")
    @ManyToOne(fetch = FetchType.LAZY)
    private EnrollmentRef enrollmentRef;

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getSourcePath() {
        return sourcePath;
    }

    public void setSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
    }

    public String getTargetPath() {
        return targetPath;
    }

    public void setTargetPath(String targetPath) {
        this.targetPath = targetPath;
    }

    public BfpSyncStatusEnum getBfpSyncStatusEnum() {
        return bfpSyncStatusEnum;
    }

    public void setBfpSyncStatusEnum(BfpSyncStatusEnum bfpSyncStatusEnum) {
        this.bfpSyncStatusEnum = bfpSyncStatusEnum;
    }

    public Date getFileSyncDate() {
        return fileSyncDate;
    }

    public void setFileSyncDate(Date fileSyncDate) {
        this.fileSyncDate = fileSyncDate;
    }

    public Date getActivationDate() {
        return activationDate;
    }

    public void setActivationDate(Date activationDate) {
        this.activationDate = activationDate;
    }

    public ActivationStatusEnum getActivationStatusEnum() {
        return activationStatusEnum;
    }

    public void setActivationStatusEnum(ActivationStatusEnum activationStatusEnum) {
        this.activationStatusEnum = activationStatusEnum;
    }

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

    public EnrollmentRef getEnrollmentRef() {
        return enrollmentRef;
    }

    public void setEnrollmentRef(EnrollmentRef enrollmentRef) {
        this.enrollmentRef = enrollmentRef;
    }
}
