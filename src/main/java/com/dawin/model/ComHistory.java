package com.dawin.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ComHistory {

	@Id
	@GeneratedValue
	private int id;
	private	int yy;
	private int mm;
	private String ny;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getYy() {
		return yy;
	}
	public void setYy(int yy) {
		this.yy = yy;
	}
	public int getMm() {
		return mm;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public String getNy() {
		return ny;
	}
	public void setNy(String ny) {
		this.ny = ny;
	}
	@Override
	public String toString() {
		return "ComHistory [id=" + id + ", yy=" + yy + ", mm=" + mm + ", ny=" + ny + "]";
	}
	
}
