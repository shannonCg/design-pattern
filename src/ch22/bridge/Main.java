package ch22.bridge;
/*
 * 橋接模式：當系統可能有多角度分類，而每種分類都可能有變化時，
 * 		   可採用合成(composition)關係而非繼承關係去設計，讓他們分離出來並能獨自變化，減少它們之間的耦合
 */
public class Main {

	public static void main(String[] args) {
		PhoneBrand pb;
		
		//執行手機品牌A的通訊錄
		pb = new PhoneBrandA();
		pb.setPhoneSoftware(new PhoneMessageList());
		pb.run();
		
		//執行手機品牌A的遊戲
		pb.setPhoneSoftware(new PhoneGame());
		pb.run();
		
		//執行手機品牌B的通訊錄
		pb = new PhoneBrandB();
		pb.setPhoneSoftware(new PhoneMessageList());
		pb.run();
		
		//執行手機品牌B的遊戲
		pb.setPhoneSoftware(new PhoneGame());
		pb.run();
	}

}
