package learn.design.pattern.observer.modify03;

public class ConcreteSubject extends Subject {
	private String subjectState;

	public String getSubjectState() {
		return subjectState;
	}

	public void setSubjectState(String value) {
		this.subjectState = value;
	}
}
