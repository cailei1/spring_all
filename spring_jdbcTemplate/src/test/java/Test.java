import com.cl.pojo.Dept;
import com.cl.service.DeptService;
import com.cl.service.Impl.DemptServiceImpl;
import com.cl.service.Impl.EmpServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    @org.junit.Test
    public void testJdbc(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        EmpServiceImpl bean = context.getBean(EmpServiceImpl.class);

        System.out.println(bean.findEmpBydeptno(20));

    }

    @org.junit.Test
    public void testAddDept(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        DemptServiceImpl service = (DemptServiceImpl) context.getBean(DeptService.class);

        Dept dept = new Dept();
        dept.setDname("街道办事处");
        dept.setLoc("北京朝阳区");

        service.addDept(dept);

    }

    @org.junit.Test
    public void testUpdateDept(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        DemptServiceImpl service = (DemptServiceImpl) context.getBean(DeptService.class);

        Dept dept = new Dept();
        dept.setDeptno(42);
        dept.setDname("大湾区");
        dept.setLoc("朝阳区群众");

        service.updateDept(dept);

    }
}
