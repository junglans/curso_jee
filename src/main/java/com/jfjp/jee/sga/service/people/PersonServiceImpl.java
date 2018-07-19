/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jfjp.jee.sga.service.people;

import com.jfjp.jee.sga.domain.entities.PersonEntity;
import com.jfjp.jee.sga.dao.PersonDAO;
import com.jfjp.jee.sga.domain.PersonBean;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;


/**
 *
 * @author jfjim
 */
@Stateless
public class PersonServiceImpl implements PersonServiceRemote, PersonService {

    @EJB
    private PersonDAO personDao;
   
    @Override
    public List<PersonBean> listPersons() {
        return map(personDao.listPersons());
    }

    @Override
    public PersonBean findPersonById(int personId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PersonBean findPersonByEmail(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PersonBean createPerson(PersonBean person) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletePerson(PersonBean person) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PersonBean modifyPerson(PersonBean person) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private List<PersonBean> map(List<PersonEntity> entities) {
         
        List<PersonBean> result = new ArrayList<>();
        for (PersonEntity entity : entities) {
            result.add(new PersonBean(entity.getId(), entity.getName(), entity.getSurname1(), entity.getSurname2(),entity.getTelephone(), entity.getEmail()));
        }
        return result;
    }
    
}
