package com.jiaProject.dataDependency.repository;

import com.jiaProject.dataDependency.controller.UserFilterDto;
import com.jiaProject.dataDependency.dto.UserDto;

import java.util.List;

public interface UserRepositoryCustom {
    List<UserDto> findUsersByFilter(UserFilterDto userFilterDto);
}
