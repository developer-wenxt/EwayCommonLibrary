package com.maan.eway.common.dto;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class BuildingDetailsDto {


	private String requestReferenceNo;

	private Integer riskId;

	private String sectionId;

	private String quoteNo;

	private String policyNo;

	private String locationName;

	private String buildingAddress;

	private String sectionDesc;

	private String inbuildConstructType;

	private String inbuildConstructTypeDesc;

	private Integer buildingFloors;

	private String buildingUsageId;

	private String buildingUsageDesc;

	private String buildingUsageYn;

	private String buildingType;

	private String buildingOccupationType;

	private String apartmentOrBorder;

	private Integer withoutInhabitantDays;

	private String buildingCondition;

	private Integer buildingBuildYear;

	private Integer buildingAge;

	private Double buildingAreaSqm;

	private BigDecimal buildingSuminsured;

	private Date entryDate;

	private String createdBy;

	private String status;

	private Date updatedDate;

	private String updatedBy;

	private String customerId;

	private String bankCode;

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

	private BigDecimal buildingSumInsuredLC;
}
