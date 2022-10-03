package com.jiaProject.dataDependency.controller;

import com.jiaProject.dataDependency.entity.User;
import com.jiaProject.dataDependency.query.GetUser;
import com.jiaProject.dataDependency.query.GetUserList;
import com.jiaProject.dataDependency.query.UserInput;
import com.jiaProject.dataDependency.query.UserQuery;
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
        User user = UserInput.toEntity(userInput);
        UserQuery userQuery = userService.insertUser(user);
        GetUser getUser = GetUser.of(userQuery);
        return getUser;
    }

    /**
     * filter에 따라 다른 userList를 조회합니다.
     */
    public GetUserList getUserList(final UserFilter userInput) {
        UserFilterDto userFilterDto = UserFilter.toFilter(userInput);

        userService.getUserList(userFilterDto);
        return null;
    }
}
