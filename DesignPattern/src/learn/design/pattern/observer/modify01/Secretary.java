package learn.design.pattern.observer.modify01;

import java.util.ArrayList;

import java.util.List;



public class Secretary {
	private List<Observer> observers = new ArrayList<>();
	private String action;
	
	public void Attach(Observer observer){
		
		observers.add(observer);
	}
	
	public void Notify(){
		for (Observer o : observers) {
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
