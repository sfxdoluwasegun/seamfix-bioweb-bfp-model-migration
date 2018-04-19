package com.sf.biocapture.entity.enums;

public enum CrmStatusType {
       
        //These falls under FINGERPRINTWSQ Biometric Type
        LEFTTHUMB,
        RIGHTTHUMB,
	LEFTINDEXFINGER,
	RIGHTINDEXFINGER,
        LEFTMIDDLEFINGER,
        RIGHTMIDDLEFINGER,
        LEFTRINGFINGER,
        RIGHTRINGFINGER,
        LEFTLITTLEFINGER,
        RIGHTLITTLEFINGER,
        
        //These falls under the CUSTOMERPHOTO Biometric Type
        CUSTOMERIMAGE,
        
        //These falls under IDENTIFICATIONDOC Biometric Type
	PASSPORTIMAGE,
        DRIVERLICENSE,
        NATIONALIDCARD,
        NATIONALDRIVERLICENSE,
                
        //These falls under OTHERDOCS Biometric Type
        SCANNEDREGISTRATIONDOC,
        RIGHTHANDIMAGE,
        LEFTHANDIMAGE,
        RESIDENCEPERMIT,
        TRAVELDOCUMENT,
        CONTACTPERSONFORM,
        BANKGUARANTEELETTER,
        SCANNEDCUSTPASSPORT,
        SIGNATURECARD,
        REQUESTLETTER,
        UTILITYBILL,
        PAYMENTEVIDENCE,
        CERTIFICATEOFINCORPORATION,
        OTHERIDENTIFICATIONDOC,
        SIM_SWAP_FORM,
        
        OTHER
}
