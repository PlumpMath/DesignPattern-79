package learn.design.pattern.responsibility.chain;

public class Manager {

	private String name;
	public Manager(String name){
		this.name = name;
	}
	
	//得到结果
	public void GetResult(String managerLevel, Request request){
		if (managerLevel.equals("经理")) {
			if (request.getRequestType().equals("请假") && request.getNumber() <= 2) {
				System.out.println("" + name + ": " + request.getRequestContent() + "数量" + request.getNumber() + "被批准");
			}else {
				System.out.println("" + name + ": " + request.getRequestContent() + "数量" + request.getNumber() + "我无权处理");
			}
		}else if (managerLevel.equals("总监")) {
			if (request.getRequestType().equals("请假") && request.getNumber() <= 5) {
				System.out.println("" + name + ": " + request.getRequestContent() + "数量" + request.getNumber() + "被批准");
			}else {
				System.out.println("" + name + ": " + request.getRequestContent() + "数量" + request.getNumber() + "我无权处理");
			}
		}else if (managerLevel.equals("总经理")) {
			if (request.getRequestType().equals("请假")) {
				System.out.println("" + name + ": " + request.getRequestContent() + "数量" + request.getNumber() + "被批准");
			}else if(request.getRequestType().equals("加薪") && request.getNumber() <= 500){
				System.out.println("" + name + ": " + request.getRequestContent() + "数量" + request.getNumber() + "被批准");
			}else if(request.getRequestType().equals("加薪") && request.getNumber() > 500){
				System.out.println("" + name + ": " + request.getRequestContent() + "数量" + request.getNumber() + "再说吧");
			}
		}
	}
}
