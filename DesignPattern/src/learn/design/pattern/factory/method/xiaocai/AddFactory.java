package learn.design.pattern.factory.method.xiaocai;

public class AddFactory implements IFactory {

	@Override
	public Operation CreateOperation() {
		
		return new OperationAdd();
	}

}
