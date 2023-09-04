package Meeting02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class MeetingReservation02 {
    public static String order(String subject,String DDate,String DTime,String duration,String method,String pwd,String number)throws ParseException{
        String msg="";
        if(!IsNull(subject)){
            if(IsNull(DDate)==true||IsNull(DTime)==true||ValidDate(DDate,DTime)==false){
                if(ValidDuration(duration)==true) {
                    if(method.equals("无")||method.equals("密码")){
                        if(method.equals("密码")){
                            if(IsNull(pwd)==true||ValidPWD(pwd)==false){
                                msg="密码无效";
                                return msg;
                            }
                        }
                        if(ValidNum(number))
                            msg="预定成功";
                        else
                            msg="人数无效";
                    }
                    else
                        msg="方式无效";
                }
                else
                    msg="时长无效";
            }else
                msg="时间无效";
        }else
            msg="主题无效";
        return msg;
    }
    public static boolean IsNull(String a){
        if(a!=null)
            return false;
        else
            return true;
    }

    public static boolean ValidDuration(String duration){
        String regex="[0-9]+";
        if(duration.matches(regex)&&Integer.valueOf(duration)>15&&Integer.valueOf(duration)<100)
            return true;
        else
            return false;
    }
    public static boolean ValidPWD(String pwd){
        String regex="[0-9]{3,7}$";
        if(pwd.matches(regex))
            return true;
        else
            return false;
    }
    public static boolean ValidNum(String num){
        String regex="[0-9]+";
        if(num.matches(regex)&&Integer.valueOf(num)>=0)
            return true;
        else
            return false;
    }
    public static boolean ValidDate(String d,String t) throws ParseException{
        String dd=d+" "+t+":00";
        Date Odate=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dd);
        Date n=new Date();
        if(n.after(Odate))
            return true;
        else
            return false;
    }

    public static void main(String[] args) throws ParseException {
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

        String str = "编号" + "\t\t" + "会议主题" + "\t" + "开始日期" +"\t\t" +"开始时间" + "\t" + "时长" + "\t" + "入会方式" + "\t\t" + "密码" + "\t\t" + "入会人数上限" + "\t" + "预期输出" + "\t\t" + "实际输出" + "\t\t" + "测试结果";
        System.out.println(str);
        //现在的需求就是返回对应的字符串并输出
        String[][] arr1 = new String[][]{res1, res2, res3, res4, res5, res6, res7, res8, res9, res10, res11, res12, res13};
        String[] arr2 = {"主题无效", "时间无效", "时长无效", "时长无效", "时长无效", "方式无效", "方式无效", "方式无效", "方式无效", "人数无效", "人数无效", "预定成功", "预定成功"};
        String expected, actual, result;
        for (int i = 0; i < 13; i++) {
            expected = arr2[i];
            actual = order(arr1[i][0], arr1[i][1], arr1[i][2], arr1[i][3], arr1[i][4], arr1[i][5], arr1[i][6]);

            if (expected.equals(actual)) {
                result = "Passed";
            } else {
                result = "Failed";
            }
            System.out.println("T[" + (i + 1) + "]" + "\t" + arr1[i][0] + "\t\t" + arr1[i][1] + "\t " + arr1[i][2] + "\t" + arr1[i][3] + "\t" + arr1[i][4] + "\t\t\t" + arr1[i][5] + "\t\t" + arr1[i][6] + "\t\t\t" + expected + "\t\t" + actual + "\t\t" + result);
        }
    }
}

