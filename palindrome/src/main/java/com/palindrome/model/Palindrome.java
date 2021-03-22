package com.palindrome.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "palindrome")
@Getter @Setter @ToString
public class Palindrome {

    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "string", nullable = false)
    private String string;

    @Column(name = "palindrome")
    private String palindrome;
}
