package com.jiaProject.dataDependency.query;

import com.jiaProject.dataDependency.entity.User;
import com.jiaProject.dataDependency.enums.UserType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class UserInput {
    private String name;
    private int age;
    private UserType type;
    private String email;

    public static User toEntity(UserInput input) {
        return User.userBuilder(
                input.getName(),
                input.getAge(),
                input.getType().getUserTypeCd(),
                input.getEmail()
                )
                .build();
    }
}
