package learn.design.pattern.decorator.daniao;

public class ConcreteDecoratoeB extends Decorator {

	public void Operation() {
		super.Operation();
		AddedBehvior();
		System.out.println("具体装饰对象B的操作");
	}

	private void AddedBehvior() {
		System.out.println("");
	}

	
}
