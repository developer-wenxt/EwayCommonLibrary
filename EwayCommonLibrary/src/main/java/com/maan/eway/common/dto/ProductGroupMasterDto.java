package com.maan.eway.common.dto;

import java.util.Date;

import lombok.Data;

@Data
public class ProductGroupMasterDto {

	 private Integer    groupId ;

	    private Integer    productId ;

	    private String     branchCode ;

	    private String     companyId ;

	    private Integer    amendId ;

	    private String     groupDesc ;

	    private String     bandDesc ;

	    private Integer    groupFrom ;

	    private Integer    groupTo ;

	    private String     productName ;

	    private Date       effectiveDateStart ;

	    private Date       effectiveDateEnd ;

	    private Date       entryDate ;

	    private String     status ;

	    private String     coreAppCode ;

	    private String     createdBy ;

	    private String     remarks ;

	    private String     updatedBy ;

	    private Date       updatedDate ;
}
