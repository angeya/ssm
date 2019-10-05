package sunny.service.impl;

import org.springframework.stereotype.Component;
import sunny.service.IUserService;

@Component
public class UserServiceVipImpl implements IUserService {
    @Override
    public void add() {
        System.out.println("添加会员用户！");
    }
}
