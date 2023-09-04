package Meeting02;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class IsNullTest02yjr {
    private boolean expected;
    private String a;

    public IsNullTest02yjr(boolean expected, String a) {
        this.expected = expected;
        this.a = a;
    }
    @Parameterized.Parameters
    public static Collection prepareData(){
//该二维数组的类型必须是 Object 类型
//该二维数组中的数据是为测试 RightTriangle 中的 Invalid()方法而准备的
//该二维数组中的每一个元素中的数据都对应着构造方法 InvalidTest()中的参数的位置
//具体使用规则，可参考 JUnit4 的 API 文档中的org.junit.runners.Parameterized 类的说明
        Object[][] object = {{false,""}, {true,"班会"}};
        return Arrays.asList(object);
    }
    @Test
    public void testInvalid() {
        assertEquals(expected, MeetingReservation02.IsNull(a));
    }


}
