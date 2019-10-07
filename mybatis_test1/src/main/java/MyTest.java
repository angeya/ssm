import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pojo.Dept;
import pojo.User;

import java.io.IOException;
import java.io.Reader;
import java.util.Date;

public class MyTest {
    private Reader reader = null;
    private SqlSession sqlSession = null;

    @Test
    public void addDeptByString(){
        try {
            sqlSession.insert("dept.addDeptByString","人事部");
            Dept dept = new Dept();
            dept.setDeptname("销售部");
            sqlSession.insert("dept.addDeptByObject",dept.getDeptname());

            sqlSession.commit();
        } catch (Exception e) {
                sqlSession.rollback();
            e.printStackTrace();
        }
    }
    @Test
    public void addDeptByObject(){
        Reader reader = null;
        SqlSession sqlSession = null;
        Dept dept = new Dept();
        dept.setDeptname("开心俱乐部");
        try {
//            sqlSession.insert("dept.addDeptByObject",dept.getDeptname());
//            传入对象，而不是属性
            sqlSession.insert("dept.addDeptByObjectGetId",dept);
            sqlSession.commit();
        } catch (Exception e) {
            sqlSession.rollback();
            e.printStackTrace();
        }
    }
    @Test
    public void print(){
        System.out.println("test没有问题！");
    }
    @Test
    public void addUserByObject(){
        User user = new User();
        user.setName("黄蝶蝶");
        user.setAge(22);
        user.setDate(new Date());
        user.setDeptid(2);
        try {
            sqlSession.insert("user.addUserByObject", user);
            sqlSession.commit();
        }catch (Exception e){
            sqlSession.rollback();
            e.printStackTrace();
        }
    }
    @Before
    public void prepare(){
        try {
            //读取mybatis的数据库源配置
            reader= Resources.getResourceAsReader("mybatisConfig.xml");
            //创建连接会话，类似jdbc的connection对象，首先获取工厂，才能开启session
            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
            //通过sqlSession可以进行增删改查了，但是在mybatis中必须添加事务
            sqlSession = sessionFactory.openSession();
        }catch (IOException e){
            sqlSession.rollback();
            e.printStackTrace();
        }
    }
    @Test
    public void updateUserByObject(){
        User user = new User();
        user.setId(2);
        user.setName("黄蝶蝶");
        user.setAge(33);
        user.setDate(new Date());
        user.setDeptid(999);
        try{
            sqlSession.update("user.updateUserByObject",user);
            sqlSession.commit();
        }catch (Exception e){
            sqlSession.rollback();
        }
    }
    @After
    public void close(){
        sqlSession.close();
        try {
            if (reader != null){
                reader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
