package com.chanyoung.mycommunity.web;

import com.chanyoung.mycommunity.dto.posts.PostsSaveRequestDto;
import com.chanyoung.mycommunity.dto.user.UserRegistRequestDto;
import com.chanyoung.mycommunity.service.PostsService;
import com.chanyoung.mycommunity.service.RegistService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class WebRestController {
    private PostsService postsService;
    private RegistService registService;

    @GetMapping("/hello")
    public String hello() {
        return "HelloWorld";
    }

    @PostMapping("/posts")
    public Long savePosts(@RequestBody PostsSaveRequestDto dto) {
        return postsService.save(dto);
    }

    @PostMapping("/regist")
    public Long userRegist(@RequestBody UserRegistRequestDto dto) { return registService.save(dto);}
}
