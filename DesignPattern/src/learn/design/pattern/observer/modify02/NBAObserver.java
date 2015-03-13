package learn.design.pattern.observer.modify02;

public class NBAObserver extends Observer {

	public NBAObserver(String name, Secretary sub) {
		super(name, sub);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Update() {
		// TODO Auto-generated method stub
		System.out.println(sub.SecretaryAction() + "  " + name + "   关闭股票行情,继续工作...");
	}

}
