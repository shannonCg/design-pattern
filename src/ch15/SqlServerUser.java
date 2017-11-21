package ch15;

public class SqlServerUser {
	
	public void intsert(User user){
		System.out.println("在SQL Server中給User表增加一條紀錄: "+"id:"+user.getId()+", name:"+user.getName());
	}
	
	public User getUser(int id){
		System.out.println("在SQL Server中根據id得到User表中的一條紀錄");
		return null;
	}
}
