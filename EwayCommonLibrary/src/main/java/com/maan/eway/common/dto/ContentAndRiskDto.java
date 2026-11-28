package com.maan.eway.common.dto;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class ContentAndRiskDto {


	private String requestReferenceNo;

	private Integer riskId;

	private String sectionId;

	private Integer itemId;

	private Integer locationId;

	private String quoteNo;

	private String serialNoDesc;

	private String policyNo;

	private String itemDesc;

	private String sectionDesc;

	private BigDecimal itemValue;

	private BigDecimal serialNo;

	private String makeAndModel;

	private String type;

	private String typeDesc;

	private BigDecimal sumInsured;

	private Date entryDate;

	private String createdBy;

	private String status;

	private String updatedBy;

	private Date updatedDate;

	private String purchaseYear;

	private String purchaseMonth;

	private Integer endorsementType;

	private String endorsementTypeDesc;

	private Date endorsementDate;

	private String endorsementRemarks;

	private Date endorsementEffdate;

	private String originalPolicyNo;

	private String endtPrevPolicyNo;

	private String endtPrevQuoteNo;

	private BigDecimal endtCount;

	private String endtStatus;

	private String isFinaceYn;

	private String endtCategDesc;

	private String contentRiskDesc;

	private String locationName;

	private String name;

	private String brand;

	private String manufactureYear;

	private BigDecimal sumInsuredLc;

	private String companyId;
}
