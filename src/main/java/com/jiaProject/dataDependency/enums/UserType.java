package com.jiaProject.dataDependency.enums;

import com.jiaProject.dataDependency.entity.User;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Objects;

@Getter
@RequiredArgsConstructor
public enum UserType {
    MEMBER(User.UserTypeCd.M0001),
    USER(User.UserTypeCd.M0002);

    private final User.UserTypeCd userTypeCd;

    //entity enum -> Query enum
    public static UserType of(final User.UserTypeCd userTypeCd) {
        if (Objects.isNull(userTypeCd)) {
            return null;
        }
        // Query의 enum과 값을 비교해서 일치시 변환
        for (final UserType value : values()) {
            if (value.getUserTypeCd() == userTypeCd) {
                return value;
            }
        }
        return null;
    }
}
