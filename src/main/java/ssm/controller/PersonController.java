package ssm.controller;

//import com.example.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ssm.model.Person;
import ssm.service.IPersonService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * <a href="mailto:nathanael4ever@gmail.com">Nathanael Yang</a> 17-3-15 下午3:09
 */
@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private IPersonService iPersonService;

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public String getAllPerson(HttpServletRequest request, Model model){
        String str = "";

        List<Person> list =  iPersonService.getAllDates();
//        Person list = iPersonService.getaById(1);
        model.addAttribute("userList",list);
        return "getAllPerson" ;
    }
}
