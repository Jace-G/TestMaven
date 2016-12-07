import com.chq.testmaven.entity.Admin;
import com.chq.testmaven.service.AdminService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

;

/**
 * Created by chqian on 2016/12/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMaven {
          private ApplicationContext ac = null;

    @Autowired
    public  AdminService adminService = null;
      @Before
      public void before() {
          ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
          adminService = (AdminService) ac.getBean("adminServiceImpl");
      }

    @Test
    public void test() {
        Admin admin = adminService.selectByPrimaryKey(1);
        System.out.println("哈哈哈" + admin.getUsername());
    }
}

