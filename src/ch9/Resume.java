package ch9;

public class Resume {
	private String name;
	private String sex;
	private String age;
	private String timeArea;
	private String company;
	
	public Resume(String name){
		this.name = name;
	}
	
	public void setPersonalInfo(String sex, String age){
		this.sex = sex;
		this.age = age;
	}
	
	public void setWorkExperience(String timeArea, String company){
		this.timeArea = timeArea;
		this.company = company;
	}
	
	public void display(){
		System.out.println(name+" "+sex+" "+age);
		System.out.println("工作經歷："+timeArea+" "+company);
	}
}
