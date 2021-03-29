package com.example.testdb;

import java.util.List;

public interface UserService {
    public UserVO saveUserVO(UserVO userVO);

    public List<UserVO> findByAll();
}
