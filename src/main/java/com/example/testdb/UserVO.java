package com.example.testdb;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // DB와 연결을 해서 만들어준다.
@NoArgsConstructor // 해당 어노테이션 찾아볼 것
public class UserVO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // 해당 어노테이션 찾아볼 것
    // 여러 옵션이 있는데 그중에 위의 옵션이 어떤것이 있는 지

    private Long id;

    private String title;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
