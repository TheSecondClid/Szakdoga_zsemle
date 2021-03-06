package com.szakdoga.zsemle.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Table
@Entity
public class UserEntity {
    @Id
    @GeneratedValue
    private int id;
    private String email;
    private String name;
}
