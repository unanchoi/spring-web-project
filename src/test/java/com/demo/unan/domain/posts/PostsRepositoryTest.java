package com.demo.unan.domain.posts;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsRepositoryTest {

    @Autowired
    PostsRepository postsRepository;

    @After
    public void cleanUp(){
        postsRepository.deleteAll();
    }

    @Test
    public void 게시글_저장_불러오기() throws Exception {
    //given
        String title = "게시글제목";
        String content = "게시글본문";

        postsRepository.save(Posts.builder()
                .title(title)
                .content(content)
                .author("unan@unan.com")
                .build());
    //when
        List<Posts> postsList = postsRepository.findAll();

    //then
        Posts posts = postsList.get(0);
        assertThat(posts.getTitle()).isEqualTo(title);
        assertThat(posts.getContent()).isEqualTo(content);
    }
}
