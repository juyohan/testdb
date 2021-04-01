package com.example.testdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // 해당 어노테이션이 무슨 역할을 하는지
public class UserServiceImp implements UserService{

    private UserRepository userRepository;

    @Autowired
    public UserServiceImp(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public UserVO saveUserVO(UserVO userVO) {
        return userRepository.save(userVO);
    }

    @Override
    public List<UserVO> findByAll() {
        return userRepository.findAll();
    }
}
