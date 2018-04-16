package com.sf.biocapture.entity.audit;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import nw.orm.core.IEntity;

//@Audited
@Entity
@Table(name = "BFP_FAILURE_LOG")
public class BfpFailureLog extends IEntity {

    private static final long serialVersionUID = 176868186839871543L;

    @Column(name = "UNIQUE_ID", nullable = false)
    private String uniqueId;

    @Column(name = "MSISDN")
    private String msisdn;

    @Column(name = "SIM_SERIAL")
    private String simSerial;

    @Column(name = "FILENAME")
    private String filename;

    @Column(name = "REJECTION_REASON")
    private String rejectionReason;

    @Column(name = "MAC_ADDRESS")
    private String macAddress;

    @Column(name = "APP_VERSION")
    private String appVersion;

    @Column(name = "CAPTURE_AGENT")
    private String captureAgent;

    @Column(name = "KIT_TAG")
    private String kitTag;

    @Column(name = "REASON1")
    private String reason1;

    @Column(name = "REASON2")
    private String reason2;

    @Column(name = "REASON3")
    private String reason3;

    @Column(name = "REASON4")
    private String reason4;

    @Column(name = "REASON5")
    private String reason5;

    @Column(name = "REG_TYPE")
    private String regType;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FILE_SYNC_DATE")
    private Date fileSyncDate;

    @Column(name = "SOURCE_PATH")
    private String sourcePath;

    @Column(name = "TARGET_PATH")
    private String targetPath;

    @Column(name = "REF_DEVICE_ID")
    private String refDeviceId;

    @Column(name = "REALTIME_DEVICE_ID")
    private String realtimeDeviceId;

    public BfpFailureLog() {
    }

    public BfpFailureLog(String uniqueId, String msisdn, String simSerial, String filename, String rejectionReason,
            String reason1, String reason2, String reason3, String reason4, String reason5) {
        this.uniqueId = uniqueId;
        this.msisdn = msisdn;
        this.simSerial = simSerial;
        this.filename = filename;
        this.rejectionReason = rejectionReason;
        this.reason1 = reason1;
        this.reason2 = reason2;
        this.reason3 = reason3;
        this.reason4 = reason4;
        this.reason5 = reason5;
    }

    public BfpFailureLog(String uniqueId, String msisdn, String simSerial, String filename, String rejectionReason) {
        this.uniqueId = uniqueId;
        this.msisdn = msisdn;
        this.simSerial = simSerial;
        this.filename = filename;
        this.rejectionReason = rejectionReason;
    }

    public BfpFailureLog(String uniqueId, String filename, String rejectionReason) {
        this.uniqueId = uniqueId;
        this.filename = filename;
        this.rejectionReason = rejectionReason;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
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

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getRejectionReason() {
        return rejectionReason;
    }

    public void setRejectionReason(String rejectionReason) {
        this.rejectionReason = rejectionReason;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getCaptureAgent() {
        return captureAgent;
    }

    public void setCaptureAgent(String captureAgent) {
        this.captureAgent = captureAgent;
    }

    public String getKitTag() {
        return kitTag;
    }

    public void setKitTag(String kitTag) {
        this.kitTag = kitTag;
    }

    public String getReason1() {
        return reason1;
    }

    public void setReason1(String reason1) {
        this.reason1 = reason1;
    }

    public String getReason2() {
        return reason2;
    }

    public void setReason2(String reason2) {
        this.reason2 = reason2;
    }

    public String getReason3() {
        return reason3;
    }

    public void setReason3(String reason3) {
        this.reason3 = reason3;
    }

    public String getReason4() {
        return reason4;
    }

    public void setReason4(String reason4) {
        this.reason4 = reason4;
    }

    public String getReason5() {
        return reason5;
    }

    public void setReason5(String reason5) {
        this.reason5 = reason5;
    }

    public String getRegType() {
        return regType;
    }

    public void setRegType(String regType) {
        this.regType = regType;
    }

    public Date getFileSyncDate() {
        return fileSyncDate;
    }

    public void setFileSyncDate(Date fileSyncDate) {
        this.fileSyncDate = fileSyncDate;
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

    public String getRefDeviceId() {
        return refDeviceId;
    }

    public void setRefDeviceId(String refDeviceId) {
        this.refDeviceId = refDeviceId;
    }

    public String getRealtimeDeviceId() {
        return realtimeDeviceId;
    }

    public void setRealtimeDeviceId(String realtimeDeviceId) {
        this.realtimeDeviceId = realtimeDeviceId;
    }
}
