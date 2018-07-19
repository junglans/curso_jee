/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jfjp.jee.sga.dao;

import com.jfjp.jee.hello.world.jpa.entities.PersonEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jfjim
 */
@Stateless
public class PersonDAOImpl implements PersonDAO {

    @PersistenceContext ( unitName = "CursoPU")
    private EntityManager em;
    
    @Override
    public List<PersonEntity> listPersons() {
        return em.createNamedQuery("Person.findAll").getResultList();
    }

    @Override
    public PersonEntity findPersonById(int personId) {
        return em.find(PersonEntity.class, personId);
    }

    @Override
    public PersonEntity findPersonByEmail(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PersonEntity createPerson(PersonEntity person) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletePerson(PersonEntity person) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PersonEntity modifyPerson(PersonEntity person) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
