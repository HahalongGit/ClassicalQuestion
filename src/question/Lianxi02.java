package question;

/**
 * 题目：判断101-200之间有多少个素数，并输出所有素数。
 * 程序分析：判断素数的方法：用一个数分别去除2到sqrt(这个数)，
 * 如果能被整除， 则表明此数不是素数，反之是素数。 
 *
 * 质数(prime number)又称素数，有无限个。一个大于1的自然数，除了1和它本身外，
 * 不能被其他自然数整除，换句话说就是该数除了1和它本身以外不再有其他的因数;否则称为合数。 
 */
public class Lianxi02 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int count = 0;
        for (int i = 101; i <= 200; i += 2) {
            boolean isSushu = false;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isSushu = false;
                    break;//不是素数跳出循环
                } else {
                    isSushu = true;
                }
            }
            if (isSushu) {
                count++;
                System.out.println("素数有" + count + ",是：" + i);
            }
        }

    }
}
