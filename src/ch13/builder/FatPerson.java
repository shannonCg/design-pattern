package ch13.builder;

public class FatPerson implements PersonBuilder{
	
	@Override
	public void buildHead() {
		System.out.println("build head");
	}

	@Override
	public void buildBody() {
		System.out.println("build fat body");
	}

	@Override
	public void buildLeftHand() {
		System.out.println("build left hand");
	}

	@Override
	public void buildRightHand() {
		System.out.println("build right hand");
	}

	@Override
	public void buildLeftLeg() {
		System.out.println("build left leg");
	}

	@Override
	public void buildRightLeg() {
		System.out.println("build right leg");
	}
}
