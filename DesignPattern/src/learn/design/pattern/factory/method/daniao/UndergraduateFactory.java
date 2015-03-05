package learn.design.pattern.factory.method.daniao;


public class UndergraduateFactory implements LeiFengFactory {

	@Override
	public LeiFeng CreateLeiFeng() {
		// TODO Auto-generated method stub
		return new Undergraduate();
	}

}
