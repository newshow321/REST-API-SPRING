package com.learn.maven.learning;

import javax.persistence.*;

@Entity
@Table(name = "Product")
public class Product {
    @Id
    @GeneratedValue()
    private Long id;
    @ManyToOne
    @JoinColumn(name = "category_id")
    Category categoryId;
    @ManyToOne
    @JoinColumn(name = "created_by")
    Customer createdBy;
    @Column(name = "name")
    private String name;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCategoryId(Category categoryId) {
        this.categoryId = categoryId;
    }

    public Category getCategoryId() {
        return categoryId;
    }

    public void setCreatedBy(Customer createdBy) {
        this.createdBy = createdBy;
    }

    public Customer getCreatedBy() {
        return createdBy;
    }

    public Product(Category categoryId, Customer createdBy, String name) {
        super();
        this.name = name;
        this.categoryId = categoryId;
        this.createdBy = createdBy;
    }

    public Product() {

    }
}
