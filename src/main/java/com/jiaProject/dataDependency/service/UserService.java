package com.jiaProject.dataDependency.service;

import com.jiaProject.dataDependency.controller.UserInput;
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
    }

    public void getUserList(UserInput userInput) {
    }
}
