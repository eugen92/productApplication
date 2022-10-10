package com.springJpa.entity;

public class SysParam {
	private String key;
	  private String value;
	  private Boolean entityDeleted;
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Boolean getEntityDeleted() {
		return entityDeleted;
	}
	public void setEntityDeleted(Boolean entityDeleted) {
		this.entityDeleted = entityDeleted;
	}
}
