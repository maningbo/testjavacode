package thinkinginjava.chapter18javaio;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import net.mindview.util.TextFile;

/**
 *  E01_SearchWords.java
 *  Description:
 *  
 *  CreateDate: 2015年11月25日 上午9:26:04 
 * 
 *  @author 马宁波
 */
public class E01_SearchWords {
	public static void main(final String[] args) {
		File path = new File(".");
		String[] list;
		if(args.length == 0){
			list = path.list();
		}else{
			list = path.list(new FilenameFilter() {
				//Only analyze source files with the specified
				//extension (given as the first command line argument)
				public boolean accept(File dir, String name) {
					//Only filter upon file extension?
					if(args.length == 1){
						return true;
					}
					Set<String> words = new HashSet<String>(
						new TextFile(
							new File(dir, name).getAbsolutePath(),"\\W+"));
					for (int i = 0; i < args.length; i++) {
						if(words.contains(args[i])){
							return true;
						}
					}
					return false;
				}
			});
		}
		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
		for (String dirItem : list) {
			System.out.println(dirItem);
		}
	}
}
