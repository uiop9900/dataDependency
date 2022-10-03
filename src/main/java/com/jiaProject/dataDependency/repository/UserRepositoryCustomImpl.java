package com.jiaProject.dataDependency.repository;

import com.jiaProject.dataDependency.controller.UserFilterDto;
import com.jiaProject.dataDependency.dto.UserDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.query.JpaQueryMethodFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Slf4j
@Repository
public class UserRepositoryCustomImpl implements UserRepositoryCustom {


    @Override
    public List<UserDto> findUsersByFilter(UserFilterDto userFilterDto) {
        return null;
    }
}
