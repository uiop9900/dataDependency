package com.jiaProject.dataDependency.mapper;

import com.jiaProject.dataDependency.entity.Lecture;
import com.jiaProject.dataDependency.query.LectureInput;

public class MapperLectureInput {

    // queyInput -> Entity Lecture
    // 엔티티에서 빌더를 만들었기때문에 아래의 lectureBuilder가 사용가능.
    public static Lecture toEntity(LectureInput input) {
        return Lecture.lectureBuilder(
                    input.getTitle(),
                    input.getTeacher(),
                    input.getPrice(),
                    input.getRoom()
                )
                .build();
    }
}
