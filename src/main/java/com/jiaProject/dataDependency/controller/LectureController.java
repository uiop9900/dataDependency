package com.jiaProject.dataDependency.controller;

import com.jiaProject.dataDependency.query.GetLecture;
import com.jiaProject.dataDependency.query.LectureInput;
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

        lectureService.insertLecture(input);
        return null;
    }
}

