package Meeting02;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
@RunWith(Parameterized.class)
public class ValidDurationTest02wwz {
    private boolean expected;
    private String duration;

    public ValidDurationTest02wwz(boolean expected, String duration) {
        this.expected = expected;
        this.duration = duration;
    }


    @Parameterized.Parameters
    public static Collection prepareData(){
//该二维数组的类型必须是 Object 类型
//该二维数组中的数据是为测试 RightTriangle 中的 Invalid()方法而准备的
//该二维数组中的每一个元素中的数据都对应着构造方法 InvalidTest()中的参数的位置
//具体使用规则，可参考 JUnit4 的 API 文档中的org.junit.runners.Parameterized 类的说明
        Object[][] object = {{false,"60.5"},{false,"14"},{false,"101"},{true,"15"}};
        return Arrays.asList(object);
    }
    @Test
    public void testInvalid() {
        assertEquals(expected, MeetingReservation02.ValidDuration(duration));
    }
}
