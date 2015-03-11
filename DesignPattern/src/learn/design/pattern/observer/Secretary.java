package learn.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;


public class Secretary {
	private List<StockObserver> observers = new ArrayList<>();
	private String action;
	
	public void Attach(StockObserver observer){
		
		observers.add(observer);
	}
	
	public void Notify(){
		for (StockObserver o : observers) {
			o.Update();
		}
	}
	
	public void setSecretaryAction(String value){
		action = value;
	}
	
	public String SecretaryAction(){
		return action;
	}
}
