package thinkinginjava.chapter18javaio;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 *  DirList3.java
 *  Description:
 *  
 *  CreateDate: 2015年11月24日 下午1:34:50 
 * 
 *  @author 马宁波
 */
public class DirList3 {
	public static void main(final String[] args){
		//args = new String[]{"\\S{0,}o\\S{0,}"};
//		args = new String[]{"\\S*r\\S*"};//名称中包含字母r的文件或者文件夹,作为控制台参数传入时不需要加转义字符\
		File path = new File(".");//项目根目录
		String[] list;
		if(args.length == 0){
			list = path.list();
		}else{
			list = path.list(new FilenameFilter(){
				private Pattern pattern = Pattern.compile(args[0]);
				public boolean accept(File dir,String name){
					return pattern.matcher(name).matches();
				}
			});
		}
		Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
		for (String dirItem : list) {
			System.out.println(dirItem);
		}
	}
}
