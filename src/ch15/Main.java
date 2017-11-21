package ch15;

public class Main {

	public static void main(String[] args) {
		
		User user = new User();
		user.setId(1);
		user.setName("王大名");
		
		SqlServerUser su = new SqlServerUser();
		
		su.intsert(user);
		
		su.getUser(1);
	}

}
