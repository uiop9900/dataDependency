package com.jiaProject.dataDependency.query;

import com.jiaProject.dataDependency.dto.UserInputDto;
import com.jiaProject.dataDependency.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.usertype.UserType;

import javax.persistence.Column;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class LectureInput {
    private String title; // 강의명
    private String teacher; // 강사명
    private int price; // 가격
    private String room; // 강의실

}
