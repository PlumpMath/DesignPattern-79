package learn.design.pattern.factory.method.xiaocai;

import learn.design.pattern.factory.method.daniao.LeiFeng;

public class ShowLeiFeng {

	
	public static void main(String[] args) {
		/*
		LeiFeng feng = new Undergraduate();
		feng.BuyRice();
		feng.Sweep();
		feng.Wash();
		*/
		
		LeiFeng feng2 = SimpleFactory.CreateLeiFeng(1);
		feng2.Wash();
		
		LeiFeng feng = SimpleFactory.CreateLeiFeng(2);
		feng.BuyRice();
	}

}
