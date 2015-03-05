package learn.design.pattern.factory.method.daniao;


public class VolunteerFactory implements LeiFengFactory {

	@Override
	public LeiFeng CreateLeiFeng() {
		// TODO Auto-generated method stub
		return new Volunteer();
	}

}
