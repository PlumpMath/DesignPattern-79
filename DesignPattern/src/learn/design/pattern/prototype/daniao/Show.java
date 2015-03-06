package learn.design.pattern.prototype.daniao;

public class Show {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConcretePrototype1 p1 = new ConcretePrototype1("1");
		ConcretePrototype1 clone = (ConcretePrototype1) p1.Clone();
		
		System.out.println("p1: " + p1);
		System.out.println("clone: " + clone);
	}

}
