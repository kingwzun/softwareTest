package Meeting02;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ValidDateTest02wjj {

    private boolean expected;
    private String d;
    private  String t;

    public ValidDateTest02wjj(boolean expected, String d, String t) {
        this.expected = expected;
        this.d = d;
        this.t = t;
    }
    @Parameterized.Parameters
    public static Collection prepareData(){
    //该二维数组的类型必须是 Object 类型
    //该二维数组中的数据是为测试 RightTriangle 中的 Invalid()方法而准备的//该二维数组中的每一个元素中的数据都对应着构造方法 InvalidTest()中的参数的位置
    //具体使用规则，可参考 JUnit4 的 API 文档中的org.junit.runners.Parameterized 类的说明
        Object[][] object = {
//                ValidDateTest02wjj测试的时间
//                {true,"2023-4-13","17:14"},
//                {false,"2023-4-13","17:15"}

                //AllTest测试的时间
                {true,"2023-4-13","17:33"},
                {false,"2023-4-13","17:34"}

        };
        return Arrays.asList(object);
    }
    @Test
    public void testInvalid() throws ParseException {
        assertEquals(expected, MeetingReservation02.ValidDate(d,t));
    }
}
