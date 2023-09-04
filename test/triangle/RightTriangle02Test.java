package triangle;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class RightTriangle02Test {
    int t[][]=new int[13][3];
    String expected,actual;
    String[] a={"输入无效","输入无效","输入无效","输入无效","输入无效","输入无效","非三角形","非三角形","非三角形","直角三角形","直角三角形","直角三角形 ","一般三角形"};
    @Before
    public void setUp() throws Exception {
        t[0]=new int[]{0,50,50};
        t[1]=new int[]{101,50,50};t[2]=new int[]{50,0,50};
        t[3]=new int[]{50,101,50};t[4]=new int[]{50,50,0};
        t[5]=new int[]{50,50,101};t[6]=new int[]{20,30,50};
        t[7]=new int[]{50,20,30};t[8]=new int[]{30,50,20};
        t[9]=new int[]{30,40,50};t[10]=new int[]{40,50,30};
        t[11]=new int[]{50,30,40};t[12]=new int[]{50,60,100};
    }
    @Test
    public void testInvalid() {
        for(int i=0;i<=5;i++)
        {
            actual= RightTriangle02.judgeTriangle(t[i][0],t[i][1],t[i][2]);
            expected=a[i];
            System.out.println("T["+(i+1)+"]"+"\t"+t[i][0]+"\t"+t[i][1]+"\t"+t[i][2]+"\t"+expected+"\t"+"\t"+actual);
//通过在控制台中打印输出，可以看出遇到第一个断言失败的情况，该测试方法立即结束执行
            assertEquals(expected,actual);
// 增加断言语句assertEquals(Expected,Actual)，验证实际结果与预期结果是否一致，如果一致，继续后面的测试，如果不一致，则抛出异常，结束该测试方法的测试
        }
    }
    @Test
    public void testNotTriangle() {
        for(int i=6;i<=8;i++)
        {
            String actual= RightTriangle02.judgeTriangle(t[i][0],t[i][1],t[i][2]);
            expected=a[i];
            System.out.println("T["+(i+1)+"]"+"\t"+t[i][0]+"\t"+t[i][1]+"\t"+t[i][2
                    ]+"\t"+expected+"\t"+"\t"+actual);
            assertEquals(expected,actual);
        }
    }
    @Test
    public void testIsRightTriangle() {
        for(int i=9;i<=11;i++)
        {
            String actual= RightTriangle02.judgeTriangle(t[i][0],t[i][1],t[i][2]);
            expected=a[i];
            System.out.println("T["+(i+1)+"]"+"\t"+t[i][0]+"\t"+t[i][1]+"\t"+t[i][2]+"\t"+expected+"\t"+"\t"+actual);
            assertEquals(expected,actual);
        }
    }
    @Test
    public void testJudgeTriangle() {
        String actual= RightTriangle02.judgeTriangle(t[12][0],t[12][1],t[12][2]);
        expected=a[12];
        System.out.println("T["+13+"]"+"\t"+t[12][0]+"\t"+t[12][1]+"\t"+t[12][2]+"\t"+expected+"\t"+"\t"+actual);
        assertEquals(expected,actual);
    }
}