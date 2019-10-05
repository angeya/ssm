package sunny.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sunny.AppConfig;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class IUserServiceTest {

    //通常使用接口（面向接口），但是会有歧义，因为实现类多时不知道用哪一个实现类
    //解决办法1：在优先级高的实现类上面加@primary注解增加优先级
    //解决办法2：在实现类上面增加@qualifier("类的标识")  限定符  ,在使用接口的地方也使用同样的注解，
    //就可以使用到该实现类了，或者在实现类上面加Component("类的标识")也可以
    //实现类也可以不写类的标识，被Component注解spring自动为其增加限定符为类名（但首字母小写）的标识

    //使用qualifier来选择注入的对象来自哪个实现类
//    @Qualifier("userServiceVipImpl")
//    @Autowired
    //这个是java（JDK）的注解，不是来自spring的注解，可以同时代替Qualifier与Autowired两个注解
    @Resource(name = "userServiceVipImpl")
    private IUserService userService;

    @Test
    public void testAdd(){
        userService.add();
    }
}
