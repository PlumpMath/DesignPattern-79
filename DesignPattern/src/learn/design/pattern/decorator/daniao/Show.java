package learn.design.pattern.decorator.daniao;

public class Show {

	
	public static void main(String[] args) {
		ConcreteComponent c = new ConcreteComponent();
		ConcreteDecoratorA d1 = new ConcreteDecoratorA();
		ConcreteDecoratoeB d2 = new ConcreteDecoratoeB();
		
		d1.setComponent(c);
		d2.setComponent(d1);
		d2.Operation();
	}

}
