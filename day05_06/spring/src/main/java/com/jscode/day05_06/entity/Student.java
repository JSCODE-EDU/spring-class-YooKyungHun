package com.jscode.day05_06.entity;

import javax.persistence.*;

@Table(name = "student")
@Entity(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    @Column(nullable = false, name = "userName",length = 20)
    private String userName;

    @Column(name = "userClass", columnDefinition = "varchar(20) default 'basic'")
    private String userClass;
}