package ch10;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("學生甲抄的試卷：");
		TestPaperA studentA = new TestPaperA();
		studentA.testQuestion1();
		studentA.testQuestion2();
		studentA.testQuestion3();
		
		System.out.println("\n學生乙抄的試卷：");
		TestPaperB studentB = new TestPaperB();
		studentB.testQuestion1();
		studentB.testQuestion2();
		studentB.testQuestion3();
	}

}
