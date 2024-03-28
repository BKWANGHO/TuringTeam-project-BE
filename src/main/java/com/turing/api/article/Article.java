package com.turing.api.article;
import com.turing.api.board.Board;
import com.turing.api.user.User;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Builder
@AllArgsConstructor
@ToString(exclude = {"id"})
@Entity(name = "articles")
public class Article {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "article_id")
    private Long id;
    private String title;
    private String content;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User writer;
    private String registerDate;

    @ManyToOne
    @JoinColumn(name = "board_id", referencedColumnName = "board_id")
    private Board board;


}
