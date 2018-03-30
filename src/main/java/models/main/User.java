package models.main;

import models.interfaces.IModel;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "user")
public class User implements IModel{

   // private Set<UserInfo> userInfoSet = new HashSet<>();

    @OneToMany(mappedBy="user")
    private Set<UserInfo> users;

    @Id
    @Column(name = "id", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "password")
    private String password;

    @Column(name = "login")
    private String login;

    @Column(name = "name")
    private String name;

    @Column(name = "lastname")
    private String lastName;


   /* @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    public Set<UserInfo> getUserInfoSet(){
        return this.userInfoSet;
    }*/


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", login='" + login + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
