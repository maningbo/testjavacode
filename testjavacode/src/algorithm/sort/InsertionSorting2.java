package algorithm.sort;
/**
 *  InsertionSorting2.java<br>
 *  Description:<br>
 *  插入排序，比InsertionSorting简单一点的写法<br>
 *  CreateDate: 2018年1月28日 下午2:59:20
 *  @author 马宁波
 */
public class InsertionSorting2 {
    public static void main(String[] args) {
        int[] a = {5,4,2,8,9,1,3};
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            int j;
            for (j = i - 1; j >=0; j--) {
                if(a[j]>=temp) {
                    a[j+1] = a[j];
                }else {
                    break;
                }
            }
            a[j+1] = temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
