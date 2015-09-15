package testList;
/**
 *  Manager.java
 *  Description:
 *  
 *  CreateDate: 2015年9月15日 上午11:46:17 
 * 
 *  @author 马宁波
 */
public class Manager {
	private Integer id;
	private String loginName;
	private String password;
	private String userName;
	
	Manager(Integer id,String loginName,String password,String userName){
		this.id = id;
		this.loginName = loginName;
		this.password = password;
		this.userName = userName;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
