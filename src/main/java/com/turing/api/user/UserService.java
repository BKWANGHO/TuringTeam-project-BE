package com.turing.api.user;

import lombok.NoArgsConstructor;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;



public interface UserService {
    Map<String, ?> save(User user);
//    Map<String, ?> login(Map<String, ?> map) throws SQLException;
//    Map<String, ?> addUsers();
//    Map<String, ?> updatePassword(Map<String, ?> map);
//    Map<String, ?> findUserByName(Map<String, ?> map);
//    Map<String, ?> findUserByJob(Map<String, ?> map);
//    Map<String, ?> findUsers() throws SQLException;
//    Map<String, ?> getUser(Map<String, ?> map) throws SQLException;
//    Map<String, ?> touchTable() throws SQLException;
//    Map<String, ?> removeTable() throws SQLException;
}
