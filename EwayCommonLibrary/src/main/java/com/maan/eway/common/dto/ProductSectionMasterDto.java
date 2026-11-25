package com.maan.eway.common.dto;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class ProductSectionMasterDto {


	private Integer sectionId;

	private Integer productId;

	private String companyId;

	private Integer amendId;

	private String sectionName;

	private Date entryDate;

	private String status;

	private Date effectiveDateStart;

	private Date effectiveDateEnd;

	private String coreAppCode;

	private String remarks;

	private String createdBy;

	private String regulatoryCode;

	private String updatedBy;

	private Date updatedDate;

	private String motorYn;

	private BigDecimal minPremium;

	private String sectionNameLocal;

	private String filePathOrginal;

	private String orginalFileName;

	private String fileName;

	private String dynamicYN;
	
}
