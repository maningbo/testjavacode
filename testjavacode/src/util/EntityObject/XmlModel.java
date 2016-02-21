package util.EntityObject;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *  XmlModel.java
 *  Description:
 *  
 *  CreateDate: 2015年12月23日 下午3:12:47 
 * 
 *  @author 马宁波
 */
@XmlRootElement
public class XmlModel<T> {
	private Integer flag;
	private List<T> data;
	public Integer getFlag() {
		return flag;
	}
	public void setFlag(Integer flag) {
		this.flag = flag;
	}
	public List<T> getData() {
		return data;
	}
	public void setData(List<T> data) {
		this.data = data;
	}
}
