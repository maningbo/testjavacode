package testList;

import java.util.ArrayList;
import java.util.List;

/**
 *  SubList.java
 *  Description:
 *  
 *  CreateDate: 2015年9月15日 下午12:29:28 
 * 
 *  @author 马宁波
 */
public class SubList {
	public static void main(String[] args) {
		List<String> strings = new ArrayList<String>();
		for(int i=1;i<=11;i++){
			strings.add(i+"");
		}
		System.out.println(strings.toString());
		System.out.println(strings.size());
		int listsize = (null==strings)?0:strings.size();//List总记录条数，做非空判断避免程序出现异常
		int perpagesize = 3;//每个子List存放的记录条数
		int sumpagenumber = listsize/perpagesize;//总共需要多少个子List，整数相除会直接舍去小数部分
		int lastListsize = listsize%perpagesize;//最后一个List的size
		if(lastListsize!=0){//如果最后一个List的大小不为0，则所需的List个数需要加1
			sumpagenumber++;
		}
		System.out.println(sumpagenumber);
		for(int i=0;i<sumpagenumber;i++){
			int starnum = i*perpagesize;//每个子List起始的位置
			if(starnum+perpagesize<listsize){
				System.out.println((starnum+1)+"-"+(starnum+perpagesize));
				System.out.println(strings.subList(starnum, starnum+perpagesize));
			}else{
				System.out.println((starnum+1)+"-"+(listsize));
				System.out.println(strings.subList(starnum, listsize));
			}
		}
	}
}
