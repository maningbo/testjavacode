package 经典案例;

import java.sql.SQLException;

/**
 *  Mocker.java
 *  Description:
 *  
 *  CreateDate: 2015年10月15日 上午9:19:25 
 * 
 *  @author 马宁波
 */
public class Mocker<T extends Exception> {
	//Java的泛型并不是具体化的
	//这意味着在编译时，泛型的类型信息会“丢失”，
	//并且泛型参数像是被它的限定类型替换了一样，
	//或者当限定类型不存在时，泛型参数被替换成了Object。
	//这就是大家所说的类型“擦除”。
	private void pleaseThrow(final Exception t) throws T{
		throw(T) t;//发生的是将T替换成了Exception
	}
	public static void main(final String[] args) {
		try{
			new Mocker<RuntimeException>().pleaseThrow(new SQLException());
		}catch(final RuntimeException ex){//SQLException,RuntimeException,Exception
			//SQLException,Unreachable catch block for SQLException. This exception is never thrown from the try statement body
			ex.printStackTrace();
		}
	}
}
