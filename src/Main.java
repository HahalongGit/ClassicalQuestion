public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("第一个月的兔子数：");
        int f1 = 1, f2 = 1, f, M = 24;//f2是兔子的总数
        // 斐波那契数列问题
        for (int i = 3; i <= M; i++) {
            f = f2;//保存上一次的总数值
            f2 = f1 + f2;//计算新一个的总数
            f1 = f;//上一次的总数
            System.out.println("M=" + i + "总数是：" + f2);
        }
    }
}
