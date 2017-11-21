package ch10.templateMethod;

public class TestPaperB extends TestPaper {

	@Override
	protected String answer1() {
		return "d";
	}

	@Override
	protected String answer2() {
		return "b";
	}

	@Override
	protected String answer3() {
		return "a";
	}

}
