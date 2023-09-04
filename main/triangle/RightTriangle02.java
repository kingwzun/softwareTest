package triangle;

public class RightTriangle02 {
    public static String judgeTriangle(int a, int b, int c) {
        if (!Invalid(a, b, c)) {
            if (!NotTriangle(a, b, c)) {
                if (IsRightTriangle(a, b, c))
                    return "直角三角形";
                else
                    return "一般三角形";
            } else
                return "非三角形";
        } else
            return "输入无效";
    }

    public static boolean Invalid(int a, int b, int c) {
        if (a > 1 && a < 100 && b > 1 && b < 100 && c > 1 && c < 100) //将>=错误的写成了>，<= 错误的写成了<
            return false;
        else
            return true;
    }

    public static boolean NotTriangle(int a, int b, int c) {
        if ((long) a + b >= c && (long) b + c >= a && (long) a + c >= b) //将>错误的写成 了>=
            return false;
        else
            return true;
    }

    public static boolean IsRightTriangle(int a, int b, int c) {
        if (a * a + b * b == c * c && b * b + c * c == a * a && a * a + c * c == b * b) //将逻辑或错误的写成了逻辑与
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int t[][] = new int[13][3];
        t[0] = new int[]{0, 50, 50};
        t[1] = new int[]{101, 50, 50};
        t[2] = new int[]{50, 0, 50};
        t[3] = new int[]{50, 101, 50};
        t[4] = new int[]{50, 50, 0};
        t[5] = new int[]{50, 50, 101};
        t[6] = new int[]{20, 30, 50};
        t[7] = new int[]{50, 20, 30};
        t[8] = new int[]{30, 50, 20};
        t[9] = new int[]{30, 40, 50};
        t[10] = new int[]{40, 50, 30};
        t[11] = new int[]{50, 30, 40};
        t[12] = new int[]{50, 60, 100};
        String[] a = {"输入无效", "输入无效", "输入无效", "输入无效", "输入无效", " 输入无效", "非三角形", "非三角形", "非三角形", "直角三角形", "直角三角形", "直角三 角形", "一般三角形"};
        String expected, actual, result;
        System.out.println("编号" + "\t" + "a" + "\t" + "b" + "\t" + "c" + "\t" + "预期输出 " + "\t" + "\t" + "实际输出" + "\t" + "\t" + "测试结果");
        for (int i = 0; i <= 12; i++) {
            expected = a[i];
            actual = judgeTriangle(t[i][0], t[i][1], t[i][2]);
            if (expected.equals(actual))
                result = "Passed";
            else
                result = "Failed";
            System.out.println("T[" + (i + 1) + "]" + "\t" + t[i][0] + "\t" + t[i][1] + "\t" + t[i][2
                    ] + "\t" + expected + "\t" + "\t" + actual + "\t" + result);
        }
    }
}
