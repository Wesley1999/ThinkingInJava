/**
 * @author 王少刚
 * @create 2019-01-19 22:20
 */
package others;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test20190119 {
	public static void main(String[] args) {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		System.out.println(sdf.format(d));
	}
}
