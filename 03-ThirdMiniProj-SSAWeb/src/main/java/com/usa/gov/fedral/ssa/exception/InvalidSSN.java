package com.usa.gov.fedral.ssa.exception;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class InvalidSSN {
	
	private Integer statusCode;
	private String errorDesc;
	public void setStatusCode(int i) {
		// TODO Auto-generated method stub
		
	}
	public void setErrorDesc(String string) {
		// TODO Auto-generated method stub
		
	}

}
