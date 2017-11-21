package ch15.abstractfactory;

import ch15.User;

public interface IUser {
	void insert(User user);
	User getUser(int id);
}
