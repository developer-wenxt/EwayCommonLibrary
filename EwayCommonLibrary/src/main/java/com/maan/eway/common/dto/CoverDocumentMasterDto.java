package com.maan.eway.common.dto;

import java.util.Date;

import lombok.Data;

@Data
public class CoverDocumentMasterDto {

	private Integer documentId;

	private Integer productId;

	private String companyId;

	private Integer sectionId;

	private String coverId;

	private Integer amendId;

	private Date effectiveDateStart;

	private Date effectiveDateEnd;

	private String documentName;

	private String documentDesc;

	private Integer docApplicableId;

	private String docApplicable;

	private String documentType;

	private String documentTypeDesc;

	private String mandatoryStatus;

	private Date entryDate;

	private String status;

	private String remarks;

	private String coreAppCode;

	private String regulatoryCode;

	private String createdBy;

	private String updatedBy;

	private Date updatedDate;

	private String documentTypeDescLocal;

	private String documentNameLocal;

	private String documentDescLocal;

	private String aiValidation;
}
