/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jfjp.jee.sga.service.people;

import com.jfjp.jee.sga.domain.PersonBean;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author jfjim
 */
@Stateless
public class PersonServiceImpl implements PersonServiceRemote, PersonService {

    @Override
    public List<PersonBean> listPersons() {
        List<PersonBean> persons = new ArrayList<>();
        persons.add(new PersonBean(1, "Juan Francisco", "Jiménez", "Pérez", "690789090","jfjp@gmail.com"));
        persons.add(new PersonBean(2, "Manuel", "Gómez", "Pérez", "690889090","mgomez@gmail.com"));
        return persons;
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
    
}
