package com.maan.eway.common.dto;

import java.util.Date;

import lombok.Data;

@Data
public class LoginBranchMasterArchDto {

	private String archId;

	private String loginId;

	private Integer agencyCode;

	private Integer oaCode;

	private String branchCode;

	private String companyId;

	private String attachedBranch;

	private String brokerAttachedCompany;

	private Date entryDate;

	private String status;

	private String updatedBy;

	private Date updatedDate;

	private String branchName;

	private String address1;

	private String address2;

	private String email;

	private String mobile;

	private String coreAppCode;

	private String attachedCompany;

	private String brokerBranchCode;

	private String brokerBranchName;
}
