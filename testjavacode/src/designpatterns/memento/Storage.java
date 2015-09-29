package designpatterns.memento;
/**
 *  Storage.java
 *  Description:
 *  
 *  CreateDate: 2015年9月29日 上午8:51:34 
 * 
 *  @author 马宁波
 */
public class Storage {
	private Memento memento;

	public Storage(Memento memento){
		this.memento = memento;
	}
	
	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
	
}
