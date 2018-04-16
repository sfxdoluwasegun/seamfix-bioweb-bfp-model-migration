/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sf.biocapture.entity.enums;

/**
 *
 * @author Marcel
 * @since 07-Oct-2016, 09:50:03
 */
public enum BfpSyncStatusEnum {

    SUCCESS("Success"), ERROR("Error");

    private BfpSyncStatusEnum(String displayName) {
        this.displayName = displayName;
    }

    private String displayName;

    public String getDisplayName() {
        return displayName;
    }
}
