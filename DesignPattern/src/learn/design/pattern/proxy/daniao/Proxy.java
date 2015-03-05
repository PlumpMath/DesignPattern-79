package learn.design.pattern.proxy.daniao;

public class Proxy implements Subject {
	RealSubject realSubject;
	
	public void Request() {
		if(realSubject == null){
			realSubject = new RealSubject();
		}		
		realSubject.Request();
	}	
}
