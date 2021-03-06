package ch15.abstractfactory;

import ch15.Department;

public class MySQLDepartment implements IDepartment {

	@Override
	public void insert(Department department) {
		System.out.println("在MySQL中給Department表增加一條紀錄: "+"id:"+department.getId()+", name:"+department.getName());
	}

	@Override
	public Department getDepartment(int id) {
		System.out.println("在MySQL中根據id得到Department表中的一條紀錄");
		return null;
	}

}
