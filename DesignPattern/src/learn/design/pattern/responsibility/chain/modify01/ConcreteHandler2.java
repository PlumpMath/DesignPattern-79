package learn.design.pattern.responsibility.chain.modify01;

public class ConcreteHandler2 extends Handler {

	@Override
	public void HandleRequest(int request) {
		if (request >= 10 && request < 20) {
			System.out.println( this.getClass().getSimpleName() + ": " + request);
		}else if(successor != null){
			successor.HandleRequest(request);
		}
	}
	
}
