package testjackson;

public class User implements Cloneable{
	private String cid;
	private String clickUrl;
	private String intday;
	private String intime;
	private String title;
	private String type;
	private String url;
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getClickUrl() {
		return clickUrl;
	}
	public void setClickUrl(String clickUrl) {
		this.clickUrl = clickUrl;
	}
	public String getIntday() {
		return intday;
	}
	public void setIntday(String intday) {
		this.intday = intday;
	}
	public String getIntime() {
		return intime;
	}
	public void setIntime(String intime) {
		this.intime = intime;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return this.cid+":"+this.clickUrl+":"+this.title;
	}
	@Override
	protected User clone() throws CloneNotSupportedException{
		User user = new User();
		user.setCid(this.cid);
		user.setClickUrl(this.clickUrl);
		user.setIntday(this.intday);
		user.setIntime(this.intime);
		user.setTitle(this.title);
		user.setType(this.type);
		user.setUrl(this.url);
		return user;
	}
}
