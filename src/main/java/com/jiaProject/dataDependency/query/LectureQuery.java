package com.jiaProject.dataDependency.query;

import lombok.*;

@Data
@AllArgsConstructor(staticName = "of")
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class LectureQuery {
    private Long lectureNo; // 강의 pk
    private String title; // 강의명
    private String teacher; // 강사명
    private int price; // 가격
    private String room; // 강의실
}
