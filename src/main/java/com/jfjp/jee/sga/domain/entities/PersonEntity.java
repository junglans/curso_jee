/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jfjp.jee.sga.domain.entities;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author jfjim
 */
@Entity
@Table(name = "PERSON")
@NamedQueries({
    @NamedQuery (name =  "Person.findAll", query = "SELECT p FROM PersonEntity p ORDER BY p.id")
})
public class PersonEntity implements Serializable {

    private static final long serialVersionUID = -3004222207395951623L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="name", nullable = false, length = 50)
    private String name;
    @Column(name="surname1", nullable = false, length = 50)
    private String surname1;
    @Column(name="surname2", nullable = true, length = 50)
    private String surname2;
    @Column(name="tfln", nullable = false, length = 20)
    private String telephone;
    @Column(name="email", nullable = false, length = 50)
    private String email;

    public PersonEntity() {
    }

    public PersonEntity(Long id) {
        this.id = id;
    }
    public PersonEntity(String name, String surname1, String surname2, String telephone, String email) {
        this.name = name;
        this.surname1 = surname1;
        this.surname2 = surname2;
        this.telephone = telephone;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.id);
        hash = 13 * hash + Objects.hashCode(this.name);
        hash = 13 * hash + Objects.hashCode(this.surname1);
        hash = 13 * hash + Objects.hashCode(this.surname2);
        hash = 13 * hash + Objects.hashCode(this.telephone);
        hash = 13 * hash + Objects.hashCode(this.email);
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
        final PersonEntity other = (PersonEntity) obj;
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
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PersonEntity{" + "id=" + id + ", name=" + name + ", surname1=" + surname1 + ", surname2=" + surname2 + ", telephone=" + telephone + ", email=" + email + '}';
    }
    
    
}
