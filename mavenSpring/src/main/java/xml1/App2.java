package xml1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//组件扫描，被注解为Component的类会自动创建对象
public class App2 {
    public static void main(String[] args) {
        System.out.println("Spring xml配置文件");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationConfig.xml");

//        MsgService sunny.service = applicationContext.getBean(MsgService.class);//已经创建成功了，不用获取
        MsgPrinter printer = (MsgPrinter) applicationContext.getBean("printer");
        printer.printMsg();
    }
}
