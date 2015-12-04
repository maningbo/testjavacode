package teststructure.clone;

import java.io.Serializable;

/**
 *  Dog.java
 *  Description:
 *  
 *  CreateDate: 2015年9月24日 下午4:20:11 
 * 
 *  @author 马宁波
 */
public class Dog implements Serializable{
	/**
	 * eclipse 自动生成
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String color;
	public Dog(String name,String color){
		this.name = name;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}