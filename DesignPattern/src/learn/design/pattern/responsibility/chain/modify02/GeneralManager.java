package learn.design.pattern.responsibility.chain.modify02;

public class GeneralManager extends Manager{

	public GeneralManager(String name) {
		super(name);
	}

	@Override
	public void RequestApplicaions(Request request) {
		if (request.getRequestType().equals("请假")) {
			System.out.println(name + request.getRequestContent() + request.getNumber());
		}else if(request.getRequestType().equals("加薪") && request.getNumber() <= 500){
			System.out.println(name + request.getRequestContent() + request.getNumber());
		}else if(request.getRequestType().equals("加薪") && request.getNumber() > 500){
			System.out.println(name + "考虑......");
		}
	}

	
}
