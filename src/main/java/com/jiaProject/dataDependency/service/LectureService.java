package com.jiaProject.dataDependency.service;

import com.jiaProject.dataDependency.entity.Lecture;
import com.jiaProject.dataDependency.query.LectureQuery;
import com.jiaProject.dataDependency.repository.LectureRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional()
public class LectureService {
    private final LectureRepository lectureRepository;
    public LectureQuery insertLecture(Lecture lecture) {
        //jpa가 lecture를 저장하고 알아서 객체를 update합니다. -> lecture.getLectureNo 가 가능한 이유.
        lectureRepository.save(lecture);
        Lecture savedLecture = lectureRepository.findById(lecture.getLectureNo()).get();
        LectureQuery savedLectureQuery = LectureQuery.of(
                savedLecture.getLectureNo(),
                savedLecture.getTitle(),
                savedLecture.getTeacher(),
                savedLecture.getPrice(),
                savedLecture.getRoom());
        return savedLectureQuery;
    }
}
