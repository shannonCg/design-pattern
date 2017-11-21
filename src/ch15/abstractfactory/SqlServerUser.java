package ch15.abstractfactory;

import ch15.User;

public class SqlServerUser implements IUser {

	@Override
	public void insert(User user) {
		System.out.println("在SQL Server中給User表增加一條紀錄: "+"id:"+user.getId()+", name:"+user.getName());
	}

	@Override
	public User getUser(int id) {
		System.out.println("在SQL Server中根據id得到User表中的一條紀錄");
		return null;
	}

}
