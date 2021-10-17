import com.cl.bean.Student;
import com.cl.bean.service.Impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
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
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserServiceImpl userService = context.getBean("userServiceImpl", UserServiceImpl.class);
//        System.out.println(student1);
         userService.addUser();

    }
}
