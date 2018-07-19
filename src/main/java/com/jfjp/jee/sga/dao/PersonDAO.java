/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jfjp.jee.sga.dao;


import com.jfjp.jee.hello.world.jpa.entities.PersonEntity;
import java.util.List;

/**
 *
 * @author jfjim
 */
public interface PersonDAO {
    List<PersonEntity> listPersons();

    PersonEntity findPersonById(int personId);

    PersonEntity findPersonByEmail(String email);

    PersonEntity createPerson(PersonEntity person);

    void deletePerson(PersonEntity person);

    PersonEntity modifyPerson(PersonEntity person);
}
