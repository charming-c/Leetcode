package January_2021;

//斐波那契数，通常用 F(n) 表示，形成的序列称为 斐波那契数列 。该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和。也就是：
//
//        F(0) = 0，F(1) = 1
//        F(n) = F(n - 1) + F(n - 2)，其中 n > 1
//        给你 n ，请计算 F(n) 。

public class FibonacciNumber_509 {
    // 不用递归，而是很简单的动态规划，这样循环一次就能记录上次的值了，利用迭代很方便
    public int fib(int n) {
        if(n < 2) return n;
        int[] a = new int[3];
        a[0] = 0;
        a[1] = 1;
        for(int i = 2; i<=n; i++){
            a[2] = a[0] +a[1];
            a[0] = a[1];
            a[1] = a[2];
        }
        return a[2];
    }
}
