package learn.design.pattern.responsibility.chain.modify02;

/**
 * 总监
 * @类名称: Majordomo
 * @类描述: TODO
 * @备注：
 */
public class Majordomo extends Manager {

	public Majordomo(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void RequestApplicaions(Request request) {
		// TODO Auto-generated method stub
		if (request.getRequestType().equals("请假") && request.getNumber() <= 5) {
			System.out.println(name + request.getRequestContent() + request.getNumber());
		}else {
			if (superior != null) {
				superior.RequestApplicaions(request);
			}
		}
	}

}
