/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jfjp.jee.sga.client.people;

import com.jfjp.jee.sga.domain.PersonBean;
import com.jfjp.jee.sga.service.people.PersonServiceRemote;
import java.util.List;
import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author jfjim
 */
public class ClientPeopleService {

    public static void main(String[] args) {
        System.out.println("Iniciando llamada al EJB desde el cliente\n");
        call(true);
    }

    private static void call(boolean withIp) {
        try {
            Context jndi;
            if (withIp) {
                Properties props = new Properties();
                props.setProperty("java.naming.factory.initial", "com.sun.enterprise.naming.SerialInitContextFactory");
                props.setProperty("java.naming.factory.url.pkgs", "com.sun.enterprise.naming");
                props.setProperty("java.naming.factory.state", "com.sun.corba.ee.impl.presentation.rmi.JNDIStateFactoryImpl");
                // optional. Default localhost. Aqui se cambia la IP del servidor donde esta Glassfish
                props.setProperty("org.omg.CORBA.ORBInitialHost", "127.0.0.1");
                // optional. Puerto por Default 3700. Solo se necesita cambiar si el puerto no es 3700.
                props.setProperty("org.omg.CORBA.ORBInitialPort", "3700");
                jndi = new InitialContext(props);
            } else {
                jndi = new InitialContext();

            }

            PersonServiceRemote personaService = (PersonServiceRemote) jndi.lookup("java:global/sga_jee/PersonServiceImpl!com.jfjp.jee.sga.service.people.PersonServiceRemote");

            List<PersonBean> persons = personaService.listPersons();

            for (PersonBean person : persons) {
                System.out.println(person);
            }
            System.out.println("\nFin llamada al EJB desde el cliente");
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
