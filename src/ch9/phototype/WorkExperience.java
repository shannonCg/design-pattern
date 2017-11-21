package ch9.phototype;

public class WorkExperience implements Cloneable{
	private String workDate;
	private String company;
	
	public String getWorkDate() {
		return workDate;
	}
	public void setWorkDate(String workDate) {
		this.workDate = workDate;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	//要實做Cloneable介面才可使用Object的clone()方法，否則會拋出java.lang.CloneNotSupportedException
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
