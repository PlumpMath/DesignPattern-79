package learn.design.pattern.responsibility.chain.modify02;

public class CommonManager extends Manager {

	public CommonManager(String name) {
		super(name);
	}

	@Override
	public void RequestApplicaions(Request request) {
		if (request.getRequestType().equals("请假") && request.getNumber() <=2) {
			System.out.println();
			
		}else {
			if (superior != null) {
				superior.RequestApplicaions(request);
			}
		}
	}

}
