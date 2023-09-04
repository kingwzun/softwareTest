package Meeting02;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ValidPWDTest02yjr {
    private boolean expected;
    private String pwd;

    public ValidPWDTest02yjr(boolean expected, String pwd) {
        this.expected = expected;
        this.pwd = pwd;
    }
    @Parameterized.Parameters
    public static Collection prepareData(){
//该二维数组的类型必须是 Object 类型
//该二维数组中的数据是为测试 RightTriangle 中的 Invalid()方法而准备的
//该二维数组中的每一个元素中的数据都对应着构造方法 InvalidTest()中的参数的位置
//具体使用规则，可参考 JUnit4 的 API 文档中的org.junit.runners.Parameterized 类的说明
        Object[][] object = {{false,"1234#"},{false,"123"}, {false,"1234567"},{true,"12345"}};
        return Arrays.asList(object);
    }
    @Test
    public void validPWD() {
        assertEquals(expected, MeetingReservation02.ValidPWD(pwd));
    }
}