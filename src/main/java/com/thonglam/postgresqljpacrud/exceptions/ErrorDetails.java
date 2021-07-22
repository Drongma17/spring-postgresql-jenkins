package com.thonglam.postgresqljpacrud.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorDetails {
	private Date timestamp;
	private String message;
	private String details;


}