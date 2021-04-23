package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
    @Id
    @Column
    private Long id;

    @Column
    private String name;

    @Column
    private String author;
}
