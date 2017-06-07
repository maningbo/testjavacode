package algorithm.sort;

import java.util.Arrays;

/**
 *  InsertionSorting.java<br>
 *  Description:<br>
 *  插入排序<br>
 *  CreateDate: 2017年6月7日 下午9:24:31
 *  @author 马宁波
 */
public class InsertionSorting {
	public static void main(String[] args) {
		int[] a = {2,4,2,5,1,3};
		System.out.println(Arrays.toString(a));
		a = InsertionSorting.sort(a);
		System.out.println(Arrays.toString(a));
	}
	
	public static int[] sort(int[] a){
		if(null == a || a.length<=1){//如果传入数组为空或者长度小于2则直接返回
			return a;
		}
		int aL = a.length;
		if(a[0]>a[1]){//首先保证前两个元素有序
			int temp = a[0];
			a[0] = a[1];
			a[1] = temp;
		}
		for(int i=2;i<aL;i++){//从第三个元素开始遍历
			int temp = a[i];
			if(temp<=a[0]){//如果元素小于等于已排序的第一个元素，则将该元素放到第一位
				for(int j=i;j>0;j--){//逆向遍历当前元素到第二个元素，正向遍历的时候要实现元素移位需要中间变量
					a[j] = a[j-1];//后一个元素设置为前一个元素的值
				}
				a[0] = temp;//将该元素放到第一位
			}else if(temp>=a[i-1]){//如果元素大于等于已排序的最后一位，无需处理，已经是排好序的
				continue;
			}else{//如果元素位于第一位也最后一位中间，则判断元素位于哪两个元素中间，找到区间后将给元素插入到这两个元素中间（即将该元素作为两个元素中的后一个，将之后的元素往后移一位）
				for(int j=0;j<i;j++){
					if(temp>=a[j] && temp<=a[j+1]){//将两个元素中的后一个元素之后的元素往后移一位
						for(int k=i;k>j+1;k--){
							a[k] = a[k-1];
						}
						a[j+1] = temp;//将该元素作为两个元素中的后一个元素
						break;//由于已经排好序的，所以找到区间后无需继续查找
					}
				}
			}
		}
		return a;
	}
}
