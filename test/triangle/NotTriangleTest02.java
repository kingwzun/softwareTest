package triangle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
@RunWith(Parameterized.class)
public class NotTriangleTest02 {
    private boolean expected;
    private int a;
    private int b;
    private int c;
    public NotTriangleTest02(boolean expected, int a, int b, int c){
        this.expected = expected;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Parameters
    public static Collection prepareData(){
        Object[][] object = {{true,20,30,50}, {true,50,20,30},
                {true,30,50,20}, {false,1,50,50}};
        return Arrays.asList(object);
    }
    @Test
    public void testNotTriangle() {
        assertEquals(expected, RightTriangle02.NotTriangle(a, b, c));
    }
}
