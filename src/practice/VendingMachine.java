package practice;

public class VendingMachine
{
    int price;
    int balance;
    int total;

    VendingMachine()  // 构造函数
    {
        this.total = 0;
    }

    VendingMachine(int price) // 函数重载
    {
//        this(); // 在重载函数中调用构造函数
        this.price = price;
        this.total = 0;
    }

    void showPrompt()
    {
        System.out.println("欢迎光临！");
    }

    void insertMoney(int amount)
    {
        balance += amount;
    }

    void showBalance()
    {
        System.out.println("当前余额为：" + balance);
    }

    void getFood()
    {
        if (balance >= price)
        {
            System.out.println("已出货，请注意查收！");
            balance -= price;
            total += price;
        }
    }


    public static void main(String[] args)
    {
        VendingMachine vm = new VendingMachine(80);
        VendingMachine vm1 = new VendingMachine();
        vm.showPrompt();
        vm.showBalance();
        vm.insertMoney(100);
        vm.getFood();
        vm.showBalance();
    }
}
