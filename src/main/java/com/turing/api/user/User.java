package com.turing.api.user;

import jakarta.persistence.*;
import lombok.*;


    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @Getter
    @Setter
    @ToString(exclude = {"id"})
@Entity(name = "Users")
public class User {
        @Id
        @Column(name = "id", nullable = false)
        @GeneratedValue(strategy= GenerationType.IDENTITY)//1씩 자동 증가
        private Long id;
        private String username;
        private String password;
        private String name;
        private String phone;
        private Long addressId;
        private String job;
        private double height;
        private double weight;

        @Builder(builderMethodName = "builder")
        public User(long id, String username, String password,
                    String name, String phone, String job, double height,
                    double weight) {
            this.id = id;
            this.username = username;
            this.password = password;
            this.name = name;
            this.phone = phone;
            this.job = job;
            this.height = height;
            this.weight = weight;
        }

    }
