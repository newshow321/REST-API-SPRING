package com.learn.maven.learning;

import javax.persistence.*;

@Entity
@Table(name = "Category")
public class Category {
    @Id
    @GeneratedValue()
    private Integer id;
    @Column(name = "description")
    private String description;
    @Column(name = "name")
    private String name;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public Category(String name, String description) {
        super();
        this.name = name;
        this.description = description;
    }

    public Category() {

    }
}
