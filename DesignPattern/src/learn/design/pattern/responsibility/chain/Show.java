package learn.design.pattern.responsibility.chain;

public class Show {

	/**
	 * @方法名称:main
	 * @描述: TODO
	 * @创建人：PengBo
	 * @创建时间：2015-4-9 下午5:07:54 
	 * @备注：     
	 * @param args   
	 * @返回类型：void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager jinli = new Manager("金利");
		Manager zongjian = new Manager("总监");
		Manager zhongjingli = new Manager("钟经理");
		
		Request request = new Request();
		request.setRequestType("加薪");
		request.setRequestContent("小菜请求加薪");
		request.setNumber(1000);
		
		jinli.GetResult("经理", request);
		zongjian.GetResult("总监", request);
		zhongjingli.GetResult("总经理", request);
		
		
		Request request2 = new Request();
		request2.setRequestType("请假");
		request2.setRequestContent("小菜请假");
		request2.setNumber(3);
		
		jinli.GetResult("经理", request2);
		zongjian.GetResult("总监", request2);
		zhongjingli.GetResult("总经理", request2);
		
		
	}

}
