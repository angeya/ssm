package annotation1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//组件扫描，被注解为Component的类会自动创建对象
public class App {
    public static void main(String[] args) {
//        System.out.println("普通方案");
//        MsgService sunny.service = new MsgService();
//        MsgPrinter printer = new MsgPrinter();
        System.out.println("Spring注解");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnnotationConfig.class);

//        MsgService sunny.service = applicationContext.getBean(MsgService.class);//已经创建成功了，不用获取
        MsgPrinter printer = applicationContext.getBean(MsgPrinter.class);
//        printer.setMsgService(sunny.service);//由注解@AutoWired自动调用
        printer.printMsg();
    }
}
