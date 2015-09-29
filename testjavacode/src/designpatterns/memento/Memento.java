package designpatterns.memento;
/**
 *  Memento.java
 *  Description:
 *  
 *  CreateDate: 2015年9月29日 上午8:51:04 
 * 
 *  @author 马宁波
 */
public class Memento {
	private String value;

	public Memento(String value){
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}
