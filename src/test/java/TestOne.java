import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import ssm.model.Person;
import ssm.service.IPersonService;


/**
 * <a href="mailto:nathanael4ever@gmail.com">Nathanael Yang</a> 17-3-22 下午1:39
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})
public class TestOne  {
    @Autowired
    IPersonService personService;


    @Test
    public void testone(){
//        List<Person> list = personService.getAllDates();
//        System.out.println("testInsertOrder result:"+list.size());
        Person person = personService.getaById(1);
        System.out.println("testInsertOrder result:"+person.getName());


    }
}
