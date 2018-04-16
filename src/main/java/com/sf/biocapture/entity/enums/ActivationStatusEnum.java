/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sf.biocapture.entity.enums;

/**
 *
 * @author Marcel
 * @since May 30, 2017
 */
public enum ActivationStatusEnum {

    PENDING("Pending"), ACTIVATED("Activated"),
    FAILED_ACTIVATION("Failed Activation"), FAILED_VALIDATION("Failed Validation");

    private ActivationStatusEnum(String displayName) {
        this.displayName = displayName;
    }

    private String displayName;

    public String getDisplayName() {
        return displayName;
    }
}
