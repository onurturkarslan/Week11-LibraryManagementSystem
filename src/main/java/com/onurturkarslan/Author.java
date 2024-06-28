package com.onurturkarslan;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name ="Author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_id",columnDefinition = "serial")
    private int authorId;

    @Column(name ="author_name")
    private String authorName;

    @Column(name = "author_birtdate")
    private String authorBirtdate;

    @Column(name = "author_country")
    private String authorCountry;


    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Book> books;

    public Author() {
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorBirtdate() {
        return authorBirtdate;
    }

    public void setAuthorBirtdate(String authorBirtdate) {
        this.authorBirtdate = authorBirtdate;
    }

    public String getAuthorCountry() {
        return authorCountry;
    }

    public void setAuthorCountry(String authorCountry) {
        this.authorCountry = authorCountry;
    }
}
