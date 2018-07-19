/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jfjp.jee.sga.domain;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author jfjim
 */
public class PersonBean implements Serializable {

    private static final long serialVersionUID = 3685356549006007822L;
    
    private long id;
    private String name;
    private String surname1;
    private String surname2;
    private String telephone;
    private String email;

    public PersonBean() {
    }

    public PersonBean(long id, String name, String surname1, String surname2, String telephone, String email) {
        this.id = id;
        this.name = name;
        this.surname1 = surname1;
        this.surname2 = surname2;
        this.telephone = telephone;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname1() {
        return surname1;
    }

    public void setSurname1(String surname1) {
        this.surname1 = surname1;
    }

    public String getSurname2() {
        return surname2;
    }

    public void setSurname2(String surname2) {
        this.surname2 = surname2;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + Objects.hashCode(this.surname1);
        hash = 41 * hash + Objects.hashCode(this.surname2);
        hash = 41 * hash + Objects.hashCode(this.telephone);
        hash = 41 * hash + Objects.hashCode(this.email);
        return hash;
    }

    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PersonBean other = (PersonBean) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.surname1, other.surname1)) {
            return false;
        }
        if (!Objects.equals(this.surname2, other.surname2)) {
            return false;
        }
        if (!Objects.equals(this.telephone, other.telephone)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PersonBean{" + "id=" + id + ", name=" + name + ", surname1=" + surname1 + ", surname2=" + surname2 + ", telephone=" + telephone + ", email=" + email + '}';
    }
    
    
            
            
}
