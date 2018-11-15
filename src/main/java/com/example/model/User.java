package com.example.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @Entity
    @Data
    @Table(name = "users", uniqueConstraints = {
            @UniqueConstraint(columnNames = "user_id") })
    public class User implements Serializable {

        private static final long serialVersionUID = 6447416794596398975L;

        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Id
        @Column(name= "user_id", columnDefinition = "serial",updatable=false, unique = true, nullable = false)
        private Long userId;

    @Column(name= "first_name")
    private String firstName;

    @Column(name= "last_name")
    private String lastName;

    @Column(name= "email")
    private String email;

}