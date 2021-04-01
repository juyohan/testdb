package com.example.testdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller // MVC에서 C의 역할을 해준다.
public class MainContainer {

    private UserService userService;

    @Autowired // 의존성 주입
    public MainContainer(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/test")
    public String testHtml(Model model) { // Model의 파라미터가 무슨 역할을 하는지 알아보자.
        model.addAttribute("users", new UserVO());
        // 위의 메소드를 통해 addAttribute의 메소드를 사용한다.
        List<UserVO> userVOList = userService.findByAll();
        // findByAll()의 메소드가 무슨 역할을 하는지

        if (userVOList != null) {
            model.addAttribute("sub", userVOList);
        }

        return "/test";
    }

    @PostMapping("/posts")
    public String testPost(UserVO userVO) {
        userService.saveUserVO(userVO);
        return "redirect:/test";
    }
}
