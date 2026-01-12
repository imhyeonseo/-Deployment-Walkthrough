package com.example.test.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@Entity
@Table(name="customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(length = 50, nullable = false, name = "name")
    private String name;

    @Column(length = 20, nullable = false, unique = true, name = "phone")
    private String phone;

    @Column(length = 100, name = "memo")
    private String memo;

    @Column(nullable = false, name = "created_at")
    private LocalDate createdAt;
}