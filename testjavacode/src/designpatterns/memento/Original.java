package designpatterns.memento;
/**
 *  Original.java
 *  Description:
 *  
 *  CreateDate: 2015年9月29日 上午8:50:49 
 * 
 *  @author 马宁波
 */
public class Original {
	private String value;
	
	public Original(String value){
		this.value = value;
	}

	public Memento createMemento(){
		return new Memento(this.value);
	}
	
	public void restoreMemento(Memento memento){
		this.value = memento.getValue();
	}
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}
