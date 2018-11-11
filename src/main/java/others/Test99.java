// 对齐的乘法口诀表
package others;

import java.util.Scanner;

public class Test99 {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                int length = ("" + number).length() + ("" + j * number).length() + ("" + j).length() + 2;
                System.out.print(appendRight(j + "*" + i + "=" + i * j, length + 2));
            }
            System.out.println();
        }
    }

    /**
     * 在字符串右边添加空格，直到长度达到要求
     * @param string
     * @param number
     * @return
     */
    public static String appendRight(String string, int number) {
        String newString = string;
        if (string.length() >= number) {
            return newString;
        }
        for (int i = 0; i < number - string.length(); i++) {
            newString += " ";
        }
        return newString;
    }
}
