package util.EntityObject;
/**
 *  FileEntity.java
 *  Description:
 *  
 *  CreateDate: 2015年12月23日 上午8:30:45 
 * 
 *  @author 马宁波
 */
public class FileEntity{//文件实体对象
	private Integer id;
	private String name;
	private String absolutePath;//绝对路径
	private Integer isFile;//0表示普通文件，1表示文件夹
	
	public FileEntity(){}
	public FileEntity(String name,String absolutePath,Integer isFile){
		this.name = name;
		this.absolutePath = absolutePath;
		this.isFile = isFile;
	}
	
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
	public String getAbsolutePath() {
		return absolutePath;
	}
	public void setAbsolutePath(String absolutePath) {
		this.absolutePath = absolutePath;
	}
	public Integer getIsFile() {
		return isFile;
	}
	public void setIsFile(Integer isFile) {
		this.isFile = isFile;
	}
}
