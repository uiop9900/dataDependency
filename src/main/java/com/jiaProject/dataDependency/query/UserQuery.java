package com.jiaProject.dataDependency.query;


import com.jiaProject.dataDependency.entity.User;
import com.jiaProject.dataDependency.enums.UserType;
import lombok.*;

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

//    public static UserQuery of(User user) {
//        return UserQuery.builder()
//                .userNo(user.getUserNo())
//                .name(user.getName())
//                .age(user.getAge())
//                .type(UserType.of(user.getType()))
//                .email(user.getEmail())
//                .build();
//    }
}
