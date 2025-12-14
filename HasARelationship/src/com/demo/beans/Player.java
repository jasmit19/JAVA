package com.demo.beans;

public class Player {
	private int id;
	private String pname;
	private String sp;
	public Player() {
		super();
	}
	public Player(int id, String pname, String sp) {
		super();
		this.id = id;
		this.pname = pname;
		this.sp = sp;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getSp() {
		return sp;
	}
	public void setSp(String sp) {
		this.sp = sp;
	}
	@Override
	public String toString() {
		return "Player [id=" + id + ", pname=" + pname + ", sp=" + sp + "]";
	}
	
}
