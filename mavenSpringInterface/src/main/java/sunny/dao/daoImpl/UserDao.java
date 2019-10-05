package sunny.dao.daoImpl;

import sunny.dao.IUserDao;
import org.springframework.stereotype.Component;

@Component
public class UserDao implements IUserDao {
    @Override
    public void add() {
        System.out.println("添加用户到数据库！");
    }
}
