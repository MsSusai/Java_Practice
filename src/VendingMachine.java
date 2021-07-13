public class VendingMachine
{
    int price = 80;
    int balance;
    int total;

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
        VendingMachine vm = new VendingMachine();
        vm.showPrompt();
        vm.showBalance();
        vm.insertMoney(100);
        vm.getFood();
        vm.showBalance();
    }
}
