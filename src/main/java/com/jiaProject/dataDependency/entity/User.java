package com.jiaProject.dataDependency.entity;

import com.sun.istack.NotNull;
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "LECTURE_USER") @Getter
@DynamicUpdate
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder(builderMethodName = "entityBuilder", toBuilder = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
public class User {

    @Id
    @Column(name = "USER_NO", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long userNo; // user의 pk

    @Column
    private String name; // 이름

    @Column
    private int age; // 나이

    @Column
    private UserTypeCd type; // 회원,비회원 구분

    @Column
    private String email; // 이메일

    //==============연관관계====================
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    @Setter @Builder.Default
    private List<Lecture> lectures = new ArrayList<>();

    //==============enum====================
    @Getter
    @AllArgsConstructor
    public enum UserTypeCd {
        /** 회원 */
        M0001,
        /** 비회원 */
        M0002;

        public static final String USER_TYPE_CD = "USER_TYPE_CD";

        public static UserTypeCd getMemberCd() {
            return M0001;
        }

        public static UserTypeCd getUserCd() {
            return M0002;
        }
    }

    //===========Builder====================
    // 리턴값은 클래스명 + Builer이어야 한다. @Builder로 인해 가능한 메소드
    public static UserBuilder lectureUserBuilder(
                                          @NotNull final String name,
                                          @NotNull final int age,
                                          @NotNull final UserTypeCd type,
                                          @NotNull final String email
    ) {
        return entityBuilder() //상단에서 선언한 @builder 때문에 사용가능한 메소드2
                .name(name)
                .age(age)
                .type(type)
                .email(email);
    }

}
