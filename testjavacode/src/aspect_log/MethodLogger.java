package aspect_log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;

import com.jcabi.log.Logger;

/**
 *  MethodLogger.java
 *  Description:
 *  
 *  CreateDate: 2016年9月21日 下午10:40:16
 *  @author 马宁波
 */
@Aspect
public class MethodLogger {
	@Around("execution(* *(..)) && @annotation(Loggable)")
	public Object around(ProceedingJoinPoint point) throws Throwable {
		System.out.println("===");
		long start = System.currentTimeMillis();
		Object result = point.proceed();
		Logger.info(
				"#%s(%s): %s in %[msec]s",
				MethodSignature.class.cast(point.getSignature()).getMethod().getName(),
				point.getArgs(),
				result,
				System.currentTimeMillis() - start
		);
		return result;
	}
}