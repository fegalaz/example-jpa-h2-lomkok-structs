package com.ejemplo1.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AutoReq {
	
	private String marca;
	private String modelo;
	private String color;
	private String ruedas;
}
