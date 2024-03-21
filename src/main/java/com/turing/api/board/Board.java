package com.turing.api.board;
import java.util.List;

import jakarta.persistence.*;
import org.hibernate.annotations.ManyToAny;

import com.turing.api.article.Article;

import lombok.*;


@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"id"})
public class Board {

    private long id;
    private String boardName;
    private String boardType;

    @OneToMany(mappedBy = "board")
    @JoinColumn(name="ref_id",referencedColumnName = "id")
    private List<Article> article;

    @Builder(builderMethodName = "builder")
    public Board(long id, String boardName, String boardType) {
        this.id = id;
        this.boardName = boardName;
        this.boardType = boardType;
    }



}
