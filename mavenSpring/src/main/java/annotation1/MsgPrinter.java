package annotation1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//被注解为组件，当注解扫描类被ApplicationContext实例化执行的时候，组件会执行构造方法创建对象
@Component
public class MsgPrinter {
    public MsgPrinter() {
        System.out.println("MsgPrinter无参构造方法...");
    }
    //构造方法注入效率高
    @Autowired
    public MsgPrinter(Ink ink) {
        System.out.println("MsgPrinter有参构造方法...");
        this.ink = ink;
    }

    //建立printer与service的关联关系：使用service作为printer的成员变量
    private Ink ink;

    //成员变量注入，方便但效率低
//    @Autowired
//    private Power power;

    private Power power;
    @Autowired
    private void preparePower(Power power){
        System.out.println("被@Autowired修饰而自动执行的注入方法");
        this.power = power;
    }

    private MsgService msgService;
    //set注入   所有的Autowired注解都可以添加requred属性，当不用注意依赖的时候，设置为false，默认为true
    @Autowired(required = false)
    public void setMsgService(MsgService msgService) {
        this.msgService = msgService;
    }

    public void printMsg(){
        power.getPower();
        if (msgService != null){
            System.out.println(msgService.getMsg());
        }

    }
}
