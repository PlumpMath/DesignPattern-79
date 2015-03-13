package learn.design.pattern.observer.modify01;

public class StockObserver extends Observer {

	public StockObserver(String name, Secretary sub) {
		super(name, sub);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Update() {
		// TODO Auto-generated method stub
		System.out.println(sub.SecretaryAction() + "  " + name + "   关闭股票行情,继续工作...");
	}

}
