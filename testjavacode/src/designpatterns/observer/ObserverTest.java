package designpatterns.observer;
/**
 *  ObserverTest.java
 *  Description:
 *  
 *  CreateDate: 2015年9月28日 下午2:46:16 
 * 
 *  @author 马宁波
 */
public class ObserverTest {
	//MySubject类就是我们的主对象，Observer1和Observer2是依赖于MySubject的对象，
	//当MySubject变化时，Observer1和Observer2必然变化。
	//AbstractSubject类中定义着需要监控的对象列表，可以对其进行修改：
	//增加或删除被监控对象，且当MySubject变化时，负责通知在列表内存在的对象。
	public static void main(String[] args) {
		Subject sub = new MySubject();
		Observer1 ob1 = new Observer1();
		sub.add(ob1);
		sub.add(new Observer2());
		sub.operation();
		sub.del(ob1);
		sub.operation();
	}
}
