package learn.design.pattern.prototype.xiaocai;

public class Resume {
	private String name;
	private String sex;
	private String age;
	private String timeArea;
	private String company;
	
	
	public Resume(String name){
		this.name = name;
	}
	
	public void SetPersonalInfo(String sex, String age){
		this.sex = sex;
		this.age = age;
	}
	
	public void SetWorkExperience(String timeArea, String company){
		this.timeArea = timeArea;
		this.company = company;
	}
	
	public void Display(){
		System.out.println("name: "  + name + " sex: " + sex + " age: " + age);
		System.out.println("timeArea: " + timeArea + " company: " + company);
	}
}
