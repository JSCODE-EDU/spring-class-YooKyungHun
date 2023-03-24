package com.jscode.day05.entity;

import javax.persistence.*;

@Table(name = "tb_test")
@Entity
public class TestTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    public TestTable() {
    }
}