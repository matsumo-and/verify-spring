package com.spring.verify.app.infrastructure.entity;

import org.seasar.doma.*;

@Entity
@Table(name = "personal_information")
public record PersonalInformationEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) long id,
    @Column(name = "name") String name,
    @Column(name = "email") String email,
    @Column(name = "url") String url) {}
