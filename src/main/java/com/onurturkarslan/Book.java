package com.onurturkarslan;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="book_id",columnDefinition = "serial")
    private int bookId;

    @Column(name = "book_name")
    private String bookName;

    @Column(name ="book_publication_year")
    private String bookPublicationYear;

    @Column(name ="book_stock")
    private int bookStock;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author_id")
    private Author author;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "publisher_id")
    private Publisher publisher;

    @ManyToMany
    @JoinTable(
            name = "book_category",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private List<Category> categories;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<BookBorrowing> borrowings;


    public Book() {
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookPublicationYear() {
        return bookPublicationYear;
    }

    public void setBookPublicationYear(String bookPublicationYear) {
        this.bookPublicationYear = bookPublicationYear;
    }

    public int getBookStock() {
        return bookStock;
    }

    public void setBookStock(int bookStock) {
        this.bookStock = bookStock;
    }
}
