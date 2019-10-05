import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.sql.*;

public class MyTest {
    @Test
    public void testDao(){

        Reader reader = null;
        SqlSession sqlSession = null;
        try {
            //读取mybatis的数据库源配置
            reader= Resources.getResourceAsReader("mybatisConfig.xml");
            //创建连接会话，类似jdbc的connection对象，首先获取工厂，才能开启session
            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
            sqlSession = sessionFactory.openSession();
            //通过sqlSession可以进行增删改查了，但是在mybatis中必须添加事务
            sqlSession.insert("DEPT.addDept","技术部");
            sqlSession.commit();
        } catch (IOException e) {
                sqlSession.rollback();
            e.printStackTrace();
        }
        finally {
            if (sqlSession != null){
                sqlSession.close();
            }
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    public void print(){
        System.out.println("test没有问题！");
    }
    @Test
    public void testDao2() throws Exception{
        Connection connection=null;
        Statement statement=null;
        ResultSet res=null;
            try{
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/blog", "root","123ASDasd");
            }catch (SQLException e){
                e.printStackTrace();
                System.out.println("数据库连接异常");
            }
            catch (ClassNotFoundException e2){
                System.out.println("数据库连接驱动类找不到！");
            }
    }
}
