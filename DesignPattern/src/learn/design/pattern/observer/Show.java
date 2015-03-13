package learn.design.pattern.observer;

public class Show {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//观察者 -- 前台
		Secretary tongzizhe = new Secretary();
		
		//看股票的同事
		StockObserver tongshi1 = new StockObserver("同事1", tongzizhe);
		StockObserver tongshi2 = new StockObserver("同事2", tongzizhe);
		
		//观察者记下这两位同事
		tongzizhe.Attach(tongshi1);
		tongzizhe.Attach(tongshi2);
		
		//发现老板回来了
		tongzizhe.setSecretaryAction("老板回来了...");
		
		//通知两个同事
		tongzizhe.Notify();
		
		
	}

}
