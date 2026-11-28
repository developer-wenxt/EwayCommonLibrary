package com.maan.eway.common.dto;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class TravelPassengerDetailsDto {

	private String requestReferenceNo;

	private Integer travelId;

	private Integer passengerId;

	private Integer groupId;

	private Integer groupCount;

	private String genderId;

	private String customerReferenceNo;

	private String companyId;

	private String branchCode;

	private Integer productId;

	private Integer sectionId;

	private String customerId;

	private String quoteNo;

	private String nameTitleDesc;

	private String policyNo;

	private Integer nameTitleId;

	private String passengerName;

	private String passengerFirstName;

	private String passengerLastName;

	private Date dob;

	private String genderDesc;

	private Integer age;

	private Integer relationId;

	private String relationDesc;

	private String nationality;

	private String nationalityDesc;

	private String coverType;

	private String passportNo;

	private String civilId;

	private Double basePremium;

	private Double sportsPremium;

	private Double terrorismPremium;

	private Double totalPremium;

	private String loginId;

	private Date entryDate;

	private String status;

	private String address1;

	private String address2;

	private String pobox;

	private Double promoPremium;

	private Double covidPremium;

	private Integer travelCoverId;

	private String companyName;

	private String productName;

	private String sectionName;

	private String currency;

	private Double exchangeRate;

	private String travelCoverDesc;

	private String sourceCountry;

	private String sourceCountryDesc;

	private String destinationCountry;

	private String destinationCountryDesc;

	private String sportsCoverYn;

	private String terrorismCoverYn;

	private Integer planTypeId;

	private String planTypeDesc;

	private Date travelStartDate;

	private Date travelEndDate;

	private Integer travelCoverDuration;

	private Integer totalPassengers;

	private Date effectiveDate;

	private String createdBy;

	private Date updatedDate;

	private String updatedBy;

	private String remarks;

	private String havepromocode;

	private String promocode;

	private String covidCoverYn;

	private Integer acExecutiveId;

	private String applicationId;

	private String brokerCode;

	private String subUserType;

	private String adminLoginId;

	private String adminRemarks;

	private String rejectReason;

	private String referalRemarks;

	private String bdmCode;

	private String sourceType;

	private String customerCode;

	private String brokerBranchCode;

	private String brokerBranchName;

	private String commissionType;

	private String commissionTypeDesc;

	private Double actualPremiumLc;

	private Double actualPremiumFc;

	private Double overallPremiumLc;

	private Double overallPremiumFc;

	private String vdRefno;

	private String cdRefno;

	private String msRefno;

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

	private Double endtPremium;

	private String tiraCoverNoteNo;

	private BigDecimal commissionPercentage;

	private BigDecimal vatCommission;

	private String customerName;

	private String agencyCode;

	private String branchName;

	private String brokerTiraCode;

	private String sourceTypeId;

	private BigDecimal vatPremium;

	private BigDecimal endtVatPremium;

	private Integer locationId;
}
