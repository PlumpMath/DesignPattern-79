package learn.design.pattern.observer.modify02;

public interface Subject {
	public void Attach(Observer observer);
	public void Detach(Observer observer);
	
	public void setSubjectState(String value);
	
	public String SubjectState();
}
