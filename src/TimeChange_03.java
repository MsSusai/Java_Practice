import java.util.Scanner;

public class TimeChange_03
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("输入北京时间：");
        int time = in.nextInt();
        int minute = time % 100;
        int hour = time / 100;
//        System.out.println(minute);
//        System.out.println(hour);
        if (hour < 24 && minute < 60 && minute >= 0)
        {
            if (hour >= 8)
            {
                hour -= 8;
            }
            else
            {
                hour = 24 + (hour - 8);
            }
            System.out.println("国际标准时间为：" + hour + minute);
        }
        else
        {
            System.out.println("时间输入有误！");
        }
    }
}
