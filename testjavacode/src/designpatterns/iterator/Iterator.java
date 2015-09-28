package designpatterns.iterator;
/**
 *  Iterator.java
 *  Description:
 *  
 *  CreateDate: 2015年9月28日 下午3:11:13 
 * 
 *  @author 马宁波
 */
public interface Iterator {
	/**
	 * 前移
	 * @return
	 */
	public Object pervious();
	/**
	 * 后移
	 * @return
	 */
	public Object next();
	/**
	 * 集合是否有下一个元素
	 * @return false没有，true有
	 */
	public boolean hasNext();
	/**
	 * 获得第一个元素
	 * @return
	 */
	public Object first();
}
