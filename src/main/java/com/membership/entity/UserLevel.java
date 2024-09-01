package com.membership.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * packageName    : com.membership.entity
 * fileName       : UserLevel
 * author         : NAHAEJUN
 * date           : 2024-09-01
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-09-01        NAHAEJUN              최초생성
 */
@AllArgsConstructor
@Getter
public enum UserLevel {
    LEVEL1("01","신입회원")
    , LEVEL2("02","일반회원")
    , LEVEL3("03","VIP회원");

    private final String code;
    private final String cdNm;
}
