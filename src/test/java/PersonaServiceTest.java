/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.jfjp.jee.sga.domain.PersonBean;
import com.jfjp.jee.sga.service.people.PersonService;
import java.util.List;
import javax.ejb.embeddable.EJBContainer;
import javax.naming.NamingException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jfjim
 */
public class PersonaServiceTest {
    
    private  PersonService personService;
    public PersonaServiceTest() {
    }
    
    @Before
    public void setUp() throws NamingException {
        
        EJBContainer container = EJBContainer.createEJBContainer();
        personService = (PersonService) container.getContext().lookup("java:global/classes/PersonServiceImpl!com.jfjp.jee.sga.service.people.PersonService");
        
    }
    
    @After
    public void tearDown() {
    }

    
     @Test
     public void testPersonaServiceListPersons() {
         assertTrue(personService != null);
         List<PersonBean> persons = personService.listPersons();
         assertEquals(persons.size(), 2);
     }
}
