package learn.design.pattern.proxy.daniao;

public class RealSubject implements Subject{

	public void Request() {
		System.out.println("真实的请求");
	}
}
