package com.demo.unan.services.posts;

import com.demo.unan.domain.posts.PostsRepository;
import com.demo.unan.web.dto.PostsSaveRequestsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class PostService {
    private final PostsRepository postsRepository;

    @Transactional
    public long save(PostsSaveRequestsDto requestsDto) {
    return postsRepository.save(requestsDto.toEntity()).getId();
    }
}
