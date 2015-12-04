package teststructure.clone;
/**
 *  TestCloneClient.java
 *  Description:
 *  
 *  CreateDate: 2015年9月24日 下午4:22:07 
 * 
 *  @author 马宁波
 */
public class TestCloneClient {
	public static void main(String[] args){
		Human human = new Human("小明", "男", 25, new Dog("kk", "yellow"));
		Human human1 = human.clone();
		Human human2 = human.deepClone();
		if(null!=human1 && null!=human2){
			System.out.println(human1.getDog().getColor());
			System.out.println(human1.getDog()==human.getDog());
			System.out.println(human2.getDog().getColor());
			System.out.println(human2.getDog()==human.getDog());
			System.out.println(human2.getDog()==human1.getDog());
			System.out.println(human1.getDog().getName());
			human1.getDog().setName("gg");
			System.out.println(human.getDog().getName());
			System.out.println(human2.getDog().getName());
		}else{
			System.out.println("克隆失败！");
		}
	}
}
