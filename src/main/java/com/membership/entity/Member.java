package com.membership.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

/**
 * packageName    : com.membership.domain
 * fileName       : Member
 * author         : NAHAEJUN
 * date           : 2024-09-01
 * description    : Member Entity
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-09-01        NAHAEJUN              최초생성
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long srNo;

    private String userId;
    private String userPw;
    private String userPwHint;
    private String userName;
    private String emailAddr;
    private String userSex;
    private String userYear;
    private String phoneNumber;
    private String stAddr;
    private String emailReceptionStatus;
    private String phoneReceptionStatus;

    @Enumerated(EnumType.STRING)
    private UserLevel level;

    @CreatedDate
    private LocalDateTime createdDate;
    @LastModifiedDate
    private LocalDateTime lastModifiedDate;
}
