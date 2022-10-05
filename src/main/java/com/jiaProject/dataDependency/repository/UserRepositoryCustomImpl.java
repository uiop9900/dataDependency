package com.jiaProject.dataDependency.repository;

import com.jiaProject.dataDependency.controller.UserFilterDto;
import com.jiaProject.dataDependency.dto.UserDto;
import com.jiaProject.dataDependency.entity.QUser;
import com.jiaProject.dataDependency.entity.User;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.jiaProject.dataDependency.entity.QLecture.lecture;
import static com.jiaProject.dataDependency.entity.QUser.user;

@Slf4j
@Repository
public class UserRepositoryCustomImpl implements UserRepositoryCustom {

    private JPAQueryFactory queryFactory;
    @Override
    public List<UserDto> findUsersByFilter(UserFilterDto userFilterDto) {
        return queryFactory.selectFrom(user)
                .leftJoin(lecture)
                .on(user.lectures.contains(userFilterDto.getLectureNo()))
                .where(
                        user.userNo.eq(userFilterDto.getUserNo())
                                .or(user.name.eq(userFilterDto.getName()))
                                .or(user.age.eq(userFilterDto.getAge()))
                                .or(user.type.eq(User.UserTypeCd.getUserCd()))
                                .or(user.email.eq(userFilterDto.getEmail()))
                                .

                )
    }
}
