package com.jiaProject.dataDependency.query;

import com.jiaProject.dataDependency.dto.UserInputDto;
import com.jiaProject.dataDependency.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.usertype.UserType;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class UserInput {
    private String name;
    private int age;
    private UserType type;
    private String email;

}
