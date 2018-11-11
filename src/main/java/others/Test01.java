/**
 * 这才是真正的选择排序
 *
 * @author 王少刚
 * @create 2018-10-23 22:02
 */
package others;

import com.wangshaogang.utils.Print;

public class Test01 {
	public static void main(String[] args) {
		int[] ints = {7, 1, 4, 2, 8, 5, 1};
		for (int i = 0; i < ints.length; i++) {
			int temp = i;
			for (int j = i; j < ints.length; j++) {
				if (ints[j] < ints[temp]) {
					temp = j;
				}
			}
			int temp2 = ints[i];
			ints[i] = ints[temp];
			ints[temp] = temp2;
		}
		Print.print(ints);
	}
}
