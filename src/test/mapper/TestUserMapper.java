package mapper;

import com.fs.mapper.UserMapper;
import com.fs.model.User;
import com.fs.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

/**
 * @ClassName TestUserMapper
 * @Description TODO
 * @Author ss
 * @Date 2020/7/27 6:37
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class TestUserMapper {
    @Autowired
    private UserMapper um;
    @Resource
    private UserService us;  //private UserService us-->等同于 private UserService us =  new UserServiceImpl()
    @Test
    public void m(){
        User u = um.selectByPrimaryKey(1);
        User u2= us.getUserById();
        //System.out.println(um.selectByPrimaryKey(1)+"************");
        System.out.println(111);

    }
}
