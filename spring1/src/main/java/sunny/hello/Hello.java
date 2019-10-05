package sunny.hello;

import sunny.server.Deal;

public class Hello {
    public static void main(String[] args) {
        double userMoney = 30;
        System.out.println("你好，这里是银行！输入你要存的金额为" + userMoney + "元");
        Deal deal = new Deal();
        deal.computing(userMoney);
    }
}
