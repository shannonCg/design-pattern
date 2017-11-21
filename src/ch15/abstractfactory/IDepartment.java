package ch15.abstractfactory;

import ch15.Department;

public interface IDepartment {
	void insert(Department department);
	Department getDepartment(int id);
}
