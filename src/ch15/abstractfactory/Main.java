package ch15.abstractfactory;

import ch15.Department;
import ch15.User;

/*
 * 抽象工廠模式(abstract factory):提供一個建立一系列相關或互相依賴物件的介面
 */
public class Main {

	public static void main(String[] args) {
		
		User user = new User();
		user.setId(1);
		user.setName("王大名");
		
		IFactory factory = new SqlServerFactory();
		IFactory factory2 = new MySQLFactory();
		
		IUser iu = factory.createUser();
		
		iu.insert(user);
		iu.getUser(1);
		
		
		Department department = new Department();
		department.setId(2);
		department.setName("會計部");
				
		IDepartment id = factory2.createDepartment();
		
		id.insert(department);
		id.getDepartment(2);
	}

}
