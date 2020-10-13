package com.ejemplo1.dto.respond;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AutoDTO {

	private Integer id;
	private String marca;
	private String modelo;
	private String color;
	private String ruedas;
}
