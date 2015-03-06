package learn.design.pattern.prototype.daniao;

public class ConcretePrototype1 extends Prototype {

	public ConcretePrototype1(String id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Prototype Clone() {
		// TODO Auto-generated method stub
		try {
			return (Prototype)this.clone();
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

}
