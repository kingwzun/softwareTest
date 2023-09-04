package triangle;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import triangle.InvalidTest02;

@RunWith(Suite.class)
// 指定运行器
@Suite.SuiteClasses({
        InvalidTest02.class,
        NotTriangleTest02.class,
        IsRightTriangleTest02.class})
// 指定要测试的类
public class AllTest02 {
//方法体为空即可
}