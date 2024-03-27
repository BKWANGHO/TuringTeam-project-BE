package com.turing.api.article;

import com.turing.api.enums.Messenger;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.*;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
public class ArticleController {
    private final ArticleService service;

    @GetMapping("/api/articles")
    public Map<?, ?> findAll() {
        Map<String, Object> map = new HashMap<>();

        map.put("messege", Messenger.SUCCESS);
//        @SuppressWarnings("unchecked")
        List<Article> list = new ArrayList<>();
//        list.add(Article.builder()
//                .id(1L)
//                .title("타임스크립트")
//                .content("너무 어렵다")
//                .writer("배광호")
//                .registerDate("24-03-27")
//                .build());
                        list = service.findAll();
        map.put("result", list);
        return map;
    }


}
