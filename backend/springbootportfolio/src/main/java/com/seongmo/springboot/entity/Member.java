package com.seongmo.springboot.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "members")
@Setter
@Getter
public class Member{

    @Id
    private @Column(name = "email") String email;
    private @Column(name = "age") int age;
    private @Column(name = "album") String album;
    @CreationTimestamp
    private @Column(name = "created_at") Timestamp create_at;
    private @Column(name = "name") String name;
    private @Column(name = "password") String password;
    private @Column(name = "ranks") int ranks;
}