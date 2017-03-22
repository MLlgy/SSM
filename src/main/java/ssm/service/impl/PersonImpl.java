package ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ssm.model.Person;
import ssm.dao.PersonMapper;
import ssm.service.IPersonService;

import java.util.List;

/**
 * <a href="mailto:nathanael4ever@gmail.com">Nathanael Yang</a> 17-3-15 下午3:08
 */
@Service
@Transactional
public class PersonImpl implements IPersonService {

    private final PersonMapper mapper;

    @Autowired
    public PersonImpl(PersonMapper mapper) {
        this.mapper = mapper;
    }

    public Person getaById(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

//    public List<Person> getAllDates() {
//        return mapper.getAllPerson();
//    }


}
