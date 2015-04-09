package learn.design.pattern.observer.modify03;

public class Show3 {

	/**
	 * @方法名称:main
	 * @描述: TODO
	 * @创建人：PengBo
	 * @创建时间：2015-4-9 下午4:07:28 
	 * @备注：     
	 * @param args   
	 * @返回类型：void
	 */
	public static void main(String[] args) {
		ConcreteSubject s = new ConcreteSubject();
		s.Attach(new ConcreteObserver(s, "X"));
		s.Attach(new ConcreteObserver(s, "Y"));
		s.Attach(new ConcreteObserver(s, "Z"));
		
		s.setSubjectState("ABC");
		s.Notify();
	}

}
