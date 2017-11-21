package ch22.bridge;

//手機品牌
public abstract class PhoneBrand {
	protected PhoneSoftware phoneSoftware;
	
	//設定手機軟體
	public void setPhoneSoftware(PhoneSoftware phoneSoftware){
		this.phoneSoftware = phoneSoftware;
	}
	
	//執行
	public abstract void run();
}
