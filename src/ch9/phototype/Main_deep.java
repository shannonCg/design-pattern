package ch9.phototype;

/* 原型模式:
 * 深複製(deep copy)==>不只複製結構，也複製資料
 * 代表若有參考變數，被複製物件中的參考變數參考的物件位址就會和原物件參考變數參考的位址不同，但所參考到的物件內容會是相同的
 */

public class Main_deep {

	public static void main(String[] args) throws CloneNotSupportedException {
		Resume_deep a = new Resume_deep("大鳥");
		a.setPersonalInfo("男", "29");
		a.setWorkExperience("1998-2000", "XX公司");
		
		Resume_deep b = (Resume_deep) a.clone();
		b.setWorkExperience("1998-2006", "YY公司");
		
		Resume_deep c = (Resume_deep) a.clone();
		c.setPersonalInfo("男", "24");
		c.setWorkExperience("1998-2003", "ZZ公司");
		
		a.display();
		b.display();
		c.display();
	}

}
