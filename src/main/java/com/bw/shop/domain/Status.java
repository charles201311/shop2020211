package com.bw.shop.domain;
//审核状态的枚举类
public enum Status {
	
	UNCHECKED(0,"未审"),CHENKED(1,"已审"),REJECT(2,"驳回");
	private Status(int code ,String name) {
		this.code =code;
		this.name =name;
		
	}
	private Integer code;
	private String name;
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
