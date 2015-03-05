package learn.design.pattern.strategy.daniao;

public class Main {

	private static Context context;

	public static void main(String[] args) {
		context = new Context(new ConcreteStrategyA());
		context.ContextInterface();
		
		context = new Context(new ConcreteStrategyB());
		context.ContextInterface();
		
		context = new Context(new ConcreteStrategyC());
		context.ContextInterface();
	}

}
