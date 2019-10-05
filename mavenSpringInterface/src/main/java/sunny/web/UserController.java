package sunny.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import sunny.service.IUserService;

@Component
public class UserController {

    @Autowired
    @Qualifier("userServiceImpl")
    private IUserService userService;

    public void add(){

        System.out.println("网页控制器调用服务");
        userService.add();
    }
}
