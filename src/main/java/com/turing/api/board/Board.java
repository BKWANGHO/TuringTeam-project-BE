package com.turing.api.board;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;
import org.hibernate.grammars.hql.HqlParser;

import java.util.Map;


@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"id"})

public class Board {


    private long id;
    private String boardName;
    private String boardType;

    private Map<Integer,Builder> article;

    @Builder(builderMethodName = "builder")
    public Board(long id, String boardName, String boardType) {
        this.id = id;
        this.boardName = boardName;
        this.boardType = boardType;
    }
}
