package com.example.demo.entities;

public class Courses {
	private Integer id;
	private String title;
	private String desc;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "Courses [id=" + id + ", title=" + title + ", desc=" + desc + "]";
	}
	

}
