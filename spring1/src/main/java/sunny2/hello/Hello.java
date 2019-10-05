package sunny2.hello;

import sunny2.server.Deal;

public class Hello {
    public static void main(String[] args) {
        double userMoney = 30;
        System.out.println("你好，这里是sunny2银行！输入你要存的金额为" + userMoney + "元");
        Deal deal = new Deal();
        deal.computing(userMoney);
    }
}
