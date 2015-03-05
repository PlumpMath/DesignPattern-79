package learn.design.pattern.factory.method.xiaocai;

public class Show {

	public static void main(String[] args) {
//		IFactory operFactory = new AddFactory();
		IFactory operFactory = new MulFactory();
		Operation oper = operFactory.CreateOperation();
		oper.NumberA = 1;
		oper.NumberB = 2;
		double result = oper.GetResult();
		
		System.err.println("result: " + result);
		
	}

}
