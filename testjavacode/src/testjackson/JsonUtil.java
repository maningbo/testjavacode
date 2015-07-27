package testjackson;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *  JsonUtil.java
 *  Description:
 *  
 *  CreateDate: 2015年7月27日 下午2:48:46 
 * 
 *  @author 马宁波
 */
public class JsonUtil {
	public static String objectToJsonString(Object o){
		String json = "";
		try {
			ObjectMapper mapper = new ObjectMapper();
			json = mapper.writeValueAsString(o);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return json;
	}
	
	public static void main(String[] args) {
		User u = new User();
		u.setCid("1");
		u.setClickUrl("http://www.baidu.com");
		System.out.println(objectToJsonString(u));
	}
}
