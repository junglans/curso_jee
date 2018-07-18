/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jfjp.jee.sga.service.people;

import com.jfjp.jee.sga.domain.PersonBean;
import javax.ejb.Local;
import java.util.List;
/**
 *
 * @author jfjim
 */
@Local
public interface PersonService {

    List<PersonBean> listPersons();

    PersonBean findPersonById(int personId);

    PersonBean findPersonByEmail(String email);

    PersonBean createPerson(PersonBean person);

    void deletePerson(PersonBean person);

    PersonBean modifyPerson(PersonBean person);
}
