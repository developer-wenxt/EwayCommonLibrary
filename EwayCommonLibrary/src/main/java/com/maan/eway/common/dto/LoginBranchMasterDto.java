package com.maan.eway.common.dto;

import java.util.Date;

import lombok.Data;

@Data
public class LoginBranchMasterDto {

	private String loginId;

	private String branchCode;

	private String companyId;

	private String brokerBranchCode;

	private String attachedBranch;

	private Integer agencyCode;

	private Integer oaCode;

	private String attachedCompany;

	private String branchName;

	private String branchType;

	private String address1;

	private String address2;

	private String email;

	private String mobile;

	private String coreAppCode;

	private Date entryDate;

	private String status;

	private String createdBy;

	private String updatedBy;

	private Date updatedDate;

	private Date effectiveDateStart;

	private String remarks;

	private String brokerBranchName;

	private String userType;

	private String subUserType;

	private String sourceType;

	private String departmentCode;

	private String customerCode;

	private String customerName;

	private String salePointCode;

	private String brokerBranchNameLocal;
}
