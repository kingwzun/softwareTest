package triangle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class IsRightTriangleTest02 {
    private boolean expected;
    private int a;
    private int b;
    private int c;
    public IsRightTriangleTest02(boolean expected, int a, int b, int c){
        this.expected = expected;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Parameterized.Parameters
    public static Collection prepareData(){
        Object[][] object = {{false,30,40,60}, {true,30,40,50},
                {true,40,50,30}, {true,50,30,40}};
        return Arrays.asList(object);
    }
    @Test
    public void testIsRightTriangle() {
        assertEquals(expected, RightTriangle02.IsRightTriangle(a, b, c));
    }
}

