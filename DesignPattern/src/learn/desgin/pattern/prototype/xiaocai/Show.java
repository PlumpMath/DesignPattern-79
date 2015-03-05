package learn.desgin.pattern.prototype.xiaocai;

public class Show {

	public static void main(String[] args) {
		Resume resume = new Resume("haha");
		resume.SetPersonalInfo("man", "15");
		resume.SetWorkExperience("1998-2000", "test");
		
		resume.Display();
		
		
		
	}

}
