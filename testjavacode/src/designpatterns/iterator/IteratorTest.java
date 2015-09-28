package designpatterns.iterator;
/**
 *  IteratorTest.java
 *  Description:
 *  
 *  CreateDate: 2015年9月28日 下午3:41:32 
 * 
 *  @author 马宁波
 */
public class IteratorTest {
	public static void main(String[] args) {
		Collection collection = new MyCollection();
		Iterator it = collection.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
