package sunny.service.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import sunny.dao.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sunny.service.IUserService;

//注解的时候注解在实现类，而不是接口
@Component
@Qualifier("l")
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public void add() {
        System.out.println("添加用户");
        userDao.add();
    }
}
