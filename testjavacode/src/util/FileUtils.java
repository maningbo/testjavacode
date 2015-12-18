package util;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/**
 *  FileUtils.java
 *  Description:
 *  
 *  CreateDate: 2015年12月16日 下午5:17:42 
 * 
 *  @author 马宁波
 */
public class FileUtils {
	public static void main(String[] args) {
		getFilesByFolderName("D:/mnbdocuments/工作日志","");
	}

	/**
	 * 不包含二级目录的文件
	 * @param folderName
	 * @param likeString
	 * @return
	 */
	public static Map<String,String> getFilesByFolderName(String folderName,String likeString){
		Map<String,String> files = new HashMap<String, String>();
		File path = new File(folderName);//项目根目录
		String[] list;
		if(null==likeString||"".equals(likeString)){
			list = path.list();
		}else{
			final String rules = "\\S*"+likeString+"\\S*";
			list = path.list(new FilenameFilter(){
				private Pattern pattern = Pattern.compile(rules);
				public boolean accept(File dir,String name){
					return pattern.matcher(name).matches();
				}
			});
		}
		if(list!=null&&list.length>0){
			files.put("havefile", "1");
			Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
			for (String dirItem : list) {
				System.out.println(dirItem);
			}
		}else{
			files.put("havefile", "0");
		}
		return files;
	}
	
	class FileEntity{//文件实体对象
		private Integer id;
		private String name;
		private String realpath;//绝对路径
		private Integer isFile;//0表示文件，1表示文件夹
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getRealpath() {
			return realpath;
		}
		public void setRealpath(String realpath) {
			this.realpath = realpath;
		}
		public Integer getIsFile() {
			return isFile;
		}
		public void setIsFile(Integer isFile) {
			this.isFile = isFile;
		}
	}
}
