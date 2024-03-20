package com.turing.api.article;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Repository
public class ArticleRepository {
    private Connection conn;

    public List<?> findAll() throws SQLException {
        String sql = "select * from articles";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();

        List<Article> ls = new ArrayList<>();
        if(rs.next()) {
            do {
                ls.add(Article.builder()
                                .id(rs.getLong("id"))
                                .title(rs.getString("Title"))
                                .content(rs.getString("content"))
                                .writer(rs.getString("Writer"))
                                .registerDate(rs.getString("register_date"))
                                .build());

            } while (rs.next());
        }else {
            System.out.println("데이터가 없습니다.");
        }
        rs.close();;
        pstmt.close();
        conn.close();

        return ls;
    }
}
