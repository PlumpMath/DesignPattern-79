package learn.design.pattern.responsibility.chain.modify02;

public class Show2 {

	public static void main(String[] args) {
		CommonManager jinli = new CommonManager("金利");
		Majordomo zongjian = new Majordomo("宗剑");
		GeneralManager zhongjingli = new GeneralManager("钟经理");
		
		jinli.SetSuperior(zongjian);
		zongjian.SetSuperior(zhongjingli);
		
		Request request1 = new Request();
		request1.setRequestType("请假");
		request1.setRequestContent("小菜请假");
		request1.setNumber(1);
		jinli.RequestApplicaions(request1);
		
		Request request2 = new Request();
		request2.setRequestType("请假");
		request2.setRequestContent("小菜请假");
		request2.setNumber(4);
		jinli.RequestApplicaions(request2);
		
		Request request3 = new Request();
		request3.setRequestType("加薪");
		request3.setRequestContent("小菜加薪");
		request3.setNumber(500);
		jinli.RequestApplicaions(request3);
		
		Request request4 = new Request();
		request4.setRequestType("加薪");
		request4.setRequestContent("小菜加薪");
		request4.setNumber(1000);
		jinli.RequestApplicaions(request4);
		
		
	}

}
