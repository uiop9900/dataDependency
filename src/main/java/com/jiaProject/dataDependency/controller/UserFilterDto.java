package com.jiaProject.dataDependency.controller;

import com.jiaProject.dataDependency.entity.User;
import com.jiaProject.dataDependency.enums.UserType;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserFilterDto {
    private Long userNo;
    private String name;
    private int age;
    private User.UserTypeCd type;
    private String email;
    private Long lectureNo;
}
