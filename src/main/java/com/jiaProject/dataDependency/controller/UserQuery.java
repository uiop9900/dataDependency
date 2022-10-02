package com.jiaProject.dataDependency.controller;


import lombok.*;
import org.hibernate.usertype.UserType;

@Data
@AllArgsConstructor(staticName = "of")
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class UserQuery {
    private Long userNo; // user의 pk
    private String name; // 이름
    private int age; // 나이
    private UserType type; // 회원,비회원 구분
    private String email; // 이메일
}
