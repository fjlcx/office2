package cn.fjlcx.office.bean;

import java.util.List;

public class Result<T> {
	private String code;
	private String description;
	private List<T> data;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<T> getData() {
		return data;
	}
	public void setData(List<T> data) {
		this.data = data;
	}
	public Result(String code, String description, List<T> data) {
		super();
		this.code = code;
		this.description = description;
		this.data = data;
	}
	public Result() {
		super();
	}
	@Override
	public String toString() {
		return "Result [code=" + code + ", description=" + description + ", data=" + data + "]";
	}
	
}
