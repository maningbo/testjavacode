package designpatterns.iterator;
/**
 *  MyCollection.java
 *  Description:
 *  
 *  CreateDate: 2015年9月28日 下午3:28:45 
 * 
 *  @author 马宁波
 */
public class MyCollection implements Collection{

	public String[] stringarray = {"1","2","3","4","5"};
	
	@Override
	public Iterator iterator() {
		return new MyIterator(this);
	}

	@Override
	public Object get(int i) {
		return stringarray[i];
	}

	@Override
	public int size() {
		return stringarray.length;
	}

}
