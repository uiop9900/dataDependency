package com.jiaProject.dataDependency.entity;

import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Entity
@Table(name = "LECTURE") @Getter
@DynamicUpdate
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder(builderMethodName = "entityBuilder", toBuilder = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
public class Lecture {

    @Id
    @Column(name = "LECTURE_NO", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long lectureNo; // 강의 pk

    @Column
    private String title; // 강의명

    @Column
    private String teacher; // 강사명

    @Column
    private int price; // 가격

    @Column
    private String room; // 강의실

    //===========연관관계====================
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="LECTURE_USER", insertable = false, updatable = false)
    protected User user;

    //===========Builder====================
    public static LectureBuilder lectureBuilder( //리턴값은 클래스명 + Builer이어야 한다. @Builder로 인해 가능한 메솓,1
        @NonNull String title,
        @NonNull String teacher,
        @NonNull int price,
        @NonNull String room
    ) {
        return entityBuilder() //상단에서 선언한 @builder 때문에 사용가능한 메소드2
                .title(title)
                .teacher(teacher)
                .price(price)
                .room(room);
    }

}
