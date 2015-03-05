package learn.design.pattern.decorator.daniao;

public class Decorator extends Component {
	protected Component component;
	
	public void setComponent(Component component){
		this.component = component;
	}

	public void Operation() {
		if(component != null){
			component.Operation();
		}
	}
}
