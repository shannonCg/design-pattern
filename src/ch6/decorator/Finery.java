package ch6.decorator;

/*
 * 裝飾模式：Decorator
 */
public abstract class Finery extends Person {
	protected Person component;
	
	//對原物件進行擴充職責的包裝
	public void decorate(Person component){
		this.component = component;
	}
	
	@Override
	public void show(){
		if(component != null){
			component.show();
		}
	}
}
