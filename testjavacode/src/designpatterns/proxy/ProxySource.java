package designpatterns.proxy;
/**
 *  ProxySource.java
 *  Description:
 *  
 *  CreateDate: 2015年9月25日 下午5:17:49 
 * 
 *  @author 马宁波
 */
public class ProxySource implements Sourceable{

	private Source source;
	public ProxySource(){
		super();
		this.source = new Source();
	}
	
	@Override
	public void method() {
		beforeProxy();
		source.method();
		afterProxy();
	}

	public void beforeProxy(){
		System.out.println("before proxy");
	}
	
	public void afterProxy(){
		System.out.println("after Proxy");
	}
}
