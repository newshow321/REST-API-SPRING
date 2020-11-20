package com.learn.maven.learning;

import javax.persistence.*;

@Entity
@Table(name = "Customer")
public class Customer {
    @Id
    @GeneratedValue()
    private Long id;
    @Column(name = "email")
    private String email;
    @Column(name = "fullname")
    private String fullname;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getFullname() {
        return fullname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public Customer(String fullname, String email) {
        super();
        this.fullname = fullname;
        this.email = email;
    }

    public Customer() {

    }

}
