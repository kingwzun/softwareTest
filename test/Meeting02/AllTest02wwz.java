package Meeting02;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;




@RunWith(Suite.class)
// 指定运行器
@Suite.SuiteClasses({
        IsNullTest02yjr.class,
        ValidDateTest02wjj.class,
        ValidDurationTest02wwz.class,
        ValidPWDTest02yjr.class,
        ValidNumTest02wwz.class

})
// 指定要测试的类
public class AllTest02wwz {
}
