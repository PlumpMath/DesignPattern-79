package learn.design.pattern.factory.simple.xiaocai;

public class Show {

	static Operation oper;
	public static void main(String[] args) {
		oper = OperationFactory.createOperate("+");
		oper.NumberA = 1;
		oper.NumberB = 2;
		int getResult = oper.GetResult();
		
		System.out.println("getResult: " + getResult);
	}

}
