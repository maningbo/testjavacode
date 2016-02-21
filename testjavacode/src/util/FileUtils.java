package util;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import util.EntityObject.FileEntity;

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
		//测试搜索当前文件夹中的文件开始
		//getFilesByFolderName("D:/mnbdocuments/工作日志","");
		//测试搜索当前文件夹中的文件结束
		
		//测试获取当前文件夹下的所有文件，包含文件夹，开始
//		List<FileEntity> files = getAllFiles("D:/mnbdocuments/工作日志",new ArrayList<FileEntity>());
//		for (FileEntity fileEntity : files) {
//			System.out.println(fileEntity.getIsFile()+fileEntity.getName()+" "+fileEntity.getAbsolutePath());
//		}
		//测试获取当前文件夹下的所有文件，包含文件夹，结束
		
		//测试查找当前文件夹下的所有文件，包含文件夹，开始
		Map<String,Object> files = getFilesByFolderNameContainSubDirectory("D:/mnbdocuments/工作日志","周报");
		String havefile = (String) files.get(HAVEFILEFLAG);
		if("0".equals(havefile)){
			System.out.println("路径存在但未搜索到符合条件的文件");
		}else if("1".equals(havefile)){
			@SuppressWarnings("unchecked")
			List<FileEntity> resultfiles = (List<FileEntity>) files.get(FILESDATA);
			for (FileEntity fileEntity : resultfiles) {
				System.out.println(fileEntity.getIsFile()+fileEntity.getName()+" "+fileEntity.getAbsolutePath());
			}
		}else if("2".equals(havefile)){
			System.out.println("给定的路径不存在");
		}else if("3".equals(havefile)){
			System.out.println("给定的路径不是文件夹");
		}
		
		//测试查找当前文件夹下的所有文件，包含文件夹，结束
	}

	//map中文件是否存在的标识，"0"路径存在但未搜索到符合条件的文件，"1"找到符合条件的文件，"2"给定的路径不存在，"3"给定的路径不是文件夹
	public static final String HAVEFILEFLAG = "havefile";
	public static final String FILESDATA = "files";//map中存放List<FileEntity>的key值
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
			files.put(HAVEFILEFLAG, "1");
			Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
			for (String dirItem : list) {
				System.out.println(dirItem);
			}
		}else{
			files.put(HAVEFILEFLAG, "0");
		}
		return files;
	}
	
	/**
	 * 包含二级目录的文件
	 * @param absolutePath文件夹的绝对路径
	 * @param likeString为null或者""表示查找全部
	 * @return
	 */
	public static Map<String,Object> getFilesByFolderNameContainSubDirectory(String absolutePath,String likeString){
		List<FileEntity> result = new ArrayList<FileEntity>();
		Map<String,Object> files = new HashMap<String, Object>();
		File path = new File(absolutePath);
		if(!path.exists()){//判断给定的路径是否存在
			files.put(HAVEFILEFLAG, "2");//给定的路径不存在
			return files;
		}else{
			if(!path.isDirectory()){
				files.put(HAVEFILEFLAG, "3");//给定的路径不是文件夹
				return files;
			}
		}
		List<FileEntity> allfiles = getAllFiles(absolutePath,new ArrayList<FileEntity>());
		if(null==likeString||"".equals(likeString)){
			result = allfiles;
			files.put(FILESDATA, result);
		}else{
			for (FileEntity fileEntity : allfiles) {
				if(fileEntity.getName().indexOf(likeString)>-1){//找到符合条件的文件与文件夹
					result.add(fileEntity);
				}
			}
			files.put(FILESDATA, result);
		}
		if(result!=null&&result.size()>0){
			files.put(HAVEFILEFLAG, "1");//找到符合条件的文件
		}else{
			files.put(HAVEFILEFLAG, "0");//路径存在但未搜索到符合条件的文件
		}
		return files;
	}
	
	/**
	 * @param absolutePath文件夹的绝对路径
	 * @param result返回的文件对象列表
	 * @return 返回指定文件夹下的所有文件，包含子文件夹中的文件
	 */
	public static List<FileEntity> getAllFiles(String absolutePath,List<FileEntity> result){
		if(null==result){
			result = new ArrayList<FileEntity>();
		}
		File path = new File(absolutePath);
		if(path.exists()){
			File[] files = path.listFiles();
			for (File file : files) {
				if(file.exists()){
					if(file.isDirectory()){
						String absolutePathtemp = file.getAbsolutePath();
						result.add(new FileEntity(file.getName(),absolutePathtemp,1));
						getAllFiles(absolutePathtemp,result);
					}else{
						result.add(new FileEntity(file.getName(),file.getAbsolutePath(),0));
					}
				}
			}
		}
		return result;
	}
}
