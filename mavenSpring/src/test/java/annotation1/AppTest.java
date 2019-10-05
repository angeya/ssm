//编译的时候该包下的文件与java包下的文件会编译到一起，maven只是为了分模块所以前端这么显示
package annotation1;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//自动初始化spring的上文环境
@RunWith(SpringJUnit4ClassRunner.class)
//使用AnnotationConfig.class来扫描组件，可以不用显式地实例化applicationContext
@ContextConfiguration(classes = AnnotationConfig.class)
public class AppTest {
    //由于已将读取过注解配置类了，所以可以直接使用Autowired进行自动装配
    @Autowired
    private MsgPrinter printer;

    @Test
    public void testPrint(){
        printer.printMsg();
    }


}
