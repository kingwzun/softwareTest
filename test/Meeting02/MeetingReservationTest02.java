package Meeting02;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;

public class MeetingReservationTest02 {
    String[][] arr1;
    String expected,actual;
    String[] arr2 = {"主题无效", "时间无效", "时长无效", "时长无效", "时长无效", "方式无效", "方式无效", "方式无效", "方式无效", "人数无效", "人数无效", "预定成功", "预定成功"};
    @Before
    public void setUp() throws Exception {
        String[] res1 = {"", "2023-4-14", "12:00", "50", "无", "", "100"};             //主题无效
        String[] res2 = {"班会", "2023-4-7", "8:00", "50", "无", "", "100"};         //时间无效
        String[] res3 = {"班会", "2023-4-14", "12:00", "50.5", "无", "", "100"};     //时长无效
        String[] res4 = {"班会", "2023-4-14", "12:00", "14", "无", "", "100"};       //时长无效
        String[] res5 = {"班会", "2023-4-14", "12:00", "101", "无", "", "100"};      //时长无效
        String[] res6 = {"班会", "2023-4-14", "12:00", "50", "", "", "100"};        //方式无效
        String[] res7 = {"班会", "2023-4-14", "12:00", "50", "密码", "1234#", "100"}; //方式无效
        String[] res8 = {"班会", "2023-4-14", "12:00", "50", "密码", "123", "100"};   //方式无效
        String[] res9 = {"班会", "2023-4-14", "12:00", "50", "密码", "1234567", "100"};   //方式无效
        String[] res10 = {"班会", "2023-4-14", "12:00", "50", "密码", "123", "0"};   //人数无效
        String[] res11 = {"班会", "2023-4-14", "12:00", "50", "密码", "123", "8.5"};   //人数无效
        String[] res12 = {"班会", "2023-4-14", "12:00", "15", "无", "", "100"};   //预定成功
        String[] res13 = {"班会", "2023-4-14", "12:00", "100", "无", "", "100"};   //预定成功
        arr1 = new String[][]{res1, res2, res3, res4, res5, res6, res7, res8, res9, res10, res11, res12, res13};
    }
    @Test
    public void testIsNull() throws ParseException {

            actual= MeetingReservation02.order(arr1[0][0],arr1[0][1],arr1[0][2],arr1[0][3],arr1[0][4],arr1[0][5],arr1[0][6]);
            expected=arr2[0];
            System.out.println("T[1]"+"\t"+arr1[0][0]+"\t"+arr1[0][1]+"\t"+arr1[0][2]+"\t"+arr1[0][3]+"\t"+arr1[0][4]+"\t"+arr1[0][5]+"\t"+arr1[0][6]+"\t"+expected+"\t"+"\t"+actual); //通过在控制台中打印输出，可以看出遇到第一个断言失败的情况，该测试方法立即结束执行
            assertEquals(expected,actual); // 增加断言语句assertEquals(Expected,Actual)，验证实际结果与预期结果是否一致，如果一致，继续后面的测试，如果不一致，则抛出异常，结束该测试方法的测试
        }
    @Test
    public void testValidDate() throws ParseException {
        actual= MeetingReservation02.order(arr1[1][0],arr1[1][1],arr1[1][2],arr1[1][3],arr1[1][4],arr1[1][5],arr1[1][6]);
        expected=arr2[1];
        System.out.println("T[2]"+"\t"+arr1[1][0]+"\t"+arr1[1][1]+"\t"+arr1[1][2]+"\t"+arr1[1][3]+"\t"+arr1[1][4]+"\t"+arr1[1][5]+"\t"+arr1[1][6]+"\t"+expected+"\t"+"\t"+actual); //通过在控制台中打印输出，可以看出遇到第一个断言失败的情况，该测试方法立即结束执行
        assertEquals(expected,actual); // 增加断言语句assertEquals(Expected,Actual)，验证实际结果与预期结果是否一致，如果一致，继续后面的测试，如果不一致，则抛出异常，结束该测试方法的测试

    }
    @Test
    public void testValidDuration() throws ParseException {
        for (int i = 2; i <= 4 ; i++){
            actual= MeetingReservation02.order(arr1[i][0],arr1[i][1],arr1[i][2],arr1[i][3],arr1[i][4],arr1[i][5],arr1[i][6]);
            expected=arr2[i];
            System.out.println("T["+(i+1)+"]"+"\t"+arr1[i][0]+"\t"+arr1[i][1]+"\t"+arr1[i][2]+"\t"+arr1[i][3]+"\t"+arr1[i][4]+"\t"+arr1[i][5]+"\t"+arr1[i][6]+"\t"+expected+"\t"+"\t"+actual); //通过在控制台中打印输出，可以看出遇到第一个断言失败的情况，该测试方法立即结束执行
            assertEquals(expected,actual); // 增加断言语句assertEquals(Expected,Actual)，验证实际结果与预期结果是否一致，如果一致，继续后面的测试，如果不一致，则抛出异常，结束该测试方法的测试
        }
    }
    @Test
    public void testValidPWD() throws ParseException {
        for (int i = 5; i <= 8 ; i++){
            actual= MeetingReservation02.order(arr1[i][0],arr1[i][1],arr1[i][2],arr1[i][3],arr1[i][4],arr1[i][5],arr1[i][6]);
            expected=arr2[i];
            System.out.println("T["+(i+1)+"]"+"\t"+arr1[i][0]+"\t"+arr1[i][1]+"\t"+arr1[i][2]+"\t"+arr1[i][3]+"\t"+arr1[i][4]+"\t"+arr1[i][5]+"\t"+arr1[i][6]+"\t"+expected+"\t"+"\t"+actual); //通过在控制台中打印输出，可以看出遇到第一个断言失败的情况，该测试方法立即结束执行
            assertEquals(expected,actual); // 增加断言语句assertEquals(Expected,Actual)，验证实际结果与预期结果是否一致，如果一致，继续后面的测试，如果不一致，则抛出异常，结束该测试方法的测试
        }
    }
    @Test
    public void testValidNum() throws ParseException {
        for (int i = 9; i <= 10 ; i++){
            actual= MeetingReservation02.order(arr1[i][0],arr1[i][1],arr1[i][2],arr1[i][3],arr1[i][4],arr1[i][5],arr1[i][6]);
            expected=arr2[i];
            System.out.println("T["+(i+1)+"]"+"\t"+arr1[i][0]+"\t"+arr1[i][1]+"\t"+arr1[i][2]+"\t"+arr1[i][3]+"\t"+arr1[i][4]+"\t"+arr1[i][5]+"\t"+arr1[i][6]+"\t"+expected+"\t"+"\t"+actual); //通过在控制台中打印输出，可以看出遇到第一个断言失败的情况，该测试方法立即结束执行
            assertEquals(expected,actual); // 增加断言语句assertEquals(Expected,Actual)，验证实际结果与预期结果是否一致，如果一致，继续后面的测试，如果不一致，则抛出异常，结束该测试方法的测试
        }
    }
    @Test
    public void testOrder() throws ParseException {
        for (int i = 11; i <= 12 ; i++){
            actual= MeetingReservation02.order(arr1[i][0],arr1[i][1],arr1[i][2],arr1[i][3],arr1[i][4],arr1[i][5],arr1[i][6]);
            expected=arr2[i];
            System.out.println("T["+(i+1)+"]"+"\t"+arr1[i][0]+"\t"+arr1[i][1]+"\t"+arr1[i][2]+"\t"+arr1[i][3]+"\t"+arr1[i][4]+"\t"+arr1[i][5]+"\t"+arr1[i][6]+"\t"+expected+"\t"+"\t"+actual); //通过在控制台中打印输出，可以看出遇到第一个断言失败的情况，该测试方法立即结束执行
            assertEquals(expected,actual); // 增加断言语句assertEquals(Expected,Actual)，验证实际结果与预期结果是否一致，如果一致，继续后面的测试，如果不一致，则抛出异常，结束该测试方法的测试
        }
    }
    }
