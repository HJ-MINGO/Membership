package com.membership.entity;

import com.membership.common.BaseEntity;
import com.membership.util.Message;
import com.membership.vo.MemberVo;
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
@NoArgsConstructor
@Entity
public class Member extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long srNo;
    private String userId;
    private String userPw;
    private String userName;
    private String emailAddr;
    private String userSex;
    private String userYear;
    private String phoneNumber;
    private String stAddr;
    private String emailReceptionStatus;
    private String phoneReceptionStatus;
    @Enumerated(EnumType.STRING)
    private MemberLevel level;

    /**
     * packageName    : com.membership.domain
     * methodName     : Member
     * date           : 2024-09-01
     * description    : Member 클래스 생성자 메서드 정의
     * ===========================================================
     * DATE              AUTHOR             NOTE
     * -----------------------------------------------------------
     * 2024-09-22        NAHAEJUN           최초생성
     */
    public Member (MemberVo memberVo,String userPw) {
        this.userId = memberVo.getUserId();
        this.userPw = userPw;
        this.userName = memberVo.getUserName();
        this.emailAddr = memberVo.getEmailAddr();
        this.userSex = memberVo.getUserSex();
        this.userYear = memberVo.getUserYear();
        this.phoneNumber = memberVo.getPhoneNumber();
        this.stAddr = memberVo.getStAddr();
        this.emailReceptionStatus = memberVo.getEmailReceptionStatus();
        this.phoneReceptionStatus = memberVo.getPhoneNumber();
        this.level = memberVo.getLevel();
    }


    /**
     * methodName     : createMember
     * date           : 2024-09-01
     * description    : 회원 가입 을 실행하는 메서드
     * ===========================================================
     * DATE              AUTHOR             NOTE
     * -----------------------------------------------------------
     * 2024-09-22       NAHAEJUN            최초생성
     */
    public String createMember(Member member){
        return Message.INFO_MSG_001.getMsg();
    }

    /**
     * methodName     : updateMember
     * date           : 2024-09-01
     * description    : 회원정보를 수정하는 메서드
     * ===========================================================
     * DATE              AUTHOR             NOTE
     * -----------------------------------------------------------
     * 2024-09-22       NAHAEJUN            최초생성
     */
    public String updateMember(Member member){
        return Message.INFO_MSG_002.getMsg();
    }

    /**
     * methodName     : deleteMember
     * date           : 2024-09-01
     * description    : 회원 삭제시키는 메서드
     * ===========================================================
     * DATE              AUTHOR             NOTE
     * -----------------------------------------------------------
     * 2024-09-22       NAHAEJUN            최초생성
     */
    public String deleteMember(Member member){
        return Message.INFO_MSG_002.getMsg();
    }
}
