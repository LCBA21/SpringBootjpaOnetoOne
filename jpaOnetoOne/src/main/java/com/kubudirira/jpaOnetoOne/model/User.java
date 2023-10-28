package com.kubudirira.jpaOnetoOne.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Integer id;
    private String first_name;
    private  String last_name;
    private  String email;

    @OneToOne(cascade = CascadeType.ALL)
    private  Passport passport;

}
