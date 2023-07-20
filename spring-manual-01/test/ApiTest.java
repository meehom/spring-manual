package test;

import com.meehom.springframwork.BeanDefinition;
import com.meehom.springframwork.BeanFactory;
import org.junit.Test;
import test.bean.UserService;
/**
 * @version 1.0
 * @Author meehom
 * @Date 2023/7/20 22:10
 */
public class ApiTest {
    @Test
    public void test_BeanFactory() {
        BeanFactory beanFactory = new BeanFactory();
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        UserService userService = (UserService)beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
