package com.jiaProject.dataDependency.controller;

import com.jiaProject.dataDependency.entity.Lecture;
import com.jiaProject.dataDependency.mapper.MapperLectureInput;
import com.jiaProject.dataDependency.query.GetLecture;
import com.jiaProject.dataDependency.query.LectureInput;
import com.jiaProject.dataDependency.query.LectureQuery;
import com.jiaProject.dataDependency.service.LectureService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional()
public class LectureController {

    private final LectureService lectureService;

    /**
     * 강의를 생성합니다.
     */
    public GetLecture insertLecture(final LectureInput input) {
        Lecture lecture = MapperLectureInput.toEntity(input);
        LectureQuery lectureQuery = lectureService.insertLecture(lecture);
        GetLecture getLecture = GetLecture.of(lectureQuery);
        return getLecture;
    }
}

