package com.t3.useraddresscomments.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter @Setter @NoArgsConstructor
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String username;

    @Column(name = "full_name")
    private String fullName;

    private String email;

    private String phone;

    private int age;

    @OneToOne(mappedBy = "userId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Address address;

    public User(String username, String fullName, String email, String phone, int age) {
        this.username = username;
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", fullName=" + fullName + ", email=" + email + ", phone="
                + phone + ", age=" + age + "]";
    }

    
 
}

