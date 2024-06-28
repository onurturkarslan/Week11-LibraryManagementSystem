package com.onurturkarslan;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Category")
public class Category {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id", columnDefinition = "serial")
    private int category_id;

    @Column(name = "cateogry_name")
    private String category_name;

    @Column(name = "category_description")
    private String category_description;

    @ManyToMany(mappedBy = "categories")
    private List<Book> books;

    public Category() {
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public String getCategory_description() {
        return category_description;
    }

    public void setCategory_description(String category_description) {
        this.category_description = category_description;
    }
}
