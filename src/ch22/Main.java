package ch22;

public class Main {

	public static void main(String[] args) {
		PhoneBrand pb;
		
		//執行手機品牌A的通訊錄
		pb = new PhoneBrandAMessageList();
		pb.run();
		
		//執行手機品牌A的遊戲
		pb = new PhoneBrandAGame();
		pb.run();
		
		//執行手機品牌B的通訊錄
		pb = new PhoneBrandBMessageList();
		pb.run();
		
		//執行手機品牌B的遊戲
		pb = new PhoneBrandBGame();
		pb.run();
	}

}
