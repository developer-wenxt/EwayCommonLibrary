package com.maan.eway.common.dto;

import java.util.Date;

import lombok.Data;

@Data
public class LoginMasterDto {

    private String     loginId ;

    private String     userType ;

    private String     subUserType ;

    private String     subUserTypeId ;

    private String     password ;

    private String     companyId ;

    private String     attachedBranches ;

    private String     attachedRegions ;

    private String     attachedCompanies ;

    private String     agencyCode ;

    private String     bankCode ;

    private String     brokerCompanyYn ;

    private Integer     oaCode ;

    private String     lpass1 ;

    private Date       lpassDate ;

    private String     lpass2 ;

    private String     lpass3 ;

    private String     createdBy ;

    private String     menuIds ;

    private String     status ;

    private String     updatedBy ;

    private Date       updatedDate ;

    private String     lpass4 ;

    private String     lpass5 ;

    private Date       effectiveDateStart ;

    private Date       entryDate ;

    private String     pwdCount ;
    
    private String     dmlYN ;

    private String moduleIds;
    
    private String claimType;
}
