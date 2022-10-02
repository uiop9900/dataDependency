package com.jiaProject.dataDependency.controller;

import com.jiaProject.dataDependency.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional()
public class UserController {

    private final UserService userService;

    /**
     * user 를 저장하고 저장된 user를 조회합니다.
     */
    public GetUser insertUser(final UserInput userInput) {
        userService.insertUser(userInput);
        return null;
    }

    /**
     * filter에 따라 다른 userList를 조회합니다.
     */
    public GetUserList getUserList(final UserInput userInput) {
        userService.getUserList(userInput);
        return null;
    }
}
