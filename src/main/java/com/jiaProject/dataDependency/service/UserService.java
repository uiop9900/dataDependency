package com.jiaProject.dataDependency.service;

import com.jiaProject.dataDependency.query.UserInput;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional()
public class UserService {
    public void insertUser(UserInput userInput) {
        //userinput을 엔티티로 변환해서 넘겨서 저장한다.

        //
    }

    public void getUserList(UserInput userInput) {
    }
}
