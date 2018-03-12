package com.chanyoung.mycommunity.service;

import com.chanyoung.mycommunity.domain.user.UserRepository;
import com.chanyoung.mycommunity.dto.user.UserRegistRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Service
public class RegistService {
    private UserRepository userRepository;

    @Transactional
    public Long save(UserRegistRequestDto dto){return userRepository.save(dto.toEntity()).getId();}
}
