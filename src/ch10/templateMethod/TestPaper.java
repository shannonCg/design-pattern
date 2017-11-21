package ch10.templateMethod;

public abstract class TestPaper {
	public void testQuestion1(){
		System.out.println("楊過得到，後來給郭靖，煉程倚天劍、屠龍刀的玄鐵可能是[] a.球磨鑄鐵 b.馬蹄鐵 c.高速合金鋼 d.碳素纖維");
		System.out.println("答案："+answer1());
	}
	
	public void testQuestion2(){
		System.out.println("楊過、程英、陸無雙剷除了情花，造成[] a.使這種植物不再害人 b.使一種珍稀物種滅絕 c.破壞了那個生物圈的生態平衡 d.造成該地區沙漠化");
		System.out.println("答案："+answer2());
	}
	
	public void testQuestion3(){
		System.out.println("藍鳳凰致使華山師徒、桃谷六仙嘔吐不止，如果你是大夫，會給他們開什麼藥[] a.阿斯匹林 b.牛黃解毒片 c.氟呱酸 d.以上皆非");
		System.out.println("答案："+answer3());
	}
	
	protected abstract String answer1();
	
	protected abstract String answer2();
	
	protected abstract String answer3();
}
