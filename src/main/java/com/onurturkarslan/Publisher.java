package com.onurturkarslan;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name ="publisher")
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "publisher_id",columnDefinition = "serial")
    private int publisher_id;

    @Column(name = "publisher_name")
    private String publisherName;

    @Column(name ="publisher_establishment_year")
    private String publisherEstablishmentYear;

    @Column(name ="publisher_address")
    private String address ;

    @OneToMany(mappedBy = "publisher", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Book> books;

    public Publisher() {
    }

    public int getPublisher_id() {
        return publisher_id;
    }

    public void setPublisher_id(int publisher_id) {
        this.publisher_id = publisher_id;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getPublisherEstablishmentYear() {
        return publisherEstablishmentYear;
    }

    public void setPublisherEstablishmentYear(String publisherEstablishmentYear) {
        this.publisherEstablishmentYear = publisherEstablishmentYear;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
