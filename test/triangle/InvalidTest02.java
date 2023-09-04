package triangle;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class InvalidTest02 {
    private boolean expected;
    private int a; private int b; private int c;
    public InvalidTest02(boolean expected, int a, int b, int c) {
        this.expected = expected;
        this.a = a; this.b = b;this.c = c;
    }

    @Parameterized.Parameters
    public static Collection prepareData() {
//该二维数组的类型必须是 Object 类型
//该二维数组中的数据是为测试 RightTriangle 中的 Invalid()方法而准备的
//该二维数组中的每一个元素中的数据都对应着构造方法 InvalidTest()中的参数的位置
//具体使用规则，可参考 JUnit4 的 API 文档中的org.junit.runners.Parameterized 类的说明
        Object[][] object = {{true, 0, 50, 50}, {true, 101, 50, 50},
                {true, 50, 0, 50}, {true, 50, 101, 50}, {true, 50, 50, 0}, {true, 50, 50, 101},
                {false, 1, 50, 50}};
        return Arrays.asList(object);
    }

    @Test
    public void testInvalid() {
        assertEquals(expected, RightTriangle02.Invalid(a, b, c));
    }
}
