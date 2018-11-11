// 汉诺塔的实现

package others;

public class Hanoi {
    public static void main(String[] args) {
        int number = 3;
        move(number, 'A', 'B', 'C');
    }

    static void move(int topN, char start, char buffer, char end) {
        if (topN >= 2) {
            move(topN -1, start, end, buffer);
            System.out.println("Move " + topN + " from " + start + " to " + end);
            move(topN -1, buffer, start, end);
        } else {
            System.out.println("Move " + topN + " from " + start + " to " + end);
        }
    }
}