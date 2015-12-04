package testframework.jackson;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonAndVm {
	public static void main(String[] args) {
		
//		writeJsonObject();

//		readJsonObject();

		readJsonMap();
	}

	

	// 直接写入一个对象
	public static void writeJsonObject() {
		ObjectMapper mapper = new ObjectMapper();
		TestVm testVm = new TestVm();
		testVm.setTotal(4);
		testVm.setRdm(6);
		Map<String,List<User>> data = new HashMap<String,List<User>>();
		List<User> userlist = new ArrayList<User>();
		User user = new User();
		user.setCid("3");
		user.setClickUrl("http://www.fealingware.com");
		user.setIntday("23423424242");
		user.setIntime("43244324243");
		user.setTitle("发生的方式方法上发生的发生");
		user.setType("ddddd");
		user.setUrl("http://www.xywy.com");
		userlist.add(user);
		data.put(String.valueOf(user.getCid()), userlist);
		testVm.setData(data);
		try {
			mapper.writeValue(System.out, testVm);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 直接将一个json转化为对象
	public static void readJsonObject() {
		ObjectMapper mapper = new ObjectMapper();
		try {
			TestVm testVm = mapper.readValue(new File("D:/mnbsoftware/eclipse/workspace/testjavacode/WebContent/data"),
					TestVm.class);
			System.out.println(testVm.getTotal());
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 直接转化为map
	@SuppressWarnings("rawtypes")
	public static void readJsonMap() {
		ObjectMapper mapper = new ObjectMapper();
		try {
			// 需要注意的是这里的Map实际为一个LikedHashMap，即链式哈希表，可以按照读入顺序遍历
			Map map = mapper.readValue(new File((new File("")).getAbsolutePath()+"\\WebContent\\testjson.txt"), Map.class);
			System.out.println("data:"+map.get("data"));
			System.out.println("code:"+map.get("code"));
			System.out.println(mapper.writeValueAsString(map.get("data")));
			TestVm testVm = mapper.readValue(mapper.writeValueAsString(map.get("data")),TestVm.class);
//			TestVm testVm = mapper.readValue(map.get("data").toString(),TestVm.class);
			System.out.println(testVm.getTotal());
			Map<String,List<User>> data = testVm.getData();
			Set<String> keys = data.keySet();
			for (String key : keys) {
				System.out.println(key);
				List<User> userlist = data.get(key);
				for (User user : userlist) {
					System.out.println(user.toString());
				}
			}
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
