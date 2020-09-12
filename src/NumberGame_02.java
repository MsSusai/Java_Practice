import java.util.Scanner;

public class NumberGame_02 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String playAgain = "";
        do {
            int number = (int)(Math.random()*100+1);
            int guess = 0;
            while (number != guess){
                System.out.println("输入猜的数");
                guess = scan.nextInt();
                if (guess > number)
                    System.out.println("你的猜数是" + guess + "猜大了");
                else if (guess < number)
                    System.out.println("你的猜数是" + guess + "猜小了");
                else
                    System.out.println("答案是"+ guess + "猜对了");
            }
            System.out.println("想再来一局吗？(y/n)");
            playAgain = scan.next();
        }while (playAgain.equalsIgnoreCase("y"));
        System.out.println("再见！");
        scan.close();
    }
}
