package teststructure;

/**
 *  CharuPaixu.java
 *  Description:
 *  
 *  CreateDate: 2015年6月18日 上午8:39:55 
 * 
 *  @author 马宁波
 */
public class CharuPaixu {

	public static void main(String[] args){
		System.out.println("插入排序");
		int[] a = {1,4,3,7,5,3};
		int length=a.length; //数组长度  
        int j;               //当前值的位置  
        int i;               //指向j前的位置  
        int key;             //当前要进行插入排序的值  
        //从数组的第二个位置开始遍历值  
        for(j=1;j<length;j++){  
            key=a[j];  
            i=j-1;  
            //a[i]比当前值大时，a[i]后移一位,空出i的位置，好让下一次循环的值后移  
            while(i>=0 && a[i]>key){  
                a[i+1]=a[i]; //将a[i]值后移  
                i--;         //i前移  
            }//跳出循环(找到要插入的中间位置或已遍历到0下标)  
            a[i+1]=key;    //将当前值插入  
        }
        for (int k : a) {
			System.out.print(k+",");
		}
	}
}
