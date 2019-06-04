package question;

/**
 * 题目：打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。
 * 例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方。
 */
public class Lianxi03 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        for (int i = 101; i < 1000; i++) {
            int a, b, c;
            a = i / 100;//百位
            b = (i / 10) % 10;//十位
            c = i % 10;//各位
            if (a * a * a + b * b * b + c * c * c == i) {
                System.out.println("a=" + a + ",b=" + b + ",c=" + c);
                System.out.println("i==" + i);
            }
        }

    }


}
