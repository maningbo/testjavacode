package designpatterns.iterator;
/**
 *  Collection.java
 *  Description:
 *  
 *  CreateDate: 2015年9月28日 下午3:08:15 
 * 
 *  @author 马宁波
 */
public interface Collection {
	
	/**
	 * 迭代遍历
	 * @return
	 */
	public Iterator iterator();
	/**
	 * 取得集合元素
	 * @param i
	 * @return
	 */
	public Object get(int i);
	/**
	 * 取得集合大小
	 * @return
	 */
	public int size();
}
