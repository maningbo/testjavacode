package testframework.jackson;

import java.util.List;
import java.util.Map;

public class TestVm {

	private Integer total;
	private Integer rdm;
	private Map<String,List<User>> data;
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public Integer getRdm() {
		return rdm;
	}
	public void setRdm(Integer rdm) {
		this.rdm = rdm;
	}
	public Map<String, List<User>> getData() {
		return data;
	}
	public void setData(Map<String, List<User>> data) {
		this.data = data;
	}
}
