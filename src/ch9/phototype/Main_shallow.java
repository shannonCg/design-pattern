package ch9.phototype;

/* 原型模式:
 * 淺複製(shallow copy)==>只把原物件所有參數的值複製一份到新的物件中，
 * 代表若有參考變數，被複製物件中的參考變數參考的物件位址就會和原物件參考變數參考的位址相同
 */

public class Main_shallow {

	public static void main(String[] args) throws CloneNotSupportedException {
		Resume_shallow a = new Resume_shallow("大鳥");
		a.setPersonalInfo("男", "29");
		a.setWorkExperience("1998-2000", "XX公司");
		
		Resume_shallow b = (Resume_shallow) a.clone();
		b.setWorkExperience("1998-2006", "YY公司");
		
		Resume_shallow c = (Resume_shallow) a.clone();
		c.setPersonalInfo("男", "24");
		c.setWorkExperience("1998-2003", "ZZ公司");
		
		a.display();
		b.display();
		c.display();
	}

}
