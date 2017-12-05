/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ma
 */
@Entity
@Table(name = "PERSON")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Person.findAll", query = "SELECT m FROM Person m")
    , @NamedQuery(name = "Person.findById", query = "SELECT m FROM Person m WHERE m.id = :id")
    , @NamedQuery(name = "Person.findByPassword", query = "SELECT m FROM Person m WHERE m.password = :password")
    , @NamedQuery(name = "Person.findByLogin", query = "SELECT m FROM Person m WHERE m.login = :login")
    , @NamedQuery(name = "Person.findByIsTeam", query = "SELECT m FROM Person m WHERE m.isTeam = :isTeam")
    , @NamedQuery(name = "Person.findByIsAdmin", query = "SELECT m FROM Person m WHERE m.isAdmin = :isAdmin")
    , @NamedQuery(name = "Person.findByIsClient", query = "SELECT m FROM Person m WHERE m.isClient = :isClient")})
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String login;
    
    private String password;
    
    private boolean isTeam;
    
    private boolean isAdmin;
    
    private boolean isClient;

    public boolean isIsTeam() {
        return isTeam;
    }

    public void setIsTeam(boolean isTeam) {
        this.isTeam = isTeam;
    }

    public boolean isIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public boolean isIsClient() {
        return isClient;
    }

    public void setIsClient(boolean isClient) {
        this.isClient = isClient;
    }
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Person)) {
            return false;
        }
        Person other = (Person) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Person[ id=" + id + " ]";
    }
    
}
