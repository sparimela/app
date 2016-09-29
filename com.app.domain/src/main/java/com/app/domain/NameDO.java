package com.app.domain;

import info.archinnov.achilles.annotations.Column;
import info.archinnov.achilles.annotations.PartitionKey;
import info.archinnov.achilles.annotations.Table;

@Table(table="name")
public class NameDO {
	
	@PartitionKey
	@Column("last")
	private String last;

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}
	
	
//	@PartitionKey
//	@Column("last")
//	private String last;
//
//	@Column("first")
//	private String first;
//
//	public String getLast() {
//		return last;
//	}
//
//	public void setLast(String last) {
//		this.last = last;
//	}
//
//	public String getFirst() {
//		return first;
//	}
//
//	public void setFirst(String first) {
//		this.first = first;
//	}
	
	

}
