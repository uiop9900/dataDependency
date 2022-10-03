package com.jiaProject.dataDependency.service;

import com.jiaProject.dataDependency.query.LectureInput;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional()
public class LectureService {
    public void insertLecture(LectureInput input) {
    }
}
