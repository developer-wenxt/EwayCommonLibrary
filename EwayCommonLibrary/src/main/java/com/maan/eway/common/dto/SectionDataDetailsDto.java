package com.maan.eway.common.dto;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class SectionDataDetailsDto {


	private String requestReferenceNo;

	private Integer riskId;

	private String quoteNo;

	private String productId;

	private String sectionId;

	private Integer locationId;

	private Integer coverId;

	private String customerReferenceNo;

	private String productDesc;

	private String policyNo;

	private String sectionDesc;

	private String companyId;

	private String companyName;

	private Date entryDate;

	private String createdBy;

	private String status;

	private Date updatedDate;

	private String updatedBy;

	private String customerId;

	private String currencyId;

	private BigDecimal exchageRate;

	private String productType;

	private String productTypeDesc;

	private String sectionEndtModification;

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

	private String coverNoteReferenceNo;

	private String stickerNumber;

	private String responseStatusCode;

	private String responseStatusDesc;

	private String prevCovernoteRefno;

	private BigDecimal commsissionPercentage;

	private BigDecimal commissionAmount;

	private String locationName;

	private BigDecimal overallPremiumFc;

	private BigDecimal overallPremiumLc;

	private BigDecimal actualPremiumFc;

	private BigDecimal actualPremiumLc;

	private Double endtPremium;

	private BigDecimal endtVatPremium;

	private String tiraCoverNoteNo;

	private String migratedPolicyYn;
}
