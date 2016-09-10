package testjavaclass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *  TestRegularExpression.java
 *  Description:<br>
 *  参考链接：http://www.runoob.com/java/java-regular-expressions.html<br>
 *  CreateDate: 2016年9月4日 下午8:02:19
 *  @author 马宁波
 */
public class TestRegularExpression {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("([a-z0-9A-Z_]+)([A-Z]+)([0-9]+)");//定义匹配规则
		Matcher m = p.matcher("Aaasdad123456789ABC");//生成匹配操作引擎
		System.out.println(m.matches());//扫描整个字符串，如果发现不符合规则就返回false，否则返回true
		//System.out.println(m.find());//是否能找到下一个匹配的字符串，与上一个匹配有关
		//System.out.println(m.start());
		//System.out.println(m.end());
		System.out.println(m.groupCount());
		//System.out.println(m.group());
		//System.out.println(m.group(0));
		//System.out.println(m.group(1));
		//System.out.println(m.group(2));
	}
}
