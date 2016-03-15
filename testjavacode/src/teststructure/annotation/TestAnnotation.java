package teststructure.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

/**
 *  TestAnnotation.java
 *  Description:
 *  
 *  CreateDate: 2016年3月15日 上午8:54:23 
 * 
 *  @author 马宁波
 */
@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface TestAnnotation {
	String author() default "Pankaj";
    String date();
    int revision() default 1;
    String comments();
}
