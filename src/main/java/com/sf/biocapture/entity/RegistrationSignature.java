/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sf.biocapture.entity;

import com.sf.biocapture.entity.enums.FingersEnum;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import nw.orm.core.IEntity;

/**
 *
 * @author Marcel
 * @since 31-Aug-2016, 19:08:19
 */
@Entity
@Table(name = "REGISTRATION_SIGNATURE")
public class RegistrationSignature extends IEntity {

    private static final long serialVersionUID = 4324319610622971811L;

    @Column(name = "USERNAME", nullable = false)
    private String username;

    @Enumerated(EnumType.STRING)
    @Column(name = "FINGER_TYPE", nullable = false)
    private FingersEnum fingerType;

    @Lob
    @Column(name = "WSQ_DATA", nullable = false)
    private byte[] wsqData;

    @JoinColumn(name = "BASIC_DATA_FK")
    @ManyToOne(optional = false)
    private BasicData basicData;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public FingersEnum getFingerType() {
        return fingerType;
    }

    public void setFingerType(FingersEnum fingerType) {
        this.fingerType = fingerType;
    }

    public byte[] getWsqData() {
        return wsqData;
    }

    public void setWsqData(byte[] wsqData) {
        this.wsqData = wsqData;
    }

    public BasicData getBasicData() {
        return basicData;
    }

    public void setBasicData(BasicData basicData) {
        this.basicData = basicData;
    }

}
