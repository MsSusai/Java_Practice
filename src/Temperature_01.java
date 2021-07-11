import java.util.Scanner;

//温度转换（5分）
public class Temperature_01
{
    public static void main(String[] args)
    {
        int f;
        double c;
        Scanner in = new Scanner(System.in);
        f = in.nextInt();
        c = (f - 32) / (9.0 / 5.0);
        System.out.println((int) c);
    }
}
