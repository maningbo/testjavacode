package thinkinginjava.chapter18javaio;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 *  E02_SortedDirList.java
 *  Description:
 *  
 *  CreateDate: 2015年11月25日 上午10:50:20 
 * 
 *  @author 马宁波
 */

class SortedDirList{
	private File path;
	public SortedDirList(){path = new File(".");}
	public SortedDirList(File path){this.path = path;}
	public String[] list(){
		String[] list = path.list();
		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
		return list;
	}
	public String[] list(final String fn_regex){
		String[] list = path.list(new FilenameFilter() {
			private Pattern pattern = Pattern.compile(fn_regex);
			public boolean accept(File dir, String name) {
				return pattern.matcher(name).matches();
			}
		});
		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
		return list;
	}
}

public class E02_SortedDirList {
	public static void main(String[] args) {
		//Default constructor == current directory
		SortedDirList dir = new SortedDirList();
		System.out.println(Arrays.asList(dir.list("\\S*r\\S*")));
	}
}
