package com.maan.eway.common.dto;

import java.util.Date;

import lombok.Data;

@Data
public class EndtTypeMasterDto {


	private Integer endtTypeId;

	private Integer endtTypeCategoryId;

	private Integer productId;

	private String companyId;

	private String endtType;

	private String endtTypeDesc;

	private String endtTypeCategory;

	private String status;

	private Integer priority;

	private String endtDependantIds;

	private String endtDependantFields;

	private String coreAppCode;

	private String regulatoryCode;

	private String endtFeeYn;

	private String endtFeePercent;

	private String remarks;

	private Date entryDate;

	private Date effectiveDateStart;

	private Date effectiveDateEnd;

	private String createdBy;

	private String updatedBy;

	private Date updatedDate;

	private Integer amendId;

	private String calcTypeId;

	private String sectionModificationYn;

	private String sectionModificationType;

	private String isCoverendt;

	private String endtShortCode;

	private String endtShortDesc;

	private String endtTypeLocal;

	private String endtTypeDescLocal;
}
