package com.turing.api.user;


import com.turing.api.enums.Messenger;
import jakarta.persistence.EntityManager;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserRepository {
    private EntityManager em;
@Autowired
    public UserRepository(EntityManager em) {
        this.em = em;
    }

    Map<String,User> map;


    public Map<String,?> save(User user) {
        em.persist(user);
        map.put(user.getUsername(),user);
        return map;
    }
}
