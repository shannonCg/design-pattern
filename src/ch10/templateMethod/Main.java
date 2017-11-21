package ch10.templateMethod;
/*
 * 範本模式(Template):把不變的行為統一定義在父類別中，把可變行為延到子類別去個別定義(也就是去覆寫行為）
 */
public class Main {

	public static void main(String[] args) {
		
		System.out.println("學生甲抄的試卷：");
		TestPaper studentA = new TestPaperA();
		studentA.testQuestion1();
		studentA.testQuestion2();
		studentA.testQuestion3();
		
		System.out.println("\n學生乙抄的試卷：");
		TestPaper studentB = new TestPaperB();
		studentB.testQuestion1();
		studentB.testQuestion2();
		studentB.testQuestion3();
	}

}
