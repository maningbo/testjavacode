package designpatterns.memento;
/**
 *  TestMemento.java
 *  Description:
 *  
 *  CreateDate: 2015年9月29日 上午8:57:24 
 * 
 *  @author 马宁波
 */
public class TestMemento {
	/* Original类是原始类，里面有需要保存的属性value及创建一个备忘录类，用来保存value值。
	 * Memento类是备忘录类，Storage类是存储备忘录的类，持有Memento类的实例*/
	public static void main(String[] args) {
		//创建原始类
		Original original = new Original("999");
		//创建备忘录
		Storage storage = new Storage(original.createMemento());
		//修改原始类
		System.out.println("初始化状态为："+original.getValue());
		original.setValue("120");
		System.out.println("修改后的状态为："+original.getValue());
		//恢复原始类的状态
		original.restoreMemento(storage.getMemento());
		System.out.println("恢复后的状态为："+original.getValue());
	}
}
