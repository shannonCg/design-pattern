package ch15.abstractfactory;

public interface IFactory {
	IUser createUser();
	IDepartment createDepartment();
}
