import com.cl.bean.Student;
import com.cl.bean.service.Impl.UserServiceImpl;
import com.cl.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {


    @org.junit.Test
    public void testBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Student student1 = context.getBean("student1", Student.class);
        System.out.println(student1);


    }


    @org.junit.Test
    public void testAutoBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1.xml");

        UserServiceImpl userService = context.getBean("userServiceImpl", UserServiceImpl.class);
//        System.out.println(student1);

        System.out.println(userService);
         userService.addUser();

    }

    @org.junit.Test
    public void testClassConfig(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        UserServiceImpl userService = context.getBean("userServiceImpl", UserServiceImpl.class);
//        System.out.println(student1);

        System.out.println(userService);
        userService.addUser();

    }
}
