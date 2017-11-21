package ch8.factoryMethod;

import ch8.MultiOperation;
import ch8.Operation;

public class MultiFactory implements OperationFactory {

	@Override
	public Operation createOperation() {
		return new MultiOperation();
	}

}
