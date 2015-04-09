package learn.design.pattern.observer.modify03;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

	private List<Observer> observers = new ArrayList<Observer>();
	
	/**
	 * 增加观察者
	 */
	public void Attach(Observer observer){
		observers.add(observer);
	}
	
	/**
	 * 移除观察者
	 */
	public void Detach(Observer observer){
		observers.remove(observer);
	}
	
	public void Notify(){
		for (Observer o : observers) {
			o.Update();
		}
	}
}
