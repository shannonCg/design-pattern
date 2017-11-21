package ch9.phototype;
/*
 * 淺複製(shallow copy)
 */
public class Resume_shallow implements Cloneable{
	private String name;
	private String sex;
	private String age;
	private WorkExperience work;
	
	public Resume_shallow(String name){
		this.name = name;
		work = new WorkExperience();
	}
	
	public void setPersonalInfo(String sex, String age){
		this.sex = sex;
		this.age = age;
	}
	
	public void setWorkExperience(String timeArea, String company){
		work.setWorkDate(timeArea);
		work.setCompany(company);
	}
	
	public void display(){
		System.out.println(name+" "+sex+" "+age);
		System.out.println("工作經歷："+work.getWorkDate()+" "+work.getCompany());
	}
	
	//要實做Cloneable介面才可使用Object的clone()方法，否則會拋出java.lang.CloneNotSupportedException
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
