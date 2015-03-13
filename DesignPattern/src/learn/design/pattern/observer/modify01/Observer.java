package learn.design.pattern.observer.modify01;

public abstract class Observer {

	String name;
	Secretary sub;
	
	public Observer(String name, Secretary sub){
		this.name = name;
		this.sub = sub;
	}
	
	public abstract void Update();
}
