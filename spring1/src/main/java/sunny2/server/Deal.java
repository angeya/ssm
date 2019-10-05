package sunny2.server;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sunny2.dao.Save;

public class Deal {
    public void computing(double money){
        money = money * 1.25;

        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("ApplicationConfig.xml");

        Save save = new Save();
        save.saveMoney(money);
    }
}
