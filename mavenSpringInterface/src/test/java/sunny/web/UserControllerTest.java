package sunny.web;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sunny.AppConfig;


public class UserControllerTest {

    @Autowired
    private UserController userController;

    @Test
    public void testAdd(){
        userController.add();
    }
}
