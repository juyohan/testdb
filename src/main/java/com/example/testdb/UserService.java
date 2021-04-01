package com.example.testdb;

import java.util.List;

// service 단을 만들어주는 인터페이스
public interface UserService {
    public UserVO saveUserVO(UserVO userVO);

    public List<UserVO> findByAll();
}
