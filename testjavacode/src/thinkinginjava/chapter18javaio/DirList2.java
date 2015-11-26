package thinkinginjava.chapter18javaio;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 *  DirList2.java
 *  Description:
 *  
 *  CreateDate: 2015年11月24日 下午1:24:01 
 * 
 *  @author 马宁波
 */
public class DirList2 {
	public static FilenameFilter filter(final String regex){
		//Creation of anonymous inner class:
		return new FilenameFilter(){
			private Pattern pattern = Pattern.compile(regex);
			public boolean accept(File dir,String name){
				return pattern.matcher(name).matches();
			}
		};//End of anonymous inner class
	}
	public static void main(String[] args){
		//args = new String[]{"\\S{0,}o\\S{0,}"};
		args = new String[]{"\\S*r\\S*"};//名称中包含字母r的文件或者文件夹
		File path = new File(".");//项目根目录
		String[] list;
		if(args.length == 0){
			list = path.list();
		}else{
			list = path.list(filter(args[0]));
		}
		Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
		for (String dirItem : list) {
			System.out.println(dirItem);
		}
	}
}
