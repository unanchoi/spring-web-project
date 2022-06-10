package com.demo.unan.web;

import com.demo.unan.services.posts.PostService;
import com.demo.unan.web.dto.PostsSaveRequestsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PostsApiController {
    private final PostService postService;

    @PostMapping("/api/v1/posts")
    public long save(@RequestBody PostsSaveRequestsDto requestsDto) {
        return postService.save(requestsDto);
    }
}
