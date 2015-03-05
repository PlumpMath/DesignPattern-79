package learn.design.pattern.decorator.xiaocai;

public class Show {

	public static void main(String[] args) {
		Person xc = new Person("小菜");
		System.out.println("第一种装扮: ");
		
		Sneaker pqx = new Sneaker();
		BigTrouser kk = new BigTrouser();
		TShirts dtx = new TShirts();
		
		pqx.Decorate(xc);
		kk.Decorate(pqx);
		dtx.Decorate(kk);
		dtx.Show();
	}

}
