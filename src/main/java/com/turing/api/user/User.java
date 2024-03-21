package com.turing.api.user;

import jakarta.persistence.*;
import lombok.*;


@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"id"})
@Entity(name = "Users")
public class User {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String name;
    private String phone;
    private Long addressId;
    private String job;
    private double height;
    private double weight;

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
