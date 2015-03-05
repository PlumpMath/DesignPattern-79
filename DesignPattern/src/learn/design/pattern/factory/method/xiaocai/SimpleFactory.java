package learn.design.pattern.factory.method.xiaocai;

import learn.design.pattern.factory.method.daniao.LeiFeng;
import learn.design.pattern.factory.method.daniao.Undergraduate;
import learn.design.pattern.factory.method.daniao.Volunteer;

public class SimpleFactory {
	public static LeiFeng CreateLeiFeng(int type){
		LeiFeng result = null;
		switch (type) {
		case 1:
			result = new Undergraduate();
			break;
			
		case 2:
			result = new Volunteer();
			break;
		default:
			break;
		}
		
		
		return result;
		
	}
}
