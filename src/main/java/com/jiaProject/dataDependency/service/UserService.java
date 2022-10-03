package com.jiaProject.dataDependency.service;

import com.jiaProject.dataDependency.controller.UserFilterDto;
import com.jiaProject.dataDependency.entity.User;
import com.jiaProject.dataDependency.enums.UserType;
import com.jiaProject.dataDependency.query.UserInput;
import com.jiaProject.dataDependency.query.UserQuery;
import com.jiaProject.dataDependency.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional()
public class UserService {

    private final UserRepository userRepository;
    public UserQuery insertUser(User user) {
        // userinput을 엔티티로 변환해서 넘겨서 저장한다.
        userRepository.save(user);
        User savedUser = userRepository.findById(user.getUserNo()).get();
        UserQuery userQuery = UserQuery.of(
                savedUser.getUserNo(),
                savedUser.getName(),
                savedUser.getAge(),
                UserType.of(savedUser.getType()),
                savedUser.getEmail()
        );

        return userQuery;
    }

    public List<User> getUserList(UserFilterDto filterDto) {
        return null;
    }
}
