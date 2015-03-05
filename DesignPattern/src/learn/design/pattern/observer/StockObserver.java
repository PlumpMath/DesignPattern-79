package learn.design.pattern.observer;

public class StockObserver {
	private String name;
	private String sub;
	
	public StockObserver(String name, String sub){
		this.name = name;
		this.sub = sub;
	}
	
	public void Update(){
		System.out.println("");
	}
}
