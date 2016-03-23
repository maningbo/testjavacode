package testjavaclass;
/**
 *  TestEnum.java<br>
 *  Description:<br>
 *  参考链接：http://blog.csdn.net/wgw335363240/article/details/6359614<br>
 *  CreateDate: 2016年3月22日 下午1:47:59
 *  @author 马宁波
 */
public class TestEnum {
	public enum Color {
		// 利用构造函数传参
		RED("红"),
		/**
		 * 绿色
		 */
		GREEN("绿"),
		YELLOW("黄");
		// 定义私有变量
		private String cName;
		// 构造函数，枚举类型只能为私有
		private Color(String cName) {
			this.cName = cName;
		}
		@Override
		public String toString() {
			return this.cName;
		}
	}
	
	public static void showColor(Color c){
		System.out.println(c.toString());
	}
	
	public static void main(String[] args) {
		showColor(Color.GREEN);
	}
}
