package com.chanyoung.mycommunity.dto.user;

import com.chanyoung.mycommunity.domain.user.User;

public class UserInfoResponseDto {
    private String name;

    public UserInfoResponseDto(User entity){
        this.name = entity.getName();
    }
}
