public class M0065不用加减乘除做加法 {
    public int add01(int a, int b) {
        while (b != 0) {
            int s = a ^ b;
            b = (a & b) << 1;
            a = s;
        }
        return a;
    }

    public int add02(int a, int b) {
        if (b == 0) return a;
        return add02(a ^ b, (a & b) << 1);
    }
}
