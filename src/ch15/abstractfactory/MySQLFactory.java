package ch15.abstractfactory;

public class MySQLFactory implements IFactory {

	@Override
	public IUser createUser() {
		return new MySQLUser();
	}

	@Override
	public IDepartment createDepartment() {
		return new MySQLDepartment();
	}

}
