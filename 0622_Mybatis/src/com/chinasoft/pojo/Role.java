package com.chinasoft.pojo;

public class Role {

	private String r_id;
	private String r_name;
	private String r_score;
	public String getR_id() {
		return r_id;
	}
	
	public Role(String r_id, String r_name, String r_score) {
		super();
		this.r_id = r_id;
		this.r_name = r_name;
		this.r_score = r_score;
	}

	public void setR_id(String r_id) {
		this.r_id = r_id;
	}
	public String getR_name() {
		return r_name;
	}
	public void setR_name(String r_name) {
		this.r_name = r_name;
	}
	public String getR_score() {
		return r_score;
	}
	public void setR_score(String r_score) {
		this.r_score = r_score;
	}
	
	
}
