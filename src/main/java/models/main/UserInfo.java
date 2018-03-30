package models.main;

import models.interfaces.IModel;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "user_info")
public class UserInfo implements IModel, Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @ManyToOne
    @JoinColumn(name="id", nullable=false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private User user;

    /*@Id
    @Column(name = "id", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
*/

    @Column(name = "name")
    private String name;

    @Column(name = "lastname")
    private String lastName;

    @Override
    public Long getId() {
        return null;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    @Override
    public String toString() {
        return "UserInfo{" +
                "user=" + user.toString() +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
