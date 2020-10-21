package com.ejemplo1.exception;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ErrorMessage {

	private int statusCode;
	private Date timestamp;
	private String message;
	private String description;
}
