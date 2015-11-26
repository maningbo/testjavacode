package thinkinginjava.chapter18javaio;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 *  E03_DirSize.java
 *  Description:
 *  
 *  CreateDate: 2015年11月26日 上午8:35:33 
 * 
 *  @author 马宁波
 */
public class E03_DirSize {
	public static void main(final String[] args) {
		File path = new File(".");
		String[] list;
		if(args.length == 0){
			list = path.list();
		}else{
			list = path.list(new FilenameFilter() {
				private Pattern pattern = Pattern.compile(args[0]);
				public boolean accept(File dir, String name) {
					return pattern.matcher(name).matches();
				}
			});
		}
		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
		long total = 0;
		long fs;
		for (String dirItem : list) {
			fs = new File(path, dirItem).length();
			System.out.println(dirItem + "," + fs + " byte(s)");
			total += fs;
		}
		System.out.println("=============");
		System.out.println(list.length + " file(s)," + total + " bytes");
	}
}
