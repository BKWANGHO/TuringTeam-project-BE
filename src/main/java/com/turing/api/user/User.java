package com.turing.api.user;

import jakarta.persistence.*;
import lombok.*;


@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"id"})
@Entity(name="users")
public class User {
    //유저수정했음~!~!~!~!!!!!

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", phoneNumber=" + phone +
                ", address='" + addressId + '\'' +
                ", job='" + job + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}' + '\n';
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
