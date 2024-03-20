package com.turing.api.user;


import com.turing.api.enums.Messenger;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.*;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

    private final UserService service;
    private final UserService checkoutWAWAHYUN;

    @PostMapping("/login")
    public Map<String, ?> login1 (@RequestBody Map<?,?> paramap){
        String username = (String)paramap.get("username");
        System.out.println("리퀘스트" + username);
        Map<String,String> response = new HashMap<>();
        response.put("로그인 성공","아이디 : "+ username);

        return response;
    }
    public Map<String, ?> join(@RequestBody Map<?,?> paramap) throws SQLException {
        Map<String,String> response = new HashMap<>();

        return response;
    }

    public Map<String, ?> login(@RequestBody Map<?,?> paramap) throws SQLException {
        Map<String,String> response = new HashMap<>();
        return response;
    }

    public Map<String, ?> findUserBYId(@RequestBody Map<?,?> paramap) {
        Map<String,String> response = new HashMap<>();
        return response;
    }

    public Map<String, ?> addUsers() {
        Map<String,String> response = new HashMap<>();
        return response;
    }


    public Map<String, ?> updatePassword(@RequestBody Map<?,?> paramap) {
        Map<String,String> response = new HashMap<>();
        return response;
    }
    public Map<String, ?> deleteUser(@RequestBody Map<?,?> paramap) {
        Map<String,String> response = new HashMap<>();

        return response;
    }

    public Map<String, ?> getUserList() {
        Map<String,String> response = new HashMap<>();

        return response;
    }

    public Map<String, ?> findUserByName(@RequestBody Map<?,?> paramap) {
        Map<String,String> response = new HashMap<>();
        return response;

    }


    public Map<String, ?> findUserByJob(@RequestBody Map<?,?> paramap) {
        Map<String,String> response = new HashMap<>();
        return response;
    }
    public Map<String, ?> countUser() {
        Map<String,String> response = new HashMap<>();
        return response;
    }

    public Map<String, ?> getOne(@RequestBody Map<?,?> paramap) throws SQLException {
        Map<String,String> response = new HashMap<>();
        return response;
    }
    public Map<String, ?> findUsers() throws SQLException {
        Map<String,String> response = new HashMap<>();

        return response;
    }
    public Map<String, ?> getUser(@RequestBody Map<?,?> paramap) throws SQLException {
        Map<String,String> response = new HashMap<>();

        return response;
    }

    public Map<String, ?> touchTable() throws SQLException {
        Map<String,String> response = new HashMap<>();
        return response;
    }

    public Map<String, ?> removeTable() throws SQLException {
        Map<String,String> response = new HashMap<>();
        return response;
    }



}
