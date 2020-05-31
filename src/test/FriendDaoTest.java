package test;

import dao.FriendDao;
import domain.Friend;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class FriendDaoTest {
    public static void main(String[] args) throws IOException {
        //1.读取配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        //3.创建SqlSessionFactory对象
        SqlSessionFactory factory = builder.build(in);
        //4.创建SqlSession对象
        SqlSession session = factory.openSession();
        //5.创建dao接口的代理对象
        FriendDao friendDao = session.getMapper(FriendDao.class);
        //6.执行方法
        List<Friend> friends = friendDao.findAll(1);

        for (Friend friend : friends) {
            System.out.println(friend);
        }
        //7.释放资源和提交事务
        session.close();
        in.close();
    }
}
