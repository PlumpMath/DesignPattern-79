package learn.design.pattern.decorator.xiaocai;

public class Person {
	private String name;
	public Person(){ }
	
	public Person(String name){
		this.name = name;
	}
	
	public void Show(){
		System.out.println("装扮的: " + name);
	}
}
