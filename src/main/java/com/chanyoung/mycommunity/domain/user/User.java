package com.chanyoung.mycommunity.domain.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @Column(length=20, unique=true, nullable=false)
    private String userId;

    @Column(length=20, nullable=false)
    @JsonIgnore
    private String password;

    @Column(nullable=false)
    private String name;

    @Column(nullable=false)
    private String email;

    @Builder
    public User(String userId, String password, String name, String email){
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.email = email;
    }
}
