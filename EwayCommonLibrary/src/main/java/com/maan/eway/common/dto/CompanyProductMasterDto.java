package com.maan.eway.common.dto;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class CompanyProductMasterDto {

	private String companyId;

	private Integer productId;

	private Integer amendId;

	private Date effectiveDateStart;

	private Date effectiveDateEnd;

	private String productName;

	private Integer productIconId;

	private String productIconName;

	private Date inceptionDate;

	private Date expiryDate;

	private Date entryDate;

	private String remarks;

	private String status;

	private Integer displayOrder;

	private String productDesc;

	private String paymentYn;

	private String paymentRedirUrl;

	private String appLoginUrl;

	private String coreAppCode;

	private String regulatoryCode;

	private BigDecimal sumInsuredStart;

	private BigDecimal sumInsuredEnd;

	private String commissionVatYn;

	private String checkerYn;

	private String makerYn;

	private String custConfirmYn;

	private String createdBy;

	private String motorYn;

	private String currencyIds;

	private String packageYn;

	private String financialEndtIds;

	private String nonFinancialEndtIds;

	private String referralId;

	private String sectionEndtYn;

	private BigDecimal minimumPremium;

	private String productNameLocal;

	private String coInsuranceYn;

	private String claimExperienceYn;

	private BigDecimal commission;

}
