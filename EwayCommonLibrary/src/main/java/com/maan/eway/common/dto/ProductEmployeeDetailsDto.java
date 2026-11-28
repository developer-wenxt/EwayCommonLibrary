package com.maan.eway.common.dto;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class ProductEmployeeDetailsDto {

	private String quoteNo;

	private String sectionId;

	private Integer locationId;

	private String sectionDesc;

	private Integer riskId;

	private Long employeeId;

	private Integer productId;

	private String companyId;

	private String nationalityId;

	private String requestReferenceNo;

	private String productDesc;

	private String policyNo;

	private String employeeName;

	private String occupationId;

	private String occupationDesc;

	private String createdBy;

	private String status;

	private BigDecimal salary;

	private Date entryDate;

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

	private Double endtPremium;

	private Date dateOfBirth;

	private Integer dateOfJoiningYear;

	private String dateOfJoiningMonth;

	private String address;

	private Date policyStartDate;

	private Date policyEndDate;

	private Double rate;

	private Double premiumFc;

	private Double premiumLc;

	private String currencyCode;

	private Double exchangeRate;

	private String locationName;

	private BigDecimal salaryLc;

	private String highestQualificationHeld;

	private String issuingAuthority;
	
}
