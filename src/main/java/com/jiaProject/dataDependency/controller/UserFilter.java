package com.jiaProject.dataDependency.controller;

import com.jiaProject.dataDependency.enums.UserType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class UserFilter {
    private Long userNo;
    private String name;
    private int age;
    private UserType type;
    private String email;
    private Long lectureNo;

    public static UserFilterDto toFilter(final UserFilter filter) {
        return UserFilterDto.builder()
                .userNo(filter.getUserNo())
                .name(filter.getName())
                .age(filter.getAge())
                .type(filter.getType().getUserTypeCd())
                .email(filter.getEmail())
                .lectureNo(filter.getLectureNo())
                .build();
    }
}
