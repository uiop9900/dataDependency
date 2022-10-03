package com.jiaProject.dataDependency.dto;

import com.jiaProject.dataDependency.enums.UserType;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class UserDto {
    private Long userNo; // user의 pk
    private String name; // 이름
    private int age; // 나이
    private UserType type; // 회원,비회원 구분
    private String email; // 이메일
}
