package ch10.templateMethod;

public class TestPaperA extends TestPaper {

	@Override
	protected String answer1() {
		return "b";
	}

	@Override
	protected String answer2() {
		return "a";
	}

	@Override
	protected String answer3() {
		return "c";
	}

}
