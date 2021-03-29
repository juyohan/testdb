package com.example.testdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MainContainer {

    private UserService userService;

    @Autowired
    public MainContainer(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/test")
    public String testHtml(Model model) {
        model.addAttribute("users", new UserVO());
        List<UserVO> userVOList = userService.findByAll();
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
