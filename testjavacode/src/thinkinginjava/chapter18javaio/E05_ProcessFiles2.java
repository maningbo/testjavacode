package thinkinginjava.chapter18javaio;

import java.io.File;
import java.io.IOException;

import net.mindview.util.ProcessFiles;

/**
 *  E05_ProcessFiles2.java
 *  Description:
 *  
 *  CreateDate: 2015年11月30日 上午9:59:08 
 * 
 *  @author 马宁波
 */

class ProcessFiles2{
	private ProcessFiles.Strategy strategy;
	private String regex;
	public ProcessFiles2(ProcessFiles.Strategy strategy,String regex){
		this.strategy = strategy;
		this.regex = regex;
	}
//	public void start(String[] args){
//		try{
//			if(args.length == 0){
//				processD
//			}
//		}catch(IOException e){
//			
//		}
//	}
//	public void processDirectoryTree(File root) throws IOException{
//		for(File file){
//			
//		}
//	}
}

public class E05_ProcessFiles2 {

}
