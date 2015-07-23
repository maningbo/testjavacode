package teststatic.demo1;

class OfficeBetter{
	public static void main(String[] args){
		System.out.println("test");
		try{
			//动态加载类，在运行时刻加载
			Class<?> c = Class.forName("teststatic.demo1."+args[0]);
			//通过类类型，创建该类对象
			OfficeAble oa = (OfficeAble)c.newInstance();
			oa.start();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}