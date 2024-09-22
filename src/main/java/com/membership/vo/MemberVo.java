package com.membership.vo;

import com.membership.entity.MemberLevel;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * packageName    : com.membership
 * fileName       : MemberVo
 * author         : NAHAEJUN
 * date           : 2024-09-22
 * description    :
 * Member의 VO 클래스
 * @Value를 통해 불변 클래스로 만들수도 있지만
 * 그냥 자체적으로 한번 하나하나 불변객체를 만드는데 필요한 요소를 추가함
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-09-22        NAHAEJUN              최초생성
 */
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@Getter
@Builder
public final class MemberVo {

    @EqualsAndHashCode.Include
    private final String userId;
    @EqualsAndHashCode.Include
    private final String userName;
    @EqualsAndHashCode.Include
    private final String emailAddr;
    @EqualsAndHashCode.Include
    private final String userSex;
    @EqualsAndHashCode.Include
    private final String userYear;
    @EqualsAndHashCode.Include
    private final String phoneNumber;
    @EqualsAndHashCode.Include
    private final String stAddr;
    @EqualsAndHashCode.Include
    private final String emailReceptionStatus;
    @EqualsAndHashCode.Include
    private final String phoneReceptionStatus;
    @EqualsAndHashCode.Include
    @Enumerated(EnumType.STRING)
    private MemberLevel level;

}
