package com.maan.eway.common.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ListItemValueDto {
	@JsonProperty("ItemCode")
	private String itemCode;
	
	@JsonProperty("ItemValue")
	private String itemValue;
}
