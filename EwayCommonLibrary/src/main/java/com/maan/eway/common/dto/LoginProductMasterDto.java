package com.maan.eway.common.dto;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class LoginProductMasterDto {

	private String     loginId ;

    private Integer    productId ;

    private String     companyId ;

    private Integer    amendId ;
    
    private Date       effectiveDateStart ;

    private Date       effectiveDateEnd ;

    private String     productName ;
    
    private String     productDesc;

    private Date       entryDate ;

    private String     status ;

    private String     remarks ;

    private BigDecimal     sumInsuredStart ;

    private BigDecimal     sumInsuredEnd ;

    private String     commissionVatYn ;

    private String     checkerYn ;

    private String     makerYn ;

    private String     custConfirmYn ;

    private Integer    commissionPercent ;

    private String     createdBy ;


    private String     coreAppCode ;

    private String     regulatoryCode ;

    private String     userType ;
    
    private String     subUserType ;
    
    private Integer     oaCode ;
    
    private Integer     agencyCode ;
    
    private Integer     backDays;
    
    private String    financialEndtIds;
    
    private String    nonFinancialEndtIds;

    private String    policyTypeId;

    private String    policyTypeDesc;

    private String    referralId;

    private String    columnName;
        
    private String     creditYn ;

	private String hierarchyLevel;
	
	private Integer hierarchyValue;

	private Boolean canFinalize;
	
	private Boolean canEscalate;
	
	 private String   signature;
}
