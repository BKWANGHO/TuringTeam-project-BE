package com.turing.api.article;
import com.turing.api.board.Board;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"id"})
public class Article {
    private Long article_id;
    private String title;
    private String content;
    private String writer;
    private String registerDate;

    @ManyToOne
    @JoinColumn(name = "board_id", referencedColumnName = "board_id")
    private Board board;


    @Builder(builderMethodName = "builder")
    public Article(Long id, String title, String content, String writer,String registerDate) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.registerDate = registerDate;
    }
}
